package com.raf.descent.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.raf.descent.jpa.domain.AbstractNamedEntity;

/**
 * The persistent class for the MONSTER_SIZE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "MONSTER_SIZE", schema = "DESCENT")
public class MonsterSize extends AbstractNamedEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -7552965610430813095L;

  /**
   * Constructor.
   */
  public MonsterSize() {
    super();
  }

}
