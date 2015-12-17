package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.card.MonsterCount;
import com.raf.descent.jpa.domain.card.MonsterCountPk;
import com.raf.descent.jpa.domain.card.MonsterGroup;
import com.raf.descent.jpa.domain.model.NameExpansionPk;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link MonsterCountDao}.
 * 
 * @author RAF
 */
public class MonsterCountDaoTest extends AbstractDaoTest {

  @Resource
  private MonsterCountDao monsterCountDao;

  @Resource
  private MonsterGroupDao monsterGroupDao;

  /**
   * Test method for {@link MonsterCountDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    MonsterCountPk monsterCountPk = new MonsterCountPk();
    monsterCountPk.setName("Bane Spider");
    monsterCountPk.setExpansionName("DCK");
    monsterCountPk.setHeros(Integer.valueOf(2));
    MonsterCount example = this.monsterCountDao.getById(monsterCountPk);
    assertNotNull(example);
    assertEquals(monsterCountPk, example.getId());
    assertEquals("Bane Spider", example.getIdent().getName());
    assertEquals("DCK", example.getIdent().getExpansionName());
    assertEquals(Integer.valueOf(2), example.getIdent().getHeros());
    assertEquals(Integer.valueOf(1), example.getMaster());
    assertEquals(Integer.valueOf(0), example.getMinion());
    MonsterGroup monsterGroup = example.getMonsterGroup();
    assertNotNull(monsterGroup);
    assertEquals("Bane Spider", monsterGroup.getName());
    assertEquals("DCK", monsterGroup.getExpansionName());
  }

  /**
   * Test method for {@link MonsterCountDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    MonsterCount example = new MonsterCount();
    List<MonsterCount> list = this.monsterCountDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    MonsterCountPk monsterCountPk = new MonsterCountPk();
    monsterCountPk.setName("Bane Spider");
    monsterCountPk.setExpansionName("DCK");
    monsterCountPk.setHeros(Integer.valueOf(2));
    example.setIdent(monsterCountPk);
    list = this.monsterCountDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdent(null);
    NameExpansionPk nameExpansionPk = new NameExpansionPk();
    nameExpansionPk.setName("Goblin Archer");
    nameExpansionPk.setExpansion("D2E");
    MonsterGroup monsterGroup = this.monsterGroupDao.getById(nameExpansionPk);
    example.setMonsterGroup(monsterGroup);
    list = this.monsterCountDao.findByExample(example);
    assertNotNull(list);
    assertEquals(3, list.size());
  }

  /**
   * Test method for {@link MonsterCountDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<MonsterCount> list = this.monsterCountDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link MonsterCountDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<MonsterCount> list = this.monsterCountDao.list(10, 0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
