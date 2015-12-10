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
import com.raf.descent.jpa.domain.card.Item;
import com.raf.descent.jpa.domain.card.ItemDice;
import com.raf.descent.jpa.domain.model.AttackType;
import com.raf.descent.jpa.domain.model.Clazz;
import com.raf.descent.jpa.domain.model.Dice;
import com.raf.descent.jpa.domain.model.Equipment;
import com.raf.descent.jpa.domain.model.Expansion;
import com.raf.descent.jpa.domain.model.ItemType;
import com.raf.descent.jpa.domain.model.Trait;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link ItemDao}.
 * 
 * @author RAF
 */
public class ItemDaoTest extends AbstractDaoTest {

  @Resource
  private ItemDao itemDao;

  @Resource
  private ExpansionDao expansionDao;

  @Resource
  private ItemTypeDao itemTypeDao;

  @Resource
  private AttackTypeDao attackTypeDao;

  @Resource
  private EquipmentDao equipmentDao;

  @Resource
  private ClazzDao classDao;
  
  /**
   * Test method for {@link ItemDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    String name = "Iron Longsword";
    Item example = this.itemDao.getById(name);
    assertNotNull(example);
    assertEquals(name, example.getId());
    assertEquals(name, example.getName());
    assertEquals("item.ironlongsword", example.getMessageCode());
    assertEquals("D2E", example.getExpansionName());
    assertEquals("Class", example.getItemTypeName());
    assertEquals("Melee", example.getAttackTypeName());
    assertEquals("One Hand", example.getEquipmentName());
    assertNull( example.getCost());
    assertEquals("item.ironlongsword.rule", example.getRuleCode());
    assertEquals(Integer.valueOf(1), example.getCount());
    assertEquals("Knight", example.getClazzName());
    assertEquals("ironlongsword.jpg", example.getImage());
    Expansion expansion = example.getExpansion();
    assertNotNull(expansion);
    assertEquals("D2E", expansion.getName());
    ItemType itemType = example.getItemType();
    assertNotNull(itemType);
    assertEquals("Class", itemType.getName());
    AttackType attackType = example.getAttackType();
    assertNotNull(attackType);
    assertEquals("Melee", attackType.getName());
    Equipment equipment = example.getEquipment();
    assertNotNull(equipment);
    assertEquals("One Hand", equipment.getName());
    Clazz clazz = example.getClazz(); 
    assertNotNull(clazz);
    assertEquals("Knight", clazz.getName());
    List<Trait> traits = example.getTraits();
    assertNotNull(traits);
    assertFalse(traits.isEmpty());
    List<ItemDice> itemDices = example.getDices();
    assertNotNull(itemDices);
    assertFalse(itemDices.isEmpty());
  }

  /**
   * Test method for {@link ItemDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    Item example = new Item();
    List<Item> list = this.itemDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Iron Longsword");
    example.setMessageCode("Test");
    list = this.itemDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdent(null);
    example.setExpansion(this.expansionDao.getById("D2E"));
    list = this.itemDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(49, list.size());
    example.setExpansion(null);
    example.setItemType(this.itemTypeDao.getById("Class"));
    list = this.itemDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(20, list.size());
    example.setItemType(null);
    example.setAttackType(this.attackTypeDao.getById("Melee"));
    list = this.itemDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(25, list.size());
    example.setAttackType(null);
    example.setEquipment(this.equipmentDao.getById("One Hand"));
    list = this.itemDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(26, list.size());
    example.setEquipment(null);
    example.setClazz(this.classDao.getById("Knight"));
    list = this.itemDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(2, list.size());
    example.setClazz(null);
    example.setExpansionName("LoR");
    example.setItemTypeName("Class");
    example.setAttackTypeName("Ranged");
    example.setEquipmentName("Two Hands");
    example.setClazzName("Hexer");
    list = this.itemDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
  }

  /**
   * Test method for {@link ItemDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<Item> list = this.itemDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link ItemDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<Item> list = this.itemDao.list(10, 0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
