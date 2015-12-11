package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.model.MonsterTrait;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link MonsterTraitDao}.
 * 
 * @author RAF
 */
public class MonsterTraitDaoTest extends AbstractDaoTest {

  @Resource
  private MonsterTraitDao monsterTraitDao;

  /**
   * Test method for {@link MonsterTraitDao#getById(String)}.
   */
  @Test
  public final void testGetById() {
    String name = "Civilized";
    MonsterTrait example = this.monsterTraitDao.getById(name);
    assertNotNull(example);
    assertEquals(name, example.getId());
    assertEquals(name, example.getName());
    assertEquals("monstertrait.civilized", example.getMessageCode());
    assertEquals("civilized.png", example.getIcon());
  }

  /**
   * Test method for {@link MonsterTraitDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    MonsterTrait example = new MonsterTrait();
    List<MonsterTrait> list = this.monsterTraitDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Civilized");
    example.setMessageCode("Test");
    example.setIcon("Test");
    list = this.monsterTraitDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdent("Test");
    list = this.monsterTraitDao.findByExample(example);
    assertNotNull(list);
    assertTrue(list.isEmpty());
  }

  /**
   * Test method for {@link MonsterTraitDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<MonsterTrait> list = this.monsterTraitDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link MonsterTraitDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<MonsterTrait> list = this.monsterTraitDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
