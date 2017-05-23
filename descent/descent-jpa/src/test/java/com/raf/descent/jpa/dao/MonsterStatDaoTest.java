package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.card.MonsterAbility;
import com.raf.descent.jpa.domain.card.MonsterStat;
import com.raf.descent.jpa.domain.card.MonsterSurge;
import com.raf.descent.jpa.domain.model.Act;
import com.raf.descent.jpa.domain.model.Expansion;
import com.raf.descent.jpa.domain.model.MonsterType;
import com.raf.descent.jpa.domain.model.StatDiceName;
import com.raf.fwk.jpa.domain.DomainEntity;
import com.raf.fwk.util.Paged;

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
  private ExpansionDao expansionDao;
  
  @Resource
  private ActDao actDao;
  
  @Resource
  private MonsterTypeDao monsterTypeDao;

  /**
   * Test method for {@link MonsterStatDao#getById(Integer)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    Integer ident = Integer.valueOf(9);
    MonsterStat result = this.monsterStatDao.getById(ident);
    assertNotNull(result);
    assertEquals(ident, result.getIdentifier());
    assertEquals("Cave Spider", result.getName());
    assertEquals("D2E", result.getExpansionName());
    assertEquals("Act1", result.getActName());
    assertEquals("Master", result.getMonsterTypeName());
    assertEquals(Integer.valueOf(4), result.getSpeed());
    assertEquals(Integer.valueOf(5), result.getHealth());
    MonsterType monsterType = result.getMonsterType();
    assertNotNull(monsterType);
    assertEquals("Master", monsterType.getName());
    Set<StatDiceName> defenses = result.getDefenseDiceNames();
    assertNotNull(defenses);
    assertFalse(defenses.isEmpty());
    Set<StatDiceName> attacks = result.getAttackDiceNames();
    assertNotNull(attacks);
    assertFalse(attacks.isEmpty());
    List<MonsterAbility> abilities = result.getAbilities();
    assertNotNull(abilities);
    assertFalse(abilities.isEmpty());
    List<MonsterSurge> surges = result.getSurges();
    assertNotNull(surges);
    assertFalse(surges.isEmpty());
  }

  /**
   * Test method for {@link MonsterStatDao#getMonsterStat(String, String, String, String)}.
   */
  @Test
  @Transactional
  public final void testGetMonsterStat() {
    MonsterStat result = this.monsterStatDao.getMonsterStat("Cave Spider", "D2E", "Act1", "Master");
    assertNotNull(result);
    assertEquals("Cave Spider", result.getName());
    assertEquals("D2E", result.getExpansionName());
    assertEquals("Act1", result.getActName());
    assertEquals("Master", result.getMonsterTypeName());
    assertEquals(Integer.valueOf(4), result.getSpeed());
    assertEquals(Integer.valueOf(5), result.getHealth());
    MonsterType monsterType = result.getMonsterType();
    assertNotNull(monsterType);
    assertEquals("Master", monsterType.getName());
    Set<StatDiceName> defenses = result.getDefenseDiceNames();
    assertNotNull(defenses);
    assertFalse(defenses.isEmpty());
    Set<StatDiceName> attacks = result.getAttackDiceNames();
    assertNotNull(attacks);
    assertFalse(attacks.isEmpty());
    List<MonsterAbility> abilities = result.getAbilities();
    assertNotNull(abilities);
    assertFalse(abilities.isEmpty());
    List<MonsterSurge> surges = result.getSurges();
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
    example.setName("Cave Spider");
    example.setExpansionName("D2E");
    list = this.monsterStatDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(4, list.size());
    Expansion expansion = this.expansionDao.getById("D2E");
    example.setExpansion(expansion);
    Act act = this.actDao.getById("Act1");
    example.setAct(act);
    MonsterType monsterType = this.monsterTypeDao.getById("Minion");
    example.setMonsterType(monsterType);
    list = this.monsterStatDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
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
