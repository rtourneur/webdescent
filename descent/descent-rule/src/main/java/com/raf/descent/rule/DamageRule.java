package com.raf.descent.rule;

import com.raf.descent.rule.model.Damages;

/**
 * Rule interface for calculing damages.
 * 
 * @author RAF
 */
public interface DamageRule {

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
   */
  Damages getDamages(String monster, String expansion, String act, String type);
}
