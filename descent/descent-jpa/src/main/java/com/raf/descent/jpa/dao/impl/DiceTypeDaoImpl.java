package com.raf.descent.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.DiceTypeDao;
import com.raf.descent.jpa.domain.model.DiceType;

/**
 * Implementation DAO for {@link DiceTypeImpl}.
 * 
 * @author RAF
 */
@Repository
public final class DiceTypeDaoImpl extends AbstractNamedDao<DiceType, String> implements DiceTypeDao {

  /**
   * Constructor.
   */
  public DiceTypeDaoImpl() {
    super(DiceType.class);
  }

}
