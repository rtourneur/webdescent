/**
 * 
 */
package com.raf.descent.rule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.raf.descent.jpa.dao.MonsterStatDao;
import com.raf.descent.jpa.domain.card.MonsterStat;
import com.raf.descent.rule.model.Damages;

/**
 * @author raphael.tourneur
 *
 */
public class DamageRuleTest extends AbstractRuleTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(DamageRuleTest.class);

  @Resource
  private DamageRule damageRule;

  @Resource
  private MonsterStatDao monsterStatDao;

  /**
   * Test method for {@link DamageRule#getDamages(String, String, String, String)}.
   */
  @Test
  @Transactional
  public final void testGetDamages() {
    Damages damages = this.damageRule.getDamages("Goblin Archer", "D2E", "Act1", "Minion");
    assertNotNull(damages);
    assertEquals(2, damages.getMin());
    assertEquals(5, damages.getMax());

  }

  /**
   * Test method for {@link DamageRule#getDamages(String, String, String, String)}.
   */
  @Test
  @Transactional
  public final void testGetDamagesAll() {
    List<MonsterStat> monsters = this.monsterStatDao.listAll();
    Damages damages;
    for (MonsterStat monster : monsters) {
      damages = this.damageRule.getDamages(monster.getName(), monster.getExpansionName(),
          monster.getActName(), monster.getMonsterTypeName());
      LOGGER.info(monster.getMonsterTypeName() + " Monster " + monster.getName() + " ("
          + monster.getExpansionName() + ") " + monster.getActName() + " : min (" + damages.getMin() + ") max ("
          + damages.getMax() + ") moyenne (" + damages.getMoy() + ")");
    }

  }

}
