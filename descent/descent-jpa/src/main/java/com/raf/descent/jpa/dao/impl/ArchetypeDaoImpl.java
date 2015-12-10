package com.raf.descent.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.ArchetypeDao;
import com.raf.descent.jpa.domain.model.Archetype;

/**
 * Implementation DAO for {@link Archetype}.
 * 
 * @author RAF
 */
@Repository
public final class ArchetypeDaoImpl extends AbstractNamedDao<Archetype, String> implements ArchetypeDao {

  /**
   * Constructor.
   */
  public ArchetypeDaoImpl() {
    super(Archetype.class);
  }

}
