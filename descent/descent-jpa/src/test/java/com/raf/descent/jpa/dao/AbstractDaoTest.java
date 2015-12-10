/**
 * 
 */
package com.raf.descent.jpa.dao;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.raf.descent.jpa.config.PersistenceJpaConfig;
import com.raf.descent.test.AbstractTest;

/**
 * 
 * Abstract class for all DAO tests.
 * 
 * @author RAF
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceJpaConfig.class }, loader = AnnotationConfigContextLoader.class)
public abstract class AbstractDaoTest extends AbstractTest {

  /**
   * Constructor.
   */
  public AbstractDaoTest() {
    super();
  }

}
