package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.raf.descent.jpa.domain.model.DiceType;
import com.raf.fwk.jpa.domain.DomainEntity;
import com.raf.fwk.util.Paged;

/**
 * 
 * Test class for {@link DiceTypeDao}.
 * 
 * @author RAF
 */
public class DiceTypeDaoTest extends AbstractDaoTest {

  @Resource
  private DiceTypeDao diceTypeDao;

  /**
   * Test method for {@link DiceTypeDao#getById(String)}.
   */
  @Test
  public final void testGetById() {
    String name = "Attack";
    DiceType example = this.diceTypeDao.getById(name);
    assertNotNull(example);
    assertEquals(name, example.getIdentifier());
    assertEquals(name, example.getName());
    assertEquals("dicetype.attack", example.getMessageCode());
  }

  /**
   * Test method for {@link DiceTypeDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    DiceType example = new DiceType();
    List<DiceType> list = this.diceTypeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Attack");
    example.setMessageCode("Test");
    list = this.diceTypeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdentifier("Test");
    list = this.diceTypeDao.findByExample(example);
    assertNotNull(list);
    assertTrue(list.isEmpty());
  }

  /**
   * Test method for {@link DiceTypeDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<DiceType> list = this.diceTypeDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link DiceTypeDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<DiceType> list = this.diceTypeDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
