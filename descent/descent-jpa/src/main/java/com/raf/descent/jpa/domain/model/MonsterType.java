package com.raf.descent.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.raf.descent.jpa.domain.AbstractNamedEntity;

/**
 * The persistent class for the MONSTER_TYPE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "MONSTER_TYPE", schema = "DESCENT")
public class MonsterType extends AbstractNamedEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -7885222402948786458L;

  /**
   * Constructor.
   */
  public MonsterType() {
    super();
  }

}
