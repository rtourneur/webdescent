package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.card.MonsterGroup;
import com.raf.descent.jpa.domain.card.MonsterGroupAct;
import com.raf.descent.jpa.domain.card.MonsterGroupActPk;
import com.raf.descent.jpa.domain.model.Act;
import com.raf.descent.jpa.domain.model.NameExpansionPk;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link MonsterGroupActDao}.
 * 
 * @author RAF
 */
public class MonsterGroupActDaoTest extends AbstractDaoTest {

  @Resource
  private MonsterGroupActDao monsterGroupActDao;

  @Resource
  private MonsterGroupDao monsterGroupDao;

  /**
   * Test method for {@link MonsterGroupActDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    MonsterGroupActPk monsterGroupActPk = new MonsterGroupActPk();
    monsterGroupActPk.setName("Bane Spider");
    monsterGroupActPk.setExpansionName("DCK");
    monsterGroupActPk.setAct("Act1");
    MonsterGroupAct example = this.monsterGroupActDao.getById(monsterGroupActPk);
    assertNotNull(example);
    assertEquals(monsterGroupActPk, example.getId());
    assertEquals("Bane Spider", example.getIdent().getName());
    assertEquals("Bane Spider", example.getMonsterGroupName());
    assertEquals("DCK", example.getIdent().getExpansionName());
    assertEquals("DCK", example.getExpansionName());
    assertEquals("Act1", example.getIdent().getAct());
    assertEquals("Act1", example.getActName());
    assertEquals("banespideract1.png", example.getImage());
    MonsterGroup monsterGroup = example.getMonsterGroup();
    assertNotNull(monsterGroup);
    assertEquals("Bane Spider", monsterGroup.getName());
    assertEquals("DCK", monsterGroup.getExpansionName());
    Act act = example.getAct();
    assertNotNull(act);
    assertEquals("Act1", act.getName());
  }

  /**
   * Test method for {@link MonsterGroupActDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    MonsterGroupAct example = new MonsterGroupAct();
    List<MonsterGroupAct> list = this.monsterGroupActDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    MonsterGroupActPk monsterGroupActPk = new MonsterGroupActPk();
    monsterGroupActPk.setName("Bane Spider");
    monsterGroupActPk.setExpansionName("DCK");
    monsterGroupActPk.setAct("Act1");
    example.setIdent(monsterGroupActPk);
    list = this.monsterGroupActDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdent(null);
    NameExpansionPk nameExpansionPk = new NameExpansionPk();
    nameExpansionPk.setName("Goblin Archer");
    nameExpansionPk.setExpansion("D2E");
    MonsterGroup monsterGroup = this.monsterGroupDao.getById(nameExpansionPk);
    example.setMonsterGroup(monsterGroup);
    list = this.monsterGroupActDao.findByExample(example);
    assertNotNull(list);
    assertEquals(2, list.size());
  }

  /**
   * Test method for {@link MonsterGroupActDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<MonsterGroupAct> list = this.monsterGroupActDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link MonsterGroupActDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<MonsterGroupAct> list = this.monsterGroupActDao.list(10, 0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
