package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.model.Condition;
import com.raf.descent.jpa.domain.model.Expansion;
import com.raf.fwk.jpa.domain.DomainEntity;
import com.raf.fwk.util.Paged;

/**
 * 
 * Test class for {@link ConditionDao}.
 * 
 * @author RAF
 */
public class ConditionDaoTest extends AbstractDaoTest {

  @Resource
  private ConditionDao conditionDao;

  @Resource
  private ExpansionDao expansionDao;

  /**
   * Test method for {@link ConditionDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    String name = "Diseased";
    Condition example = this.conditionDao.getById(name);
    assertNotNull(example);
    assertEquals(name, example.getIdentifier());
    assertEquals(name, example.getName());
    assertEquals("condition.diseased", example.getMessageCode());
    assertEquals("condition.diseased.rule", example.getRuleCode());
    assertEquals("D2E", example.getExpansionName());
    assertEquals("diseased.png", example.getImage());
    Expansion expansion = example.getExpansion();
    assertNotNull(expansion);
    assertEquals("D2E", expansion.getName());
  }

  /**
   * Test method for {@link ConditionDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    Condition example = new Condition();
    List<Condition> list = this.conditionDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Diseased");
    list = this.conditionDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdentifier(null);
    example.setExpansion(this.expansionDao.getById("D2E"));
    list = this.conditionDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(4, list.size());
    example.setExpansion(null);
    example.setExpansionName("TT");
    list = this.conditionDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
  }

  /**
   * Test method for {@link ConditionDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<Condition> list = this.conditionDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link ConditionDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<Condition> list = this.conditionDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
