package com.raf.descent.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.ItemTypeDao;
import com.raf.descent.jpa.domain.model.ItemType;
import com.raf.fwk.jpa.dao.AbstractNamedDao;

/**
 * Implementation DAO for {@link ItemType}.
 * 
 * @author RAF
 */
@Repository
public final class ItemTypeDaoImpl extends AbstractNamedDao<ItemType> implements ItemTypeDao {

  /**
   * Constructor.
   */
  public ItemTypeDaoImpl() {
    super(ItemType.class);
  }

}
