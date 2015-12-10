package com.raf.descent.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.raf.descent.jpa.domain.AbstractNamedEntity;

/**
 * The persistent class for the ITEM_TYPE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "ITEM_TYPE", schema = "DESCENT")
public class ItemType extends AbstractNamedEntity {

  /** Serial UID. */
  private static final long serialVersionUID = 4637860278006269029L;

  /**
   * Constructor.
   */
  public ItemType() {
    super();
  }

}
