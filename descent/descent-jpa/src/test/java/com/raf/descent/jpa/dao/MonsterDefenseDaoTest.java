package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.card.MonsterDefense;
import com.raf.descent.jpa.domain.card.MonsterStat;
import com.raf.descent.jpa.domain.card.MonsterStatDicePk;
import com.raf.descent.jpa.domain.card.MonsterStatPk;
import com.raf.descent.jpa.domain.model.Dice;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link MonsterDefenseDao}.
 * 
 * @author RAF
 */
public class MonsterDefenseDaoTest extends AbstractDaoTest {

  @Resource
  private MonsterDefenseDao monsterDefenseDao;

  @Resource
  private MonsterStatDao monsterStatDao;

  /**
   * Test method for {@link MonsterDefenseDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    MonsterStatDicePk monsterDefensePk = new MonsterStatDicePk();
    monsterDefensePk.setName("Ettin");
    monsterDefensePk.setExpansionName("D2E");
    monsterDefensePk.setActName("Act1");
    monsterDefensePk.setMonsterTypeName("Master");
    monsterDefensePk.setDice("Grey");
    monsterDefensePk.setIndex(Integer.valueOf(2));
    MonsterDefense example = this.monsterDefenseDao.getById(monsterDefensePk);
    assertNotNull(example);
    assertEquals(monsterDefensePk, example.getId());
    assertEquals("Ettin", example.getIdent().getName());
    assertEquals("Ettin", example.getMonsterGroupName());
    assertEquals("D2E", example.getIdent().getExpansionName());
    assertEquals("D2E", example.getExpansionName());
    assertEquals("Act1", example.getIdent().getActName());
    assertEquals("Act1", example.getActName());
    assertEquals("Master", example.getIdent().getMonsterTypeName());
    assertEquals("Master", example.getMonsterTypeName());
    assertEquals("Grey", example.getIdent().getDice());
    assertEquals("Grey", example.getDiceName());
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
    assertEquals("Grey", dice.getName());
  }

  /**
   * Test method for {@link MonsterDefenseDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    MonsterDefense example = new MonsterDefense();
    List<MonsterDefense> list = this.monsterDefenseDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    MonsterStatDicePk monsterStatDicePk = new MonsterStatDicePk();
    monsterStatDicePk.setName("Ettin");
    monsterStatDicePk.setExpansionName("D2E");
    monsterStatDicePk.setActName("Act1");
    monsterStatDicePk.setMonsterTypeName("Minion");
    monsterStatDicePk.setDice("Grey");
    monsterStatDicePk.setIndex(Integer.valueOf(1));
    example.setIdent(monsterStatDicePk);
    list = this.monsterDefenseDao.findByExample(example);
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
    list = this.monsterDefenseDao.findByExample(example);
    assertNotNull(list);
    assertEquals(2, list.size());
  }

  /**
   * Test method for {@link MonsterDefenseDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<MonsterDefense> list = this.monsterDefenseDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link MonsterDefenseDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<MonsterDefense> list = this.monsterDefenseDao.list(10, 0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
