package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.model.MonsterType;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link MonsterTypeDao}.
 * 
 * @author RAF
 */
public class MonsterTypeDaoTest extends AbstractDaoTest {

  @Resource
  private MonsterTypeDao monsterTypeDao;

  /**
   * Test method for {@link MonsterTypeDao#getById(String)}.
   */
  @Test
  public final void testGetById() {
    String name = "Master";
    MonsterType example = this.monsterTypeDao.getById(name);
    assertNotNull(example);
    assertEquals(name, example.getId());
    assertEquals(name, example.getName());
    assertEquals("monstertype.master", example.getMessageCode());
  }

  /**
   * Test method for {@link MonsterTypeDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    MonsterType example = new MonsterType();
    List<MonsterType> list = this.monsterTypeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Master");
    example.setMessageCode("Test");
    list = this.monsterTypeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdent("Test");
    list = this.monsterTypeDao.findByExample(example);
    assertNotNull(list);
    assertTrue(list.isEmpty());
  }

  /**
   * Test method for {@link MonsterTypeDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<MonsterType> list = this.monsterTypeDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link MonsterTypeDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<MonsterType> list = this.monsterTypeDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
