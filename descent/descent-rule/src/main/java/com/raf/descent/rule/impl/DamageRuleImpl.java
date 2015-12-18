package com.raf.descent.rule.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.raf.descent.jpa.dao.MonsterStatDao;
import com.raf.descent.jpa.domain.card.MonsterAttack;
import com.raf.descent.jpa.domain.card.MonsterStat;
import com.raf.descent.jpa.domain.card.MonsterSurge;
import com.raf.descent.jpa.domain.model.Dice;
import com.raf.descent.jpa.domain.model.DiceSide;
import com.raf.descent.jpa.domain.model.Surge;
import com.raf.descent.rule.DamageRule;
import com.raf.descent.rule.model.Damages;
import com.raf.descent.util.Loggable;

/**
 * Rule for calculing damages.
 * 
 * @author RAF
 */
@Service
public final class DamageRuleImpl implements DamageRule {

  /** Logger. */
  private static final Logger LOGGER = LoggerFactory.getLogger(DamageRule.class);

  /** The monster stat dao. */
  @Resource
  private transient MonsterStatDao monsterStatDao;

  /**
   * Constructor.
   */
  public DamageRuleImpl() {
    super();
  }

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
      final List<MonsterAttack> attacks = monsterStat.getAttacks();
      final List<Dice> dices = new ArrayList<Dice>(attacks.size());
      for (final MonsterAttack attack : attacks) {
        dices.add(attack.getDice());
      }
      final List<MonsterSurge> monsterSurges = monsterStat.getSurges();
      final List<Surge> surges = new ArrayList<Surge>(monsterSurges.size());
      Surge surge;
      for (final MonsterSurge monsterSurge : monsterSurges) {
        surge = monsterSurge.getSurge();
        if (surge.getDamage() != null && surge.getDamage().intValue() > 0) {
          surges.add(surge);
        }
      }
      damages = calcul(dices, surges);
    }
    return damages;
  }

  /**
   * Calculates the damages from list of dices and list of surges.
   * 
   * @param dices
   *          the list of dices
   * @param surges
   *          the list of surges
   * @return the damages
   */
  private Damages calcul(final List<Dice> dices, final List<Surge> surges) {
    final Dice dice = dices.get(0);
    int[] damageSurge;
    List<Dice> subDices;
    final List<int[]> damages = new ArrayList<int[]>((int) Math.pow(6, dices.size()));
    for (final DiceSide diceSide : dice.getDiceSides()) {
      damageSurge = getSideValue(diceSide);
      subDices = dices.subList(1, dices.size());
      if (subDices.isEmpty()) {
        LOGGER.info("Adding damages" + damageSurge[0] + " surges " + damageSurge[1]);
        damages.add(damageSurge);
      } else {
        damages.addAll(calculDices(subDices, damageSurge, diceSide.getMiss()));
      }

    }
    for (final int[] damage : damages) {
      LOGGER.info("Calculing surges damages " + damage[0] + " surges " + damage[1]);
      calculSurge(damage, surges);
    }
    final Damages result = new Damages();
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
   * @return the list of damages
   */
  private List<int[]> calculDices(final List<Dice> dices, final int[] damageSurgePrev, final Boolean miss) {
    final Dice dice = dices.get(0);
    int[] damageSurge;
    List<Dice> subDices;
    final List<int[]> damages = new ArrayList<int[]>();
    for (final DiceSide diceSide : dice.getDiceSides()) {
      damageSurge = getSideValue(diceSide, damageSurgePrev, miss);
      subDices = dices.subList(1, dices.size());
      if (subDices.isEmpty()) {
        LOGGER.info("Adding damages " + damageSurge[0] + " surges " + damageSurge[1]);
        damages.add(damageSurge);
      } else {
        damages.addAll(calculDices(subDices, damageSurge, miss));
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
  private int[] getSideValue(final DiceSide diceSide) {
    return getSideValue(diceSide, new int[2], null);
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
  private int[] getSideValue(final DiceSide diceSide, final int[] damageSurgePrev, final Boolean miss) {
    int[] damageSurge;
    damageSurge = new int[2];
    if (Boolean.TRUE.equals(miss)) {
      damageSurge[0] = damageSurgePrev[0];
      damageSurge[1] = damageSurgePrev[1];
    } else {
      damageSurge[0] = getValue(diceSide.getHeart()) + damageSurgePrev[0];
      damageSurge[1] = getValue(diceSide.getSurge()) + damageSurgePrev[1];
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
    int value;
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
   * @param surges
   *          the list of surges
   */
  private void calculSurge(final int[] damage, final List<Surge> surges) {
    if (damage[1] != 0) {
      final int surgeCount = damage[1];
      int augment = 0;
      int index = -1;
      int cursor = 0;
      for (final Surge surge : surges) {
        if (surge.getSurgeCount().intValue() <= surgeCount && surge.getDamage().intValue() > augment) {
          augment = surge.getDamage().intValue();
          index = cursor;
        }
        cursor++;
      }
      if (index >= 0) {
        final Surge surge = surges.get(index);
        damage[0] = damage[0] + surge.getDamage().intValue();
        damage[1] = damage[1] - surge.getSurgeCount().intValue();
        LOGGER.info("Surge damages " + damage[0] + " surges " + damage[1]);
        if (damage[1] > 0 && surges.size() > 1) {
          final List<Surge> subList = new ArrayList<Surge>(surges);
          Collections.copy(subList, surges);
          subList.remove(surge);
          calculSurge(damage, subList);
        }
      }
    }

  }

}
