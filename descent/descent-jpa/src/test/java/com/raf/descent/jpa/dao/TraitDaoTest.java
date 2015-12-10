package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.model.Trait;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link TraitDao}.
 * 
 * @author RAF
 */
public class TraitDaoTest extends AbstractDaoTest {

  @Resource
  private TraitDao traitDao;

  /**
   * Test method for {@link TraitDao#getById(String)}.
   */
  @Test
  public final void testGetById() {
    String name = "Axe";
    Trait example = this.traitDao.getById(name);
    assertNotNull(example);
    assertEquals(name, example.getId());
    assertEquals(name, example.getName());
    assertEquals("trait.axe", example.getMessageCode());
  }

  /**
   * Test method for {@link TraitDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    Trait example = new Trait();
    List<Trait> list = this.traitDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Axe");
    example.setMessageCode("Test");
    list = this.traitDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdent("Test");
    list = this.traitDao.findByExample(example);
    assertNotNull(list);
    assertTrue(list.isEmpty());
  }

  /**
   * Test method for {@link TraitDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<Trait> list = this.traitDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link TraitDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<Trait> list = this.traitDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
