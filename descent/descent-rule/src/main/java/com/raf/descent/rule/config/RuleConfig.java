package com.raf.descent.rule.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.raf.descent.jpa.config.PersistenceJpaConfig;
import com.raf.descent.util.config.UtilConfig;

/**
 * Spring configuration class for rules.
 * 
 * @author RAF
 */
@Configuration
@Import(value = { UtilConfig.class, PersistenceJpaConfig.class })
@ComponentScan("com.raf.descent.rule")
public class RuleConfig {

  /**
   * Constructor.
   */
  public RuleConfig() {
    super();
  }

}
