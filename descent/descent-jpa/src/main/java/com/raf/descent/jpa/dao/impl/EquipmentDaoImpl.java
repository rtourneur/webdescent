package com.raf.descent.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.EquipmentDao;
import com.raf.descent.jpa.domain.model.Equipment;
import com.raf.fwk.jpa.dao.AbstractNamedDao;

/**
 * Implementation DAO for {@link Equipment}.
 * 
 * @author RAF
 */
@Repository
public final class EquipmentDaoImpl extends AbstractNamedDao<Equipment> implements EquipmentDao {

  /**
   * Constructor.
   */
  public EquipmentDaoImpl() {
    super(Equipment.class);
  }

}
