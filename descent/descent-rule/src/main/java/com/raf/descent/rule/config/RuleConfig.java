package com.raf.descent.rule.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.raf.descent.jpa.config.PersistenceJpaConfig;
import com.raf.fwk.util.config.UtilConfig;

import lombok.NoArgsConstructor;

/**
 * Spring configuration class for rules.
 * 
 * @author RAF
 */
@Configuration
@Import(value = { UtilConfig.class, PersistenceJpaConfig.class })
@ComponentScan("com.raf.descent.rule")
@NoArgsConstructor
public class RuleConfig {
  // RAS
}
