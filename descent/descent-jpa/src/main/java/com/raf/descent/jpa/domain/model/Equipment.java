package com.raf.descent.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.raf.fwk.jpa.domain.AbstractIconEntity;


/**
 * The persistent class for the EQUIPMENT database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "EQUIPMENT", schema = "DESCENT")
public class Equipment extends AbstractIconEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -7248230614694065631L;

  /**
   * Constructor.
   */
  public Equipment() {
    super();
  }

}
