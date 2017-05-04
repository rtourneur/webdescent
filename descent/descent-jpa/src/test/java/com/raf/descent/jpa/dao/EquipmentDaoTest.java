package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.raf.descent.jpa.domain.model.Equipment;
import com.raf.fwk.jpa.domain.DomainEntity;
import com.raf.fwk.util.Paged;

/**
 * 
 * Test class for {@link EquipmentDao}.
 * 
 * @author RAF
 */
public class EquipmentDaoTest extends AbstractDaoTest {

  @Resource
  private EquipmentDao equipmentDao;

  /**
   * Test method for {@link EquipmentDao#getById(String)}.
   */
  @Test
  public final void testGetById() {
    String name = "One Hand";
    Equipment example = this.equipmentDao.getById(name);
    assertNotNull(example);
    assertEquals(name, example.getIdentifier());
    assertEquals(name, example.getName());
    assertEquals("equipment.onehand", example.getMessageCode());
    assertEquals("onehand.png", example.getIcon());
  }

  /**
   * Test method for {@link EquipmentDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    Equipment example = new Equipment();
    List<Equipment> list = this.equipmentDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("One Hand");
    example.setMessageCode("Test");
    list = this.equipmentDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdentifier("Test");
    list = this.equipmentDao.findByExample(example);
    assertNotNull(list);
    assertTrue(list.isEmpty());
  }

  /**
   * Test method for {@link EquipmentDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<Equipment> list = this.equipmentDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link EquipmentDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<Equipment> list = this.equipmentDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
