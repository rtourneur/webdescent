package com.raf.descent.jpa.domain.card;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the MONSTER_DEFENSE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "MONSTER_DEFENSE", schema = "DESCENT")
public class MonsterDefense extends MonsterStatDice {

  /** Serial UID. */
  private static final long serialVersionUID = 5406627192164415983L;

  /**
   * Constructor.
   */
  public MonsterDefense() {
    super();
  }

}
