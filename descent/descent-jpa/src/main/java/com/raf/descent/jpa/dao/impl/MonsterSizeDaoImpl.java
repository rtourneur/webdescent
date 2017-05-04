package com.raf.descent.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.MonsterSizeDao;
import com.raf.descent.jpa.domain.model.MonsterSize;
import com.raf.fwk.jpa.dao.AbstractNamedDao;

/**
 * Implementation DAO for {@link MonsterSize}.
 * 
 * @author RAF
 */
@Repository
public final class MonsterSizeDaoImpl extends AbstractNamedDao<MonsterSize> implements MonsterSizeDao {

  /**
   * Constructor.
   */
  public MonsterSizeDaoImpl() {
    super(MonsterSize.class);
  }

}
