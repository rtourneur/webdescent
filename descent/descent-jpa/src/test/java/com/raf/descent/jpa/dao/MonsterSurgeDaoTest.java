package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.card.MonsterStat;
import com.raf.descent.jpa.domain.card.MonsterStatPk;
import com.raf.descent.jpa.domain.card.MonsterSurge;
import com.raf.descent.jpa.domain.card.MonsterSurgePk;
import com.raf.descent.jpa.domain.model.Surge;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link MonsterSurgeDao}.
 * 
 * @author RAF
 */
public class MonsterSurgeDaoTest extends AbstractDaoTest {

  @Resource
  private MonsterSurgeDao monsterSurgeDao;

  @Resource
  private MonsterStatDao monsterStatDao;

  /**
   * Test method for {@link MonsterSurgeDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    MonsterSurgePk monsterSurgePk = new MonsterSurgePk();
    monsterSurgePk.setName("Flesh Moulders");
    monsterSurgePk.setExpansionName("D2E");
    monsterSurgePk.setActName("Act1");
    monsterSurgePk.setMonsterTypeName("Master");
    monsterSurgePk.setSurge(Integer.valueOf(29));
    monsterSurgePk.setIndex(Integer.valueOf(2));
    MonsterSurge example = this.monsterSurgeDao.getById(monsterSurgePk);
    assertNotNull(example);
    assertEquals(monsterSurgePk, example.getId());
    assertEquals("Flesh Moulders", example.getIdent().getName());
    assertEquals("Flesh Moulders", example.getMonsterGroupName());
    assertEquals("D2E", example.getIdent().getExpansionName());
    assertEquals("D2E", example.getExpansionName());
    assertEquals("Act1", example.getIdent().getActName());
    assertEquals("Act1", example.getActName());
    assertEquals("Master", example.getIdent().getMonsterTypeName());
    assertEquals("Master", example.getMonsterTypeName());
    assertEquals(Integer.valueOf(29), example.getIdent().getSurge());
    assertEquals(Integer.valueOf(29), example.getSurgeId());
    assertEquals(Integer.valueOf(2), example.getIdent().getIndex());
    assertEquals(Integer.valueOf(2), example.getIndex());
    MonsterStat monsterStat = example.getMonsterStat();
    assertNotNull(monsterStat);
    assertEquals("Flesh Moulders", monsterStat.getMonsterGroupName());
    assertEquals("D2E", monsterStat.getExpansionName());
    assertEquals("Act1", monsterStat.getActName());
    assertEquals("Master", monsterStat.getMonsterTypeName());
    Surge surge = example.getSurge();
    assertNotNull(surge);
    assertEquals(Integer.valueOf(29), surge.getIdent());
  }

  /**
   * Test method for {@link MonsterSurgeDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    MonsterSurge example = new MonsterSurge();
    List<MonsterSurge> list = this.monsterSurgeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    MonsterSurgePk monsterSurgePk = new MonsterSurgePk();
    monsterSurgePk.setName("Flesh Moulders");
    monsterSurgePk.setExpansionName("D2E");
    monsterSurgePk.setActName("Act1");
    monsterSurgePk.setMonsterTypeName("Minion");
    monsterSurgePk.setSurge(Integer.valueOf(1));
    monsterSurgePk.setIndex(Integer.valueOf(1));
    example.setIdent(monsterSurgePk);
    list = this.monsterSurgeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdent(null);
    MonsterStatPk monsterStatPk = new MonsterStatPk();
    monsterStatPk.setName("Shadow Dragon");
    monsterStatPk.setExpansionName("D2E");
    monsterStatPk.setActName("Act2");
    monsterStatPk.setMonsterType("Master");
    MonsterStat monsterStat = this.monsterStatDao.getById(monsterStatPk);
    example.setMonsterStat(monsterStat);
    list = this.monsterSurgeDao.findByExample(example);
    assertNotNull(list);
    assertEquals(2, list.size());
  }

  /**
   * Test method for {@link MonsterSurgeDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<MonsterSurge> list = this.monsterSurgeDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link MonsterSurgeDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<MonsterSurge> list = this.monsterSurgeDao.list(10, 0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
