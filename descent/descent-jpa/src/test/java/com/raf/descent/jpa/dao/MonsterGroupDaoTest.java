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
import com.raf.descent.jpa.domain.model.AttackType;
import com.raf.descent.jpa.domain.model.Expansion;
import com.raf.descent.jpa.domain.model.MonsterSize;
import com.raf.descent.jpa.domain.model.MonsterTrait;
import com.raf.descent.jpa.domain.model.NameExpansionPk;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link MonsterGroupDao}.
 * 
 * @author RAF
 */
public class MonsterGroupDaoTest extends AbstractDaoTest {

  @Resource
  private MonsterGroupDao monsterGroupDao;

  @Resource
  private ExpansionDao expansionDao;

  @Resource
  private AttackTypeDao attackTypeDao;
  
  @Resource
  private MonsterSizeDao monsterSizeDao;
  
  /**
   * Test method for {@link MonsterGroupDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    NameExpansionPk nameExpansionPk = new NameExpansionPk();
    nameExpansionPk.setName("Goblin Archer");
    nameExpansionPk.setExpansion("D2E");
    MonsterGroup example = this.monsterGroupDao.getById(nameExpansionPk);
    assertNotNull(example);
    assertEquals(nameExpansionPk, example.getId());
    assertEquals("Goblin Archer", example.getName());
    assertEquals("monstergroup.goblinarcher.d2e", example.getMessageCode());
    assertEquals("D2E", example.getExpansionName());
    assertEquals("Ranged", example.getAttackTypeName());
    assertEquals("Small", example.getMonsterSizeName());
    assertEquals(Integer.valueOf(1),  example.getMaster());
    assertEquals(Integer.valueOf(4),  example.getMinion());
    Expansion expansion = example.getExpansion();
    assertNotNull(expansion);
    assertEquals("D2E", expansion.getName());
    AttackType attackType = example.getAttackType();
    assertNotNull(attackType);
    assertEquals("Ranged", attackType.getName());
    MonsterSize monsterSize = example.getMonsterSize();
    assertNotNull(monsterSize);
    assertEquals("Small", monsterSize.getName());
    List<MonsterTrait> traits = example.getTraits();
    assertNotNull(traits);
    assertFalse(traits.isEmpty());
  }

  /**
   * Test method for {@link MonsterGroupDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    MonsterGroup example = new MonsterGroup();
    List<MonsterGroup> list = this.monsterGroupDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Goblin Archer");
    example.setMessageCode("Test");
    list = this.monsterGroupDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdent(null);
    example.setExpansion(this.expansionDao.getById("D2E"));
    list = this.monsterGroupDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(9, list.size());
    example.setExpansion(null);
    example.setAttackType(this.attackTypeDao.getById("Ranged"));
    list = this.monsterGroupDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(30, list.size());
    example.setAttackType(null);
    example.setMonsterSize(this.monsterSizeDao.getById("Small"));
    list = this.monsterGroupDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(36, list.size());
    example.setMonsterSize(null);
    example.setExpansionName("D2E");
    example.setAttackTypeName("Ranged");
    example.setMonsterSizeName("Small");
    list = this.monsterGroupDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(2, list.size());
  }

  /**
   * Test method for {@link MonsterGroupDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<MonsterGroup> list = this.monsterGroupDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link MonsterGroupDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<MonsterGroup> list = this.monsterGroupDao.list(10, 0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
