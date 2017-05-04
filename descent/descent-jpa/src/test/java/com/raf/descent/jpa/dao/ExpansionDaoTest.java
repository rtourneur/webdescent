package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.raf.descent.jpa.domain.model.Expansion;
import com.raf.fwk.jpa.domain.DomainEntity;
import com.raf.fwk.util.Paged;

/**
 * Test class for {@link ExpansionDao}.
 * 
 * @author RAF
 */
public class ExpansionDaoTest extends AbstractDaoTest {

  @Resource
  private ExpansionDao expansionDao;

  /**
   * Test method for {@link ExpansionDao#getById(String)}.
   */
  @Test
  public final void testGetById() {
    String name = "D2E";
    Expansion example = this.expansionDao.getById(name);
    assertNotNull(example);
    assertEquals(name, example.getIdentifier());
    assertEquals(name, example.getName());
    assertEquals("expansion.d2e", example.getMessageCode());
    assertNotNull(example.getIcon());
  }

  /**
   * Test method for {@link ExpansionDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    Expansion example = new Expansion();
    List<Expansion> list = this.expansionDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("D2E");
    example.setMessageCode("Test");
    example.setIcon("Test");
    list = this.expansionDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdentifier("Test");
    list = this.expansionDao.findByExample(example);
    assertNotNull(list);
    assertTrue(list.isEmpty());
  }

  /**
   * Test method for {@link ExpansionDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<Expansion> list = this.expansionDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link ExpansionDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<Expansion> list = this.expansionDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
