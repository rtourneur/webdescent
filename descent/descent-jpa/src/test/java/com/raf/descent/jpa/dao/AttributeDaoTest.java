package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.raf.descent.jpa.domain.model.Attribute;
import com.raf.fwk.jpa.domain.DomainEntity;
import com.raf.fwk.util.Paged;

/**
 * 
 * Test class for {@link AttributeDao}.
 * 
 * @author RAF
 */
public class AttributeDaoTest extends AbstractDaoTest {

  @Resource
  private AttributeDao attributeDao;

  /**
   * Test method for {@link AttributeDao#getById(String)}.
   */
  @Test
  public final void testGetById() {
    String name = "Might";
    Attribute example = this.attributeDao.getById(name);
    assertNotNull(example);
    assertEquals(name, example.getIdentifier());
    assertEquals(name, example.getName());
    assertEquals("attribute.might", example.getMessageCode());
    assertEquals("might.png", example.getIcon());
  }

  /**
   * Test method for {@link AttributeDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    Attribute example = new Attribute();
    List<Attribute> list = this.attributeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Might");
    example.setMessageCode("Test");
    example.setIcon("Test");
    list = this.attributeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdentifier("Test");
    list = this.attributeDao.findByExample(example);
    assertNotNull(list);
    assertTrue(list.isEmpty());
  }

  /**
   * Test method for {@link AttributeDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<Attribute> list = this.attributeDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link AttributeDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<Attribute> list = this.attributeDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
