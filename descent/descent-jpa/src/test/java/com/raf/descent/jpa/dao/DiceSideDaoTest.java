package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.model.Dice;
import com.raf.descent.jpa.domain.model.DiceSide;
import com.raf.descent.jpa.domain.model.DiceSidePk;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link DiceSideDao}.
 * 
 * @author RAF
 */
public class DiceSideDaoTest extends AbstractDaoTest {

  @Resource
  private DiceSideDao diceSideDao;

  @Resource
  private DiceDao diceDao;

  /**
   * Test method for {@link DiceSideDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    DiceSidePk diceSidePk = new DiceSidePk();
    diceSidePk.setDice("Blue");
    diceSidePk.setSide(Integer.valueOf(2));
    DiceSide example = this.diceSideDao.getById(diceSidePk);
    assertNotNull(example);
    assertEquals(diceSidePk, example.getId());
    assertEquals(diceSidePk, example.getIdent());
    assertEquals("Blue", example.getDiceName());
    assertEquals(Integer.valueOf(2), example.getSide());
    assertNull(example.getMiss());
    assertEquals(Integer.valueOf(2), example.getRange());
    assertEquals(Integer.valueOf(2), example.getHeart());
    assertEquals(Integer.valueOf(1), example.getSurge());
    assertNull(example.getShield());
    assertEquals("blue_2.png", example.getIcon());
    Dice dice = example.getDice();
    assertNotNull(dice);
    assertEquals("Blue", dice.getName());
    assertNotNull(dice.getDiceType());
    assertEquals("Attack", dice.getDiceType().getName());
  }

  /**
   * Test method for {@link DiceSideDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    DiceSide example = new DiceSide();
    List<DiceSide> list = this.diceSideDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.getIdent().setDice("Blue");
    list = this.diceSideDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(6, list.size());
    example.getIdent().setDice(null);
    example.getIdent().setSide(Integer.valueOf(1));
    list = this.diceSideDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(7, list.size());
    example.setIdent(null);
    Dice dice = this.diceDao.getById("Red");
    example.setDice(dice);
    list = this.diceSideDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(6, list.size());
  }

  /**
   * Test method for {@link DiceSideDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<DiceSide> list = this.diceSideDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link DiceSideDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<DiceSide> list = this.diceSideDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
