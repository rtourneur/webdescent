package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.model.ItemType;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link ItemTypeDao}.
 * 
 * @author RAF
 */
public class ItemTypeDaoTest extends AbstractDaoTest {

  @Resource
  private ItemTypeDao itemTypeDao;

  /**
   * Test method for {@link ItemTypeDao#getById(String)}.
   */
  @Test
  public final void testGetById() {
    String name = "Act1";
    ItemType example = this.itemTypeDao.getById(name);
    assertNotNull(example);
    assertEquals(name, example.getId());
    assertEquals(name, example.getName());
    assertEquals("itemtype.act1", example.getMessageCode());
  }

  /**
   * Test method for {@link ItemTypeDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    ItemType example = new ItemType();
    List<ItemType> list = this.itemTypeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Act1");
    example.setMessageCode("Test");
    list = this.itemTypeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdent("Test");
    list = this.itemTypeDao.findByExample(example);
    assertNotNull(list);
    assertTrue(list.isEmpty());
  }

  /**
   * Test method for {@link ItemTypeDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<ItemType> list = this.itemTypeDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link ItemTypeDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<ItemType> list = this.itemTypeDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
