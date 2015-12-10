package com.raf.descent.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.card.Skill;
import com.raf.descent.jpa.domain.card.SkillPk;
import com.raf.descent.jpa.domain.model.Clazz;
import com.raf.descent.util.Paged;

/**
 * 
 * Test class for {@link SkillDao}.
 * 
 * @author RAF
 */
public class SkillDaoTest extends AbstractDaoTest {

  @Resource
  private SkillDao skillDao;

  @Resource
  private ClazzDao clazzDao;

  /**
   * Test method for {@link SkillDao#getById(String)}.
   */
  @Test
  @Transactional
  public final void testGetById() {
    SkillPk skillPk = new SkillPk();
    skillPk.setName("Rage");
    skillPk.setClazz("Berserker");
    Skill example = this.skillDao.getById(skillPk);
    assertNotNull(example);
    assertEquals(skillPk, example.getId());
    assertEquals("Rage", example.getName());
    assertEquals("Berserker", example.getClazzName());
    assertEquals("name.berserker.rage", example.getMessageCode());
    assertEquals(Integer.valueOf(0), example.getExperience());
    assertEquals("name.berserker.rage.rule", example.getRuleCode());
    assertEquals("1", example.getCost());
    Clazz clazz = example.getClazz();
    assertNotNull(clazz);
    assertEquals("Berserker", clazz.getName());
  }

  /**
   * Test method for {@link SkillDao#findByExample(DomainEntity)}.
   */
  @Test
  public final void testFindByExample() {
    Skill example = new Skill();
    List<Skill> list = this.skillDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    example.setName("Rage");
    list = this.skillDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    example.setIdent(null);
    example.setClazz(this.clazzDao.getById("Berserker"));
    list = this.skillDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(9, list.size());
    example.setClazz(null);
    example.setClazzName("Knight");
    list = this.skillDao.findByExample(example);
    assertNotNull(list);
    assertFalse(list.isEmpty());
    assertEquals(9, list.size());
  }

  /**
   * Test method for {@link SkillDao#listAll()}.
   */
  @Test
  public final void testListAll() {
    List<Skill> list = this.skillDao.listAll();
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

  /**
   * Test method for {@link SkillDao#list(int, int)}.
   */
  @Test
  public final void testList() {
    Paged<Skill> list = this.skillDao.list(10,0);
    assertNotNull(list);
    assertFalse(list.isEmpty());
  }

}
