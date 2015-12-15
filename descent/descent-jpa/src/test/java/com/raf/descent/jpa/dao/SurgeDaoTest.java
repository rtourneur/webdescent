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
import com.raf.descent.jpa.domain.model.Ability;
import com.raf.descent.jpa.domain.model.Surge;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link SurgeDao}.
 * 
 * @author RAF
 */
public class SurgeDaoTest extends AbstractDaoTest {

  @Resource
  private SurgeDao surgeDao;

  /**
   * Test method for {@link SurgeDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    Integer ident = Integer.valueOf(17);
    Surge example = this.surgeDao.getById(ident);
    assertNotNull(example);
    assertEquals(ident, example.getId());
    assertEquals(ident, example.getIdent());
    assertEquals("surge.17", example.getRuleCode());
    assertEquals(Integer.valueOf(1), example.getSurgeCount());
    assertNull(example.getDamage());
    assertNull(example.getRange());
    assertEquals("Pierce", example.getAbilityName());
    assertEquals(Integer.valueOf(4), example.getAbilityValue());
    Ability ability = example.getAbility();
    assertNotNull(ability);
    assertEquals("Pierce", ability.getName());
  }

  /**
   * Test method for {@link SurgeDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    Surge example = new Surge();
    List<Surge> list = this.surgeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setIdent(Integer.valueOf(11));
    list = this.surgeDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
  }

  /**
   * Test method for {@link SurgeDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<Surge> list = this.surgeDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link SurgeDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<Surge> list = this.surgeDao.list(10, 0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
