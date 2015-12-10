package com.raf.descent.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.raf.descent.jpa.domain.AbstractNamedEntity;

/**
 * The persistent class for the TRAIT database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "TRAIT", schema = "DESCENT")
public class Trait extends AbstractNamedEntity {

  /** Serial UID. */
  private static final long serialVersionUID = 6989805637120232263L;

  /**
   * Constructor.
   */
  public Trait() {
    super();
  }

}
