package com.raf.descent.rule.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

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

  private Damages calcul(final List<Dice> dices, final List<Surge> surges) {

    final Dice dice = dices.get(0);
    Integer[] damageSurge;
    List<Dice> subDices;
    final List<Integer[]> damages = new ArrayList<Integer[]>();
    for (final DiceSide diceSide : dice.getDiceSides()) {
      damageSurge = new Integer[2];
      damageSurge[0] = diceSide.getHeart();
      damageSurge[1] = diceSide.getSurge();
      subDices = dices.subList(1, dices.size());
      if (subDices.isEmpty()) {
        damages.add(damageSurge);
      } else {
        damages.addAll(calculDices(subDices, damageSurge, diceSide.getMiss()));
      }

    }
    for (Integer[] damage : damages) {
      calculSurge(damage, surges);
    }
    return null;
  }

  private List<Integer[]> calculDices(final List<Dice> dices, final Integer[] damageSurgePrev, final Boolean miss) {
    final Dice dice = dices.get(0);
    Integer[] damageSurge;
    List<Dice> subDices;
    final List<Integer[]> damages = new ArrayList<Integer[]>();
    for (final DiceSide diceSide : dice.getDiceSides()) {
      damageSurge = new Integer[2];
      if (Boolean.TRUE.equals(miss)) {
        damageSurge[0] = damageSurgePrev[0];
        damageSurge[1] = damageSurgePrev[1];
      } else {
        damageSurge[0] = diceSide.getHeart() + damageSurgePrev[0];
        damageSurge[1] = diceSide.getSurge() + damageSurgePrev[1];
      }
      subDices = dices.subList(1, dices.size());
      if (subDices.isEmpty()) {
        damages.add(damageSurge);
      } else {
        damages.addAll(calculDices(subDices, damageSurge, miss));
      }
    }
    return damages;
  }

  private void calculSurge(Integer[] damage, List<Surge> surges) {
    // TODO Auto-generated method stub
    
  }

}
