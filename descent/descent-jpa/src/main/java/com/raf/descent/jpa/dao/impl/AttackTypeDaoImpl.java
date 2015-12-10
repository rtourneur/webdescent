package com.raf.descent.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.AttackTypeDao;
import com.raf.descent.jpa.domain.model.AttackType;

/**
 * Implementation DAO for {@link AttackType}.
 * 
 * @author RAF
 */
@Repository
public final class AttackTypeDaoImpl extends AbstractNamedDao<AttackType, String> implements AttackTypeDao {

  /**
   * Constructor.
   */
  public AttackTypeDaoImpl() {
    super(AttackType.class);
  }

}
