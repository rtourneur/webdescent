package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.card.Item;
import com.raf.descent.jpa.domain.card.ItemDice;
import com.raf.descent.jpa.domain.card.ItemDicePk;
import com.raf.descent.jpa.domain.model.Dice;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link ItemDiceDao}.
 * 
 * @author RAF
 */
public class ItemDiceDaoTest extends AbstractDaoTest {

  @Resource
  private ItemDiceDao itemDiceDao;

  @Resource
  private ItemDao itemDao;

  @Resource
  private DiceDao diceDao;

  /**
   * Test method for {@link ItemDiceDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    ItemDicePk itemDicePk = new ItemDicePk();
    itemDicePk.setItem("Iron Longsword");
    itemDicePk.setDice("Blue");
    itemDicePk.setIndex(Integer.valueOf(1));
    ItemDice example = this.itemDiceDao.getById(itemDicePk);
    assertNotNull(example);
    assertEquals(itemDicePk, example.getId());
    assertEquals(itemDicePk, example.getIdent());
    assertEquals("Iron Longsword", example.getItemName());
    assertEquals("Blue", example.getDiceName());
    Item item = example.getItem();
    assertNotNull(item);
    assertEquals("Iron Longsword", item.getName());
    Dice dice = example.getDice();
    assertNotNull(dice);
    assertEquals("Blue", dice.getName());
    assertNotNull(dice.getDiceType());
    assertEquals("Attack", dice.getDiceType().getName());
  }

  /**
   * Test method for {@link ItemDiceDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    ItemDice example = new ItemDice();
    List<ItemDice> list = this.itemDiceDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    Item item = this.itemDao.getById("Iron Longsword");
    example.setItem(item);
    list = this.itemDiceDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(2, list.size());
    example.setItem(null);
    Dice dice = this.diceDao.getById("Green");
    example.setDice(dice);
    list = this.itemDiceDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(11, list.size());
    example.setDice(null);
    example.getIdent().setDice("Yellow");
    example.getIdent().setItem("Lightning Strike");
    list = this.itemDiceDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(2, list.size());
  }

  /**
   * Test method for {@link ItemDiceDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<ItemDice> list = this.itemDiceDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link ItemDiceDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<ItemDice> list = this.itemDiceDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
