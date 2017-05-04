package com.raf.descent.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.MonsterTraitDao;
import com.raf.descent.jpa.domain.model.MonsterTrait;
import com.raf.fwk.jpa.dao.AbstractNamedDao;

/**
 * Implementation DAO for {@link MonsterTrait}.
 * 
 * @author RAF
 */
@Repository
public final class MonsterTraitDaoImpl extends AbstractNamedDao<MonsterTrait> implements MonsterTraitDao {

  /**
   * Constructor.
   */
  public MonsterTraitDaoImpl() {
    super(MonsterTrait.class);
  }

}
