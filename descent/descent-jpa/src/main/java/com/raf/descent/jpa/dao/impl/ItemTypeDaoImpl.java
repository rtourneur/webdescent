package com.raf.descent.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.ItemTypeDao;
import com.raf.descent.jpa.domain.model.ItemType;

/**
 * Implementation DAO for {@link ItemType}.
 * 
 * @author RAF
 */
@Repository
public final class ItemTypeDaoImpl extends AbstractNamedDao<ItemType, String> implements ItemTypeDao {

  /**
   * Constructor.
   */
  public ItemTypeDaoImpl() {
    super(ItemType.class);
  }

}
