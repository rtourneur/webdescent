package com.raf.descent.jpa.dao;

import com.raf.descent.jpa.domain.card.MonsterStat;
import com.raf.fwk.jpa.dao.EntityIdDao;

/**
 * Interface DAO for {@link MonsterStat}.
 * 
 * @author RAF
 */
public interface MonsterStatDao extends EntityIdDao<MonsterStat> {

  /**
   * Returns the monster stat.
   * 
   * @param monster
   *          the monster
   * @param expansion
   *          the expansion
   * @param act
   *          the act
   * @param type
   *          the type
   * @return the monster stat
   */
  MonsterStat getMonsterStat(String monster, String expansion, String act, String type);

}
