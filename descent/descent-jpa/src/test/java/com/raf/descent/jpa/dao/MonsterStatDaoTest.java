package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.card.MonsterAbility;
import com.raf.descent.jpa.domain.card.MonsterAttack;
import com.raf.descent.jpa.domain.card.MonsterDefense;
import com.raf.descent.jpa.domain.card.MonsterGroupAct;
import com.raf.descent.jpa.domain.card.MonsterGroupActPk;
import com.raf.descent.jpa.domain.card.MonsterStat;
import com.raf.descent.jpa.domain.card.MonsterStatPk;
import com.raf.descent.jpa.domain.card.MonsterSurge;
import com.raf.descent.jpa.domain.model.MonsterType;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link MonsterStatDao}.
 * 
 * @author RAF
 */
public class MonsterStatDaoTest extends AbstractDaoTest {

  @Resource
  private MonsterStatDao monsterStatDao;

  @Resource
  private MonsterGroupActDao monsterGroupActDao;

  /**
   * Test method for {@link MonsterStatDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    MonsterStatPk monsterStatPk = new MonsterStatPk();
    monsterStatPk.setName("Cave Spider");
    monsterStatPk.setExpansionName("D2E");
    monsterStatPk.setActName("Act1");
    monsterStatPk.setMonsterType("Master");
    MonsterStat example = this.monsterStatDao.getById(monsterStatPk);
    assertNotNull(example);
    assertEquals(monsterStatPk, example.getId());
    assertEquals("Cave Spider", example.getIdent().getName());
    assertEquals("Cave Spider", example.getMonsterGroupName());
    assertEquals("D2E", example.getIdent().getExpansionName());
    assertEquals("D2E", example.getExpansionName());
    assertEquals("Act1", example.getIdent().getActName());
    assertEquals("Act1", example.getActName());
    assertEquals("Master", example.getIdent().getMonsterType());
    assertEquals("Master", example.getMonsterTypeName());
    assertEquals(Integer.valueOf(4), example.getSpeed());
    assertEquals(Integer.valueOf(5), example.getHealth());
    MonsterGroupAct monsterGroupAct = example.getMonsterGroupAct();
    assertNotNull(monsterGroupAct);
    assertEquals("Cave Spider", monsterGroupAct.getMonsterGroupName());
    assertEquals("D2E", monsterGroupAct.getExpansionName());
    assertEquals("Act1", monsterGroupAct.getActName());
    MonsterType monsterType = example.getMonsterType();
    assertNotNull(monsterType);
    assertEquals("Master", monsterType.getName());
    List<MonsterDefense> defenses = example.getDefenses();
    assertNotNull(defenses);
    assertFalse(defenses.isEmpty());
    List<MonsterAttack> attacks = example.getAttacks();
    assertNotNull(attacks);
    assertFalse(attacks.isEmpty());
    List<MonsterAbility> abilities = example.getAbilities();
    assertNotNull(abilities);
    assertFalse(abilities.isEmpty());
    List<MonsterSurge> surges = example.getSurges();
    assertNotNull(surges);
    assertFalse(surges.isEmpty());
  }

  /**
   * Test method for {@link MonsterStatDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    MonsterStat example = new MonsterStat();
    List<MonsterStat> list = this.monsterStatDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    MonsterStatPk monsterStatPk = new MonsterStatPk();
    monsterStatPk.setName("Cave Spider");
    monsterStatPk.setExpansionName("D2E");
    monsterStatPk.setActName("Act1");
    monsterStatPk.setMonsterType("Minion");
    example.setIdent(monsterStatPk);
    list = this.monsterStatDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdent(null);
    MonsterGroupActPk monsterGroupActPk = new MonsterGroupActPk();
    monsterGroupActPk.setName("Goblin Archer");
    monsterGroupActPk.setExpansionName("D2E");
    monsterGroupActPk.setAct("Act2");
    MonsterGroupAct monsterGroupAct = this.monsterGroupActDao.getById(monsterGroupActPk);
    example.setMonsterGroupAct(monsterGroupAct);
    list = this.monsterStatDao.findByExample(example);
    assertNotNull(list);
    assertEquals(2, list.size());
  }

  /**
   * Test method for {@link MonsterStatDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<MonsterStat> list = this.monsterStatDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link MonsterStatDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<MonsterStat> list = this.monsterStatDao.list(10, 0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
