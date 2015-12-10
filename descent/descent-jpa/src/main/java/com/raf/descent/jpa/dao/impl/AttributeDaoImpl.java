package com.raf.descent.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.AttributeDao;
import com.raf.descent.jpa.domain.model.Attribute;

/**
 * Implementation DAO for {@link Attribute}.
 * 
 * @author RAF
 */
@Repository
public final class AttributeDaoImpl extends AbstractNamedDao<Attribute, String> implements AttributeDao {

  /**
   * Constructor.
   */
  public AttributeDaoImpl() {
    super(Attribute.class);
  }

}
