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
import com.raf.descent.jpa.domain.card.MonsterAbility;
import com.raf.descent.jpa.domain.card.MonsterAbilityPk;
import com.raf.descent.jpa.domain.model.Ability;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link MonsterAbilityDao}.
 * 
 * @author RAF
 */
public class MonsterAbilityDaoTest extends AbstractDaoTest {

  @Resource
  private MonsterAbilityDao monsterAbilityDao;

  @Resource
  private MonsterStatDao monsterStatDao;

  /**
   * Test method for {@link MonsterAbilityDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    MonsterAbilityPk monsterAbilityPk = new MonsterAbilityPk();
    monsterAbilityPk.setName("Flesh Moulders");
    monsterAbilityPk.setExpansionName("D2E");
    monsterAbilityPk.setActName("Act1");
    monsterAbilityPk.setMonsterTypeName("Master");
    monsterAbilityPk.setAbility("Heal");
    MonsterAbility example = this.monsterAbilityDao.getById(monsterAbilityPk);
    assertNotNull(example);
    assertEquals(monsterAbilityPk, example.getId());
    assertEquals("Flesh Moulders", example.getIdent().getName());
    assertEquals("Flesh Moulders", example.getMonsterGroupName());
    assertEquals("D2E", example.getIdent().getExpansionName());
    assertEquals("D2E", example.getExpansionName());
    assertEquals("Act1", example.getIdent().getActName());
    assertEquals("Act1", example.getActName());
    assertEquals("Master", example.getIdent().getMonsterTypeName());
    assertEquals("Master", example.getMonsterTypeName());
    assertEquals("Heal", example.getIdent().getAbility());
    assertEquals("Heal", example.getAbilityName());
    MonsterStat monsterStat = example.getMonsterStat();
    assertNotNull(monsterStat);
    assertEquals("Flesh Moulders", monsterStat.getMonsterGroupName());
    assertEquals("D2E", monsterStat.getExpansionName());
    assertEquals("Act1", monsterStat.getActName());
    assertEquals("Master", monsterStat.getMonsterTypeName());
    Ability ability = example.getAbility();
    assertNotNull(ability);
    assertEquals("Heal", ability.getName());
  }

  /**
   * Test method for {@link MonsterAbilityDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    MonsterAbility example = new MonsterAbility();
    List<MonsterAbility> list = this.monsterAbilityDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    MonsterAbilityPk monsterAbilityPk = new MonsterAbilityPk();
    monsterAbilityPk.setName("Fire Imp");
    monsterAbilityPk.setExpansionName("LotW");
    monsterAbilityPk.setActName("Act1");
    monsterAbilityPk.setMonsterTypeName("Minion");
    monsterAbilityPk.setAbility("Flame Fiend");
    example.setIdent(monsterAbilityPk);
    list = this.monsterAbilityDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdent(null);
    MonsterStatPk monsterStatPk = new MonsterStatPk();
    monsterStatPk.setName("Elemental");
    monsterStatPk.setExpansionName("D2E");
    monsterStatPk.setActName("Act2");
    monsterStatPk.setMonsterType("Master");
    MonsterStat monsterStat = this.monsterStatDao.getById(monsterStatPk);
    example.setMonsterStat(monsterStat);
    list = this.monsterAbilityDao.findByExample(example);
    assertNotNull(list);
    assertEquals(4, list.size());
  }

  /**
   * Test method for {@link MonsterAbilityDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<MonsterAbility> list = this.monsterAbilityDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link MonsterAbilityDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<MonsterAbility> list = this.monsterAbilityDao.list(10, 0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
