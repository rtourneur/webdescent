package com.raf.descent.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.ExpansionDao;
import com.raf.descent.jpa.domain.model.Expansion;

/**
 * Implementation DAO for {@link Expansion}.
 * 
 * @author RAF
 */
@Repository
public final class ExpansionDaoImpl extends AbstractNamedDao<Expansion, String> implements ExpansionDao {

  /**
   * Constructor.
   */
  public ExpansionDaoImpl() {
    super(Expansion.class);
  }

}
