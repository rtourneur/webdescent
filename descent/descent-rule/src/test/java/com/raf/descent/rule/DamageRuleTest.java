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
    assertEquals(2, damages.getMinDamage());
    assertEquals(5, damages.getMaxDamage());

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
      boolean ranged = "Ranged".equals(monster.getMonsterGroup().getAttackType().getName());
      damages = this.damageRule.getDamages(monster.getName(), monster.getExpansionName(), monster.getActName(),
          monster.getMonsterTypeName());
      StringBuilder builder = new StringBuilder();
      builder.append(monster.getMonsterTypeName()).append(" Monster ").append(monster.getName()).append(" (")
          .append(monster.getExpansionName()).append(") ").append(monster.getActName()).append(" : damages [")
          .append(damages.getMinDamage()).append('-').append(damages.getMaxDamage()).append('(')
          .append(damages.getMoyDamage()).append(")]");
      if (ranged) {
        builder.append(" range [").append(damages.getMinRange()).append('-').append(damages.getMaxRange()).append('(')
            .append(damages.getMoyRange()).append(")]");
      }

      LOGGER.info(builder.toString());
    }

  }

}
