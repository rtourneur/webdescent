package com.raf.descent.jpa.domain.card;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the MONSTER_ATTACK database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "MONSTER_ATTACK", schema = "DESCENT")
public class MonsterAttack extends MonsterStatDice {

  /** Serial UID. */
  private static final long serialVersionUID = 8307485786112249702L;

  /**
   * Constructor.
   */
  public MonsterAttack() {
    super();
  }

}
