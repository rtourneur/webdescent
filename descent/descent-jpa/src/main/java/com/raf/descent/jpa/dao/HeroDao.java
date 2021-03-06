package com.raf.descent.jpa.dao;

import com.raf.descent.jpa.domain.card.Hero;
import com.raf.descent.jpa.domain.model.NameExpansionPk;
import com.raf.fwk.jpa.dao.EntityDao;

/**
 * Interface DAO for {@link Hero}.
 * 
 * @author RAF
 */
public interface HeroDao extends EntityDao<Hero, NameExpansionPk> {
  // RAS
}
