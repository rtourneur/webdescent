package com.raf.descent.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.raf.descent.jpa.domain.AbstractIconEntity;

/**
 * The persistent class for the ATTRIBUTE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "ATTRIBUTE", schema = "DESCENT")
public class Attribute extends AbstractIconEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -2193349788583866682L;

  /**
   * Constructor.
   */
  public Attribute() {
    super();
  }

}
