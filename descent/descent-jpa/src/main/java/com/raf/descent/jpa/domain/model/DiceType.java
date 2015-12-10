package com.raf.descent.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.raf.descent.jpa.domain.AbstractNamedEntity;

/**
 * The persistent class for the DICE_TYPE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "DICE_TYPE", schema = "DESCENT")
public class DiceType extends AbstractNamedEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -6908004875964809128L;

  /**
   * Constructor.
   */
  public DiceType() {
    super();
  }
}
