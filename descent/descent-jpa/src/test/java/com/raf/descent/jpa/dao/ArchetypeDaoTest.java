package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.raf.descent.jpa.domain.model.Archetype;
import com.raf.fwk.jpa.domain.DomainEntity;
import com.raf.fwk.util.Paged;

/**
 * 
 * Test class for {@link ArchetypeDao}.
 * 
 * @author RAF
 */
public class ArchetypeDaoTest extends AbstractDaoTest {

  @Resource
  private ArchetypeDao archetypeDao;

  /**
   * Test method for {@link ArchetypeDao#getById(String)}.
   */
  @Test
  public final void testGetById() {
    String name = "Warrior";
    Archetype example = this.archetypeDao.getById(name);
    assertNotNull(example);
    assertEquals(name, example.getIdentifier());
    assertEquals(name, example.getName());
    assertEquals("archetype.warrior", example.getMessageCode());
    assertEquals("warrior.png", example.getIcon());
  }

  /**
   * Test method for {@link ArchetypeDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    Archetype example = new Archetype();
    List<Archetype> list = this.archetypeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Warrior");
    example.setMessageCode("Test");
    example.setIcon("Test");
    list = this.archetypeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdentifier("Test");
    list = this.archetypeDao.findByExample(example);
    assertNotNull(list);
    assertTrue(list.isEmpty());
  }

  /**
   * Test method for {@link ArchetypeDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<Archetype> list = this.archetypeDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link ArchetypeDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<Archetype> list = this.archetypeDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
