package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.model.Archetype;
import com.raf.descent.jpa.domain.model.Clazz;
import com.raf.descent.jpa.domain.model.Expansion;
import com.raf.fwk.jpa.domain.DomainEntity;
import com.raf.fwk.util.Paged;

/**
 * 
 * Test class for {@link ClazzDao}.
 * 
 * @author RAF
 */
public class ClazzDaoTest extends AbstractDaoTest {

  @Resource
  private ClazzDao clazzDao;

  @Resource
  private ArchetypeDao archetypeDao;

  @Resource
  private ExpansionDao expansionDao;

  /**
   * Test method for {@link ClazzDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    String name = "Berserker";
    Clazz example = this.clazzDao.getById(name);
    assertNotNull(example);
    assertEquals(name, example.getIdentifier());
    assertEquals(name, example.getName());
    assertEquals("class.berserker", example.getMessageCode());
    assertEquals("Warrior", example.getArchetypeName());
    Archetype archetype = example.getArchetype();
    assertNotNull(archetype);
    assertEquals("Warrior", archetype.getName());
    assertEquals("D2E", example.getExpansionName());
    Expansion expansion = example.getExpansion();
    assertNotNull(expansion);
    assertEquals("D2E", expansion.getName());
  }

  /**
   * Test method for {@link ClazzDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    Clazz example = new Clazz();
    List<Clazz> list = this.clazzDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Berserker");
    list = this.clazzDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdentifier(null);
    example.setExpansion(this.expansionDao.getById("D2E"));
    list = this.clazzDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(8, list.size());
    example.setExpansion(null);
    example.setExpansionName(null);
    example.setArchetype(this.archetypeDao.getById("Warrior"));
    list = this.clazzDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(6, list.size());
    example.setArchetype(null);
    example.setExpansionName("D2E");
    example.setArchetypeName("Mage");
    list = this.clazzDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(2, list.size());
  }

  /**
   * Test method for {@link ClazzDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<Clazz> list = this.clazzDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link ClazzDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<Clazz> list = this.clazzDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
