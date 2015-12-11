package com.raf.descent.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.MonsterTraitDao;
import com.raf.descent.jpa.domain.model.MonsterTrait;

/**
 * Implementation DAO for {@link MonsterTrait}.
 * 
 * @author RAF
 */
@Repository
public final class MonsterTraitDaoImpl extends AbstractNamedDao<MonsterTrait, String> implements MonsterTraitDao {

  /**
   * Constructor.
   */
  public MonsterTraitDaoImpl() {
    super(MonsterTrait.class);
  }

}
