package com.raf.descent.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.DiceTypeDao;
import com.raf.descent.jpa.domain.model.DiceType;
import com.raf.fwk.jpa.dao.AbstractNamedDao;

/**
 * Implementation DAO for {@link DiceType}.
 * 
 * @author RAF
 */
@Repository
public final class DiceTypeDaoImpl extends AbstractNamedDao<DiceType> implements DiceTypeDao {

  /**
   * Constructor.
   */
  public DiceTypeDaoImpl() {
    super(DiceType.class);
  }

}
