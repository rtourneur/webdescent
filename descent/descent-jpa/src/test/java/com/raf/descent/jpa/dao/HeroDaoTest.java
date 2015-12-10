package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.card.Hero;
import com.raf.descent.jpa.domain.model.Archetype;
import com.raf.descent.jpa.domain.model.Dice;
import com.raf.descent.jpa.domain.model.NameExpansionPk;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link HeroDao}.
 * 
 * @author RAF
 */
public class HeroDaoTest extends AbstractDaoTest {

  @Resource
  private HeroDao heroDao;

  @Resource
  private ExpansionDao expansionDao;

  @Resource
  private ArchetypeDao archetypeDao;

  /**
   * Test method for {@link HeroDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    NameExpansionPk nameExpansionPk = new NameExpansionPk();
    nameExpansionPk.setName("Ashrian");
    nameExpansionPk.setExpansion("D2E");
    Hero example = this.heroDao.getById(nameExpansionPk);
    assertNotNull(example);
    assertEquals(nameExpansionPk, example.getId());
    assertEquals("Ashrian", example.getName());
    assertEquals("D2E", example.getExpansionName());
    assertEquals("hero.ashrian.d2e", example.getMessageCode());
    assertEquals("Healer", example.getArchetypeName());
    Archetype archetype = example.getArchetype();
    assertNotNull(archetype);
    assertEquals("Healer", archetype.getName());
    assertEquals(Integer.valueOf(5), example.getSpeed());
    assertEquals(Integer.valueOf(10), example.getHealth());
    assertEquals(Integer.valueOf(4), example.getStamina());
    assertEquals("Grey", example.getDefenseName());
    Dice defense = example.getDefense();
    assertNotNull(defense);
    assertEquals("Grey", defense.getName());
    assertEquals(Integer.valueOf(2), example.getMight());
    assertEquals(Integer.valueOf(2), example.getKnowledge());
    assertEquals(Integer.valueOf(3), example.getWillpower());
    assertEquals(Integer.valueOf(4), example.getAwareness());
    assertEquals("hero.ashrian.d2e.ability", example.getAbilityCode());
    assertEquals("hero.ashrian.d2e.feat", example.getFeatCode());
    assertEquals("ashrian.d2e.jpg", example.getImage());
  }

  /**
   * Test method for {@link HeroDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    Hero example = new Hero();
    List<Hero> list = this.heroDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Ashrian");
    example.setMessageCode("Test");
    list = this.heroDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdent(null);
    example.setExpansion(this.expansionDao.getById("D2E"));
    list = this.heroDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(8, list.size());
    example.setExpansion(null);
    example.setArchetype(this.archetypeDao.getById("Warrior"));
    list = this.heroDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(13, list.size());
    example.setArchetype(null);
    example.setExpansionName("LoR");
    example.setArchetypeName("Warrior");
    list = this.heroDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
  }

  /**
   * Test method for {@link HeroDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<Hero> list = this.heroDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link HeroDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<Hero> list = this.heroDao.list(10, 0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
