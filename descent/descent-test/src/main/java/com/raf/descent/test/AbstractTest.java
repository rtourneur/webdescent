package com.raf.descent.test;

import static org.junit.Assert.fail;

import java.io.File;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract class for all test with datasource.
 * 
 * @author raphael.tourneur
 */
public abstract class AbstractTest {

  /** Logger. */
  private static final Logger LOGGER = LoggerFactory.getLogger(AbstractTest.class);

  /**
   * Constructor.
   */
  protected AbstractTest() {
    super();
  }

  /**
   * Initialize the JNDI context and the datasource.
   */
  @BeforeClass
  public static void beforeClass() {
    try {
      // Create initial context
      System.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.naming.java.javaURLContextFactory");
      System.setProperty(Context.URL_PKG_PREFIXES, "org.apache.naming");
      final InitialContext context = new InitialContext();
      final String name = "descent";
      final File path = new File("../src/database/derby/db");
      try {
        context.lookup("java:/comp/env/jdbc/" + name);
        LOGGER.info("datasource already bound");
      } catch (NamingException e) {
        if (!DatabaseUtil.initDerbyDatasource(context, name, path.getAbsolutePath(), name, name)) {
          fail("Error in Datasource initialization");
        }
      }
    } catch (NamingException e) {
      LOGGER.error("Naming Exception", e);
    }
  }

}
