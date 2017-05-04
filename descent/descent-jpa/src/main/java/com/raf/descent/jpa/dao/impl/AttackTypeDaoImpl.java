package com.raf.descent.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.AttackTypeDao;
import com.raf.descent.jpa.domain.model.AttackType;
import com.raf.fwk.jpa.dao.AbstractNamedDao;

/**
 * Implementation DAO for {@link AttackType}.
 * 
 * @author RAF
 */
@Repository
public final class AttackTypeDaoImpl extends AbstractNamedDao<AttackType> implements AttackTypeDao {

  /**
   * Constructor.
   */
  public AttackTypeDaoImpl() {
    super(AttackType.class);
  }

}
