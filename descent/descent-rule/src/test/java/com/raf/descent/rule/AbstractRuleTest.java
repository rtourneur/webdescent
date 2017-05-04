package com.raf.descent.rule;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.raf.descent.database.config.DatasourceConfig;
import com.raf.descent.rule.config.RuleConfig;

/**
 * 
 * Abstract class for all Rule tests.
 * 
 * @author RAF
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RuleConfig.class,
    DatasourceConfig.class }, loader = AnnotationConfigContextLoader.class)
public abstract class AbstractRuleTest {

  /**
   * Constructor.
   */
  public AbstractRuleTest() {
    super();
  }

}
