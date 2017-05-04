package com.raf.descent.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.AttributeDao;
import com.raf.descent.jpa.domain.model.Attribute;
import com.raf.fwk.jpa.dao.AbstractNamedDao;

/**
 * Implementation DAO for {@link Attribute}.
 * 
 * @author RAF
 */
@Repository
public final class AttributeDaoImpl extends AbstractNamedDao<Attribute> implements AttributeDao {

  /**
   * Constructor.
   */
  public AttributeDaoImpl() {
    super(Attribute.class);
  }

}
