package com.raf.descent.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.TraitDao;
import com.raf.descent.jpa.domain.model.Trait;
import com.raf.fwk.jpa.dao.AbstractNamedDao;

/**
 * Implementation DAO for {@link Trait}.
 * 
 * @author RAF
 */
@Repository
public final class TraitDaoImpl extends AbstractNamedDao<Trait> implements TraitDao {

  /**
   * Constructor.
   */
  public TraitDaoImpl() {
    super(Trait.class);
  }

}
