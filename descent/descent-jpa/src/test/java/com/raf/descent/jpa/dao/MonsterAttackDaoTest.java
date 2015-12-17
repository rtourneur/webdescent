package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.card.MonsterAttack;
import com.raf.descent.jpa.domain.card.MonsterStat;
import com.raf.descent.jpa.domain.card.MonsterStatDicePk;
import com.raf.descent.jpa.domain.card.MonsterStatPk;
import com.raf.descent.jpa.domain.model.Dice;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link MonsterAttackDao}.
 * 
 * @author RAF
 */
public class MonsterAttackDaoTest extends AbstractDaoTest {

  @Resource
  private MonsterAttackDao monsterAttackDao;

  @Resource
  private MonsterStatDao monsterStatDao;

  /**
   * Test method for {@link MonsterAttackDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    MonsterStatDicePk monsterAttackPk = new MonsterStatDicePk();
    monsterAttackPk.setName("Ettin");
    monsterAttackPk.setExpansionName("D2E");
    monsterAttackPk.setActName("Act1");
    monsterAttackPk.setMonsterTypeName("Master");
    monsterAttackPk.setDice("Red");
    monsterAttackPk.setIndex(Integer.valueOf(2));
    MonsterAttack example = this.monsterAttackDao.getById(monsterAttackPk);
    assertNotNull(example);
    assertEquals(monsterAttackPk, example.getId());
    assertEquals("Ettin", example.getIdent().getName());
    assertEquals("Ettin", example.getMonsterGroupName());
    assertEquals("D2E", example.getIdent().getExpansionName());
    assertEquals("D2E", example.getExpansionName());
    assertEquals("Act1", example.getIdent().getActName());
    assertEquals("Act1", example.getActName());
    assertEquals("Master", example.getIdent().getMonsterTypeName());
    assertEquals("Master", example.getMonsterTypeName());
    assertEquals("Red", example.getIdent().getDice());
    assertEquals("Red", example.getDiceName());
    assertEquals(Integer.valueOf(2), example.getIdent().getIndex());
    assertEquals(Integer.valueOf(2), example.getIndex());
    MonsterStat monsterStat = example.getMonsterStat();
    assertNotNull(monsterStat);
    assertEquals("Ettin", monsterStat.getMonsterGroupName());
    assertEquals("D2E", monsterStat.getExpansionName());
    assertEquals("Act1", monsterStat.getActName());
    assertEquals("Master", monsterStat.getMonsterTypeName());
    Dice dice = example.getDice();
    assertNotNull(dice);
    assertEquals("Red", dice.getName());
  }

  /**
   * Test method for {@link MonsterAttackDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    MonsterAttack example = new MonsterAttack();
    List<MonsterAttack> list = this.monsterAttackDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    MonsterStatDicePk monsterStatDicePk = new MonsterStatDicePk();
    monsterStatDicePk.setName("Ettin");
    monsterStatDicePk.setExpansionName("D2E");
    monsterStatDicePk.setActName("Act1");
    monsterStatDicePk.setMonsterTypeName("Minion");
    monsterStatDicePk.setDice("Blue");
    monsterStatDicePk.setIndex(Integer.valueOf(1));
    example.setIdent(monsterStatDicePk);
    list = this.monsterAttackDao.findByExample(example);
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
    list = this.monsterAttackDao.findByExample(example);
    assertNotNull(list);
    assertEquals(3, list.size());
  }

  /**
   * Test method for {@link MonsterAttackDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<MonsterAttack> list = this.monsterAttackDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link MonsterAttackDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<MonsterAttack> list = this.monsterAttackDao.list(10, 0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
