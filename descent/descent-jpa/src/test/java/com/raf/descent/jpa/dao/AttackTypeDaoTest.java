package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.model.AttackType;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link AttackTypeDao}.
 * 
 * @author RAF
 */
public class AttackTypeDaoTest extends AbstractDaoTest {

  @Resource
  private AttackTypeDao attackTypeDao;

  /**
   * Test method for {@link AttackTypeDao#getById(String)}.
   */
  @Test
  public final void testGetById() {
    String name = "Melee";
    AttackType example = this.attackTypeDao.getById(name);
    assertNotNull(example);
    assertEquals(name, example.getId());
    assertEquals(name, example.getName());
    assertEquals("attacktype.melee", example.getMessageCode());
    assertEquals("melee.png", example.getIcon());
  }

  /**
   * Test method for {@link AttackTypeDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    AttackType example = new AttackType();
    List<AttackType> list = this.attackTypeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Melee");
    example.setMessageCode("Test");
    list = this.attackTypeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdent("Test");
    list = this.attackTypeDao.findByExample(example);
    assertNotNull(list);
    assertTrue(list.isEmpty());
  }

  /**
   * Test method for {@link AttackTypeDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<AttackType> list = this.attackTypeDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link AttackTypeDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<AttackType> list = this.attackTypeDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
