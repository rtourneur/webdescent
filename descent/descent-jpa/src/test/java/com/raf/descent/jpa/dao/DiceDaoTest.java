package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.model.Dice;
import com.raf.descent.jpa.domain.model.DiceSide;
import com.raf.descent.jpa.domain.model.DiceType;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link DiceDao}.
 * 
 * @author RAF
 */
public class DiceDaoTest extends AbstractDaoTest {

  @Resource
  private DiceDao diceDao;

  @Resource
  private DiceTypeDao diceTypeDao;

  /**
   * Test method for {@link DiceDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    String name = "Blue";
    Dice example = this.diceDao.getById(name);
    assertNotNull(example);
    assertEquals(name, example.getId());
    assertEquals(name, example.getName());
    assertEquals("dice.blue", example.getMessageCode());
    DiceType diceType = example.getDiceType();
    assertNotNull(diceType);
    assertEquals("Attack", diceType.getName());
    List<DiceSide> diceSides = example.getDiceSides();
    assertNotNull(diceSides);
    assertFalse(diceSides.isEmpty());
  }

  /**
   * Test method for {@link DiceDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    Dice example = new Dice();
    List<Dice> list = this.diceDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Blue");
    example.setMessageCode("Test");
    list = this.diceDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdent(null);
    example.setDiceType(this.diceTypeDao.getById("Power"));
    list = this.diceDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(3, list.size());
    example.setDiceType(null);
    example.setDiceTypeName("Defense");
    list = this.diceDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(3, list.size());
  }

  /**
   * Test method for {@link DiceDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<Dice> list = this.diceDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link DiceDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<Dice> list = this.diceDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
