package com.raf.descent.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.MonsterTypeDao;
import com.raf.descent.jpa.domain.model.MonsterType;

/**
 * Implementation DAO for {@link MonsterType}.
 * 
 * @author RAF
 */
@Repository
public final class MonsterTypeDaoImpl extends AbstractNamedDao<MonsterType, String> implements MonsterTypeDao {

  /**
   * Constructor.
   */
  public MonsterTypeDaoImpl() {
    super(MonsterType.class);
  }

}
