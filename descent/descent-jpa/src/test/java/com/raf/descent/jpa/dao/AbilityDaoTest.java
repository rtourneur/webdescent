package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.model.Ability;
import com.raf.descent.jpa.domain.model.Expansion;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link AbilityDao}.
 * 
 * @author RAF
 */
public class AbilityDaoTest extends AbstractDaoTest {

  @Resource
  private AbilityDao abilityDao;

  @Resource
  private ExpansionDao expansionDao;

  /**
   * Test method for {@link AbilityDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    String name = "Blast";
    Ability example = this.abilityDao.getById(name);
    assertNotNull(example);
    assertEquals(name, example.getId());
    assertEquals(name, example.getName());
    assertEquals("ability.blast", example.getMessageCode());
    assertEquals("ability.blast.rule", example.getRuleCode());
  }

  /**
   * Test method for {@link AbilityDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    Ability example = new Ability();
    List<Ability> list = this.abilityDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Blast");
    list = this.abilityDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
  }

  /**
   * Test method for {@link AbilityDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<Ability> list = this.abilityDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link AbilityDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<Ability> list = this.abilityDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
