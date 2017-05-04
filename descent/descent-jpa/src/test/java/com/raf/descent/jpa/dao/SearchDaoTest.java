package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.card.Search;
import com.raf.descent.jpa.domain.model.AttackType;
import com.raf.descent.jpa.domain.model.Expansion;
import com.raf.descent.jpa.domain.model.NameExpansionPk;
import com.raf.descent.jpa.domain.model.ObjectTrait;
import com.raf.descent.jpa.domain.model.StatDiceName;
import com.raf.fwk.jpa.domain.DomainEntity;
import com.raf.fwk.util.Paged;

/**
 * 
 * Test class for {@link SearchDao}.
 * 
 * @author RAF
 */
public class SearchDaoTest extends AbstractDaoTest {

  @Resource
  private SearchDao searchDao;

  @Resource
  private ExpansionDao expansionDao;

  @Resource
  private AttackTypeDao attackTypeDao;
  
  /**
   * Test method for {@link SearchDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    NameExpansionPk nameExpansionPk = new NameExpansionPk();
    nameExpansionPk.setName("Fire Flask");
    nameExpansionPk.setExpansion("D2E");
    Search example = this.searchDao.getById(nameExpansionPk);
    assertNotNull(example);
    assertEquals(nameExpansionPk, example.getIdentifier());
    assertEquals("Fire Flask", example.getName());
    assertEquals("search.fireflask.d2e", example.getMessageCode());
    assertEquals("D2E", example.getExpansionName());
    assertEquals("Ranged", example.getAttackTypeName());
    assertEquals(Integer.valueOf(50),  example.getGold());
    assertEquals(Integer.valueOf(1),  example.getCount());
    assertEquals("fireflask.d2e.jpg", example.getImage());
    Expansion expansion = example.getExpansion();
    assertNotNull(expansion);
    assertEquals("D2E", expansion.getName());
    AttackType attackType = example.getAttackType();
    assertNotNull(attackType);
    assertEquals("Ranged", attackType.getName());
    List<ObjectTrait> traits = example.getTraits();
    assertNotNull(traits);
    assertFalse(traits.isEmpty());
    List<StatDiceName> searchDices = example.getDiceNames();
    assertNotNull(searchDices);
    assertFalse(searchDices.isEmpty());
  }

  /**
   * Test method for {@link SearchDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    Search example = new Search();
    List<Search> list = this.searchDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Health Potion");
    example.setMessageCode("Test");
    list = this.searchDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdentifier(null);
    example.setExpansion(this.expansionDao.getById("D2E"));
    list = this.searchDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(8, list.size());
    example.setExpansion(null);
    example.setAttackType(this.attackTypeDao.getById("Ranged"));
    list = this.searchDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setAttackType(null);
    example.setExpansionName("D2E");
    example.setAttackTypeName("Ranged");
    list = this.searchDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
  }

  /**
   * Test method for {@link SearchDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<Search> list = this.searchDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link SearchDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<Search> list = this.searchDao.list(10, 0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
