package com.raf.descent.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.raf.descent.jpa.domain.AbstractIconEntity;

/**
 * The persistent class for the EXPANSION database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "EXPANSION", schema = "DESCENT")
public class Expansion extends AbstractIconEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -7278035123105018833L;

  /**
   * Constructor.
   */
  public Expansion() {
    super();
  }

}
