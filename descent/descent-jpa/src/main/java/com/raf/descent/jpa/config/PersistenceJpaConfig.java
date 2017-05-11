package com.raf.descent.jpa.config;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.raf.fwk.util.config.UtilConfig;

import lombok.NoArgsConstructor;

/**
 * Spring configuration class for persistence.
 * 
 * @author RAF
 */
@Configuration
@Import(value = { UtilConfig.class })
@ComponentScan("com.raf.descent.jpa")
@PropertySource({ "classpath:persistence.properties" })
@EnableTransactionManagement
@NoArgsConstructor
public class PersistenceJpaConfig {

  /** Spring environment. */
  @Autowired
  private Environment env;

  /**
   * Initialize the entity manager factory.
   * 
   * @return entity manager factory
   * @throws NamingException
   *           if datasource not found in context
   */
  @Bean
  public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws NamingException {
    final LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
    emf.setDataSource(dataSource());
    emf.setPackagesToScan(new String[] { this.env.getProperty("package.scan") });

    final JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
    emf.setJpaVendorAdapter(vendorAdapter);
    emf.setJpaProperties(additionalProperties());
    emf.setPersistenceUnitName(this.env.getProperty("persistence.name"));

    return emf;
  }

  /**
   * Set up the datasource.
   * 
   * @return the datasource
   * @throws NamingException
   *           if datasource not found in context
   */
  @Bean
  public DataSource dataSource() throws NamingException {
    final Context ctx = new InitialContext();
    return (DataSource) ctx.lookup("java:/comp/env/jdbc/descent");
  }

  /**
   * Add the transaction manager.
   * 
   * @param emf
   *          the entity manager factory
   * @return the transaction manager
   */
  @Bean
  public PlatformTransactionManager transactionManager(final EntityManagerFactory emf) {
    final JpaTransactionManager trxManager = new JpaTransactionManager();
    trxManager.setEntityManagerFactory(emf);

    return trxManager;
  }

  /**
   * Returns the Persistence Exception Translation Processor.
   * 
   * @return the Persistence Exception Translation Processor
   */
  @Bean
  public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
    return new PersistenceExceptionTranslationPostProcessor();
  }

  /**
   * Returns the additional properties for hibernate.
   * 
   * @return the additional properties
   */
  private Properties additionalProperties() {
    final Properties properties = new Properties();
    properties.setProperty("hibernate.dialect", this.env.getProperty("hibernate.dialect"));
    properties.setProperty("hibernate.show_sql", this.env.getProperty("hibernate.show_sql"));
    properties.setProperty("hibernate.format_sql", this.env.getProperty("hibernate.format_sql"));
    return properties;
  }
}
