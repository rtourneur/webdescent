package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.model.MonsterSize;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link MonsterSizeDao}.
 * 
 * @author RAF
 */
public class MonsterSizeDaoTest extends AbstractDaoTest {

  @Resource
  private MonsterSizeDao monsterSizeDao;

  /**
   * Test method for {@link MonsterSizeDao#getById(String)}.
   */
  @Test
  public final void testGetById() {
    String name = "Small";
    MonsterSize example = this.monsterSizeDao.getById(name);
    assertNotNull(example);
    assertEquals(name, example.getId());
    assertEquals(name, example.getName());
    assertEquals("monstersize.small", example.getMessageCode());
  }

  /**
   * Test method for {@link MonsterSizeDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    MonsterSize example = new MonsterSize();
    List<MonsterSize> list = this.monsterSizeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Small");
    example.setMessageCode("Test");
    list = this.monsterSizeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdent("Test");
    list = this.monsterSizeDao.findByExample(example);
    assertNotNull(list);
    assertTrue(list.isEmpty());
  }

  /**
   * Test method for {@link MonsterSizeDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<MonsterSize> list = this.monsterSizeDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link MonsterSizeDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<MonsterSize> list = this.monsterSizeDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
