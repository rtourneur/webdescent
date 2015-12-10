package com.raf.descent.util.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/**
 * Spring configuration class for utils classes.
 * 
 * @author RAF
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.raf.descent.util")
public class UtilConfig {

  /**
   * Constructor.
   */
  public UtilConfig() {
    super();
  }

}
