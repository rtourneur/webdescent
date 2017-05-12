package com.raf.descent.rule.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.raf.descent.jpa.dao.MonsterStatDao;
import com.raf.descent.jpa.domain.card.MonsterStat;
import com.raf.descent.jpa.domain.card.MonsterSurge;
import com.raf.descent.jpa.domain.model.AttackType;
import com.raf.descent.jpa.domain.model.Dice;
import com.raf.descent.jpa.domain.model.DiceSide;
import com.raf.descent.jpa.domain.model.StatDice;
import com.raf.descent.jpa.domain.model.Surge;
import com.raf.descent.rule.DamageRule;
import com.raf.descent.rule.model.DamageValue;
import com.raf.descent.rule.model.Damages;
import com.raf.fwk.util.aop.Loggable;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Rule for calculing damages.
 * 
 * @author RAF
 */
@Slf4j
@NoArgsConstructor
@Service
public final class DamageRuleImpl implements DamageRule {

  /** The monster stat dao. */
  @Resource
  private transient MonsterStatDao monsterStatDao;

  /**
   * Calcul and returns the damages for a monster.
   * 
   * @param monster
   *          the monster
   * @param expansion
   *          the expansion
   * @param act
   *          the act
   * @param type
   *          the type
   * @return the damages
   * @see DamageRule#getDamages(String, String, String, String)
   */
  @Override
  @Transactional
  @Loggable
  public Damages getDamages(final String monster, final String expansion, final String act, final String type) {
    final MonsterStat monsterStat = this.monsterStatDao.getMonsterStat(monster, expansion, act, type);
    Damages damages = null;
    if (monsterStat != null) {
      log.info("Calculing damages for monster {}", monsterStat);
      final AttackType attackType = monsterStat.getMonsterGroup().getAttackType();
      final boolean ranged = "Ranged".equals(attackType.getName());
      final List<StatDice> attacks = monsterStat.getAttackDices();
      final List<Dice> dices = new ArrayList<>(attacks.size());
      for (final StatDice attack : attacks) {
        log.debug("Adding attack dice {}", attack.getDice());
        dices.add(attack.getDice());
      }
      final List<MonsterSurge> monsterSurges = monsterStat.getSurges();
      final List<Surge> damageSurges = new ArrayList<>(monsterSurges.size());
      final List<Surge> rangeSurges = new ArrayList<>(monsterSurges.size());
      Surge surge;
      for (final MonsterSurge monsterSurge : monsterSurges) {
        surge = monsterSurge.getSurge();
        if (surge.getDamage() != null && surge.getDamage().intValue() > 0) {
          log.debug("Adding damage surge {}", surge);
          damageSurges.add(surge);
        } else if (ranged && surge.getRange() != null && surge.getRange().intValue() > 0) {
          log.debug("Adding range surge {}", surge);
          rangeSurges.add(surge);
        }
      }
      damages = calcul(dices, damageSurges, rangeSurges, ranged);
    }
    log.info("Damages calculed {}", damages);
    return damages;
  }

  /**
   * Calculates the damages from list of dices and list of surges.
   * 
   * @param dices
   *          the list of dices
   * @param damageSurges
   *          the list of damages surges
   * @param rangeSurges
   *          the list of range surges
   * @param ranged
   *          the ranged indicator
   * @return the damages
   */
  private Damages calcul(final List<Dice> dices, final List<Surge> damageSurges, final List<Surge> rangeSurges,
      final boolean ranged) {
    final Dice dice = dices.get(0);
    String diceName;
    DamageValue damageSurge;
    List<Dice> subDices;
    final List<DamageValue> damages = new ArrayList<>((int) Math.pow(6, dices.size()));
    for (final DiceSide diceSide : dice.getDiceSides()) {
      diceName = dice.getName() + '-' + diceSide.getSide();
      damageSurge = getSideValue(diceSide);
      subDices = dices.subList(1, dices.size());
      if (subDices.isEmpty()) {
        log.debug("Adding damages {} for dice {}", damageSurge, diceName);
        damages.add(damageSurge);
      } else {
        damages.addAll(calculDices(subDices, damageSurge, diceSide.getMiss(), diceName));
      }

    }
    for (final DamageValue damageValue : damages) {
      log.debug("Calculing surges damages {}", damageValue);
      calculDamageSurge(damageValue, damageSurges);
      if (ranged) {
        log.debug("Calculing surges range {}", damageValue);
        calculRangeSurge(damageValue, rangeSurges);
      }
    }
    final Damages result = new Damages();
    result.setRanged(ranged);
    result.setValues(damages);
    return result;
  }

  /**
   * Calculates the augments of damages from the dices.
   * 
   * @param dices
   *          the list of dices
   * @param damageSurgePrev
   *          the previous damages
   * @param miss
   *          the miss indicator
   * @param diceNames
   *          the dice names
   * @return the list of damages
   */
  private List<DamageValue> calculDices(final List<Dice> dices, final DamageValue damageSurgePrev, final Boolean miss,
      final String diceNames) {
    final Dice dice = dices.get(0);
    String diceName;
    DamageValue damageSurge;
    List<Dice> subDices;
    final List<DamageValue> damages = new ArrayList<>();
    for (final DiceSide diceSide : dice.getDiceSides()) {
      diceName = diceNames + ' ' + dice.getName() + '-' + diceSide.getSide();
      damageSurge = getSideValue(diceSide, damageSurgePrev, miss);
      subDices = dices.subList(1, dices.size());
      if (subDices.isEmpty()) {
        log.debug("Adding damages {} for dice {}", damageSurge, diceName);
        damages.add(damageSurge);
      } else {
        damages.addAll(calculDices(subDices, damageSurge, miss, diceName));
      }
    }
    return damages;
  }

  /**
   * Returns the side values for damages and surges.
   * 
   * @param diceSide
   *          the dice side
   * @return the side values
   */
  private DamageValue getSideValue(final DiceSide diceSide) {
    return getSideValue(diceSide, new DamageValue(), null);
  }

  /**
   * Returns the side values for damages and surges, with previous damages augment.
   * 
   * @param diceSide
   *          the dice side
   * @param damageSurgePrev
   *          the previous damages
   * @param miss
   *          the miss indicator
   * @return the side values
   */
  private DamageValue getSideValue(final DiceSide diceSide, final DamageValue damageSurgePrev, final Boolean miss) {
    final DamageValue damageSurge = new DamageValue();
    if (Boolean.TRUE.equals(miss)) {
      damageSurge.setDamage(damageSurgePrev.getDamage());
      damageSurge.setRange(damageSurgePrev.getRange());
      damageSurge.setSurge(damageSurgePrev.getSurge());
      damageSurge.setMiss(true);
    } else {
      damageSurge.setDamage(getValue(diceSide.getHeart()) + damageSurgePrev.getDamage());
      damageSurge.setRange(getValue(diceSide.getRange()) + damageSurgePrev.getRange());
      damageSurge.setSurge(getValue(diceSide.getSurge()) + damageSurgePrev.getSurge());
    }
    return damageSurge;
  }

  /**
   * Return the value from the integer, or <code>0</code> if null.
   * 
   * @param integer
   *          the integer
   * @return the value from the integer, or <code>0</code> if null
   */
  private int getValue(final Integer integer) {
    final int value;
    if (integer == null) {
      value = 0;
    } else {
      value = integer.intValue();
    }
    return value;
  }

  /**
   * Caculate the damage augment from the list of surges.
   * 
   * @param damage
   *          the damage
   * @param damageSurges
   *          the list of damage surges
   */
  private void calculDamageSurge(final DamageValue damage, final List<Surge> damageSurges) {
    if (damage.getSurge() != 0) {
      final int surgeCount = damage.getSurge();
      int augment = 0;
      int index = -1;
      int cursor = 0;
      for (final Surge surge : damageSurges) {
        if (surge.getSurgeCount().intValue() <= surgeCount && surge.getDamage() != null
            && surge.getDamage().intValue() > augment) {
          augment = surge.getDamage().intValue();
          index = cursor;
        }
        cursor++;
      }
      if (index >= 0) {
        final Surge surge = damageSurges.get(index);
        damage.setDamage(damage.getDamage() + surge.getDamage().intValue());
        damage.setSurge(damage.getSurge() - surge.getSurgeCount().intValue());
        log.debug("Surge damages {} ", damage);
        if (damage.getSurge() > 0 && damageSurges.size() > 1) {
          final List<Surge> subList = new ArrayList<>(damageSurges);
          Collections.copy(subList, damageSurges);
          subList.remove(surge);
          calculDamageSurge(damage, subList);
        }
      }
    }
  }

  /**
   * Caculate the range augment from the list of surges.
   * 
   * @param damage
   *          the damage
   * @param rangeSurges
   *          the list of range surges
   */
  private void calculRangeSurge(final DamageValue damage, final List<Surge> rangeSurges) {
    if (damage.getSurge() != 0) {
      final int surgeCount = damage.getSurge();
      int augment = 0;
      int index = -1;
      int cursor = 0;
      for (final Surge surge : rangeSurges) {
        if (surge.getSurgeCount().intValue() <= surgeCount && surge.getRange() != null
            && surge.getRange().intValue() > augment) {
          augment = surge.getRange().intValue();
          index = cursor;
        }
        cursor++;
      }
      if (index >= 0) {
        final Surge surge = rangeSurges.get(index);
        damage.setRange(damage.getRange() + surge.getRange().intValue());
        damage.setSurge(damage.getSurge() - surge.getSurgeCount().intValue());
        log.debug("Surge range {} ", damage);
        if (damage.getSurge() > 0 && rangeSurges.size() > 1) {
          final List<Surge> subList = new ArrayList<>(rangeSurges);
          Collections.copy(subList, rangeSurges);
          subList.remove(surge);
          calculRangeSurge(damage, subList);
        }
      }
    }
  }
}
