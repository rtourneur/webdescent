package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.model.Act;
import com.raf.fwk.jpa.domain.DomainEntity;
import com.raf.fwk.util.Paged;

/**
 * 
 * Test class for {@link ActDao}.
 * 
 * @author RAF
 */
public class ActDaoTest extends AbstractDaoTest {

  @Resource
  private ActDao actDao;

  @Resource
  private ExpansionDao expansionDao;

  /**
   * Test method for {@link ActDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    String name = "Act1";
    Act example = this.actDao.getById(name);
    assertNotNull(example);
    assertEquals(name, example.getIdentifier());
    assertEquals(name, example.getName());
    assertEquals("act.act1", example.getMessageCode());
  }

  /**
   * Test method for {@link ActDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    Act example = new Act();
    List<Act> list = this.actDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Act1");
    list = this.actDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
  }

  /**
   * Test method for {@link ActDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<Act> list = this.actDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link ActDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<Act> list = this.actDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
