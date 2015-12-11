package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.card.Search;
import com.raf.descent.jpa.domain.card.SearchDice;
import com.raf.descent.jpa.domain.card.SearchDicePk;
import com.raf.descent.jpa.domain.model.Dice;
import com.raf.descent.jpa.domain.model.NameExpansionPk;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link SearchDiceDao}.
 * 
 * @author RAF
 */
public class SearchDiceDaoTest extends AbstractDaoTest {

  @Resource
  private SearchDiceDao searchDiceDao;

  @Resource
  private SearchDao searchDao;

  @Resource
  private DiceDao diceDao;

  /**
   * Test method for {@link SearchDiceDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    SearchDicePk searchDicePk = new SearchDicePk();
    searchDicePk.setSearch("Fire Flask");
    searchDicePk.setExpansion("D2E");
    searchDicePk.setDice("Blue");
    searchDicePk.setIndex(Integer.valueOf(1));
    SearchDice example = this.searchDiceDao.getById(searchDicePk);
    assertNotNull(example);
    assertEquals(searchDicePk, example.getId());
    assertEquals(searchDicePk, example.getIdent());
    assertEquals("Fire Flask", example.getSearchName());
    assertEquals("D2E", example.getExpansionName());
    assertEquals("Blue", example.getDiceName());
    Search search = example.getSearch();
    assertNotNull(search);
    assertEquals("Fire Flask", search.getName());
    assertEquals("D2E", search.getExpansionName());
    Dice dice = example.getDice();
    assertNotNull(dice);
    assertEquals("Blue", dice.getName());
    assertNotNull(dice.getDiceType());
    assertEquals("Attack", dice.getDiceType().getName());
  }

  /**
   * Test method for {@link SearchDiceDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    SearchDice example = new SearchDice();
    List<SearchDice> list = this.searchDiceDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    NameExpansionPk nameExpansionPk = new NameExpansionPk();
    nameExpansionPk.setName("Fire Flask");
    nameExpansionPk.setExpansion("D2E");
    Search search = this.searchDao.getById(nameExpansionPk);
    example.setSearch(search);
    list = this.searchDiceDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(2, list.size());
    example.setSearch(null);
    Dice dice = this.diceDao.getById("Yellow");
    example.setDice(dice);
    list = this.searchDiceDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setDice(null);
    example.getIdent().setDice("Yellow");
    example.getIdent().setSearch("Fire Flask");
    example.getIdent().setExpansion("D2E");
    list = this.searchDiceDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
  }

  /**
   * Test method for {@link SearchDiceDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<SearchDice> list = this.searchDiceDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link SearchDiceDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<SearchDice> list = this.searchDiceDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
