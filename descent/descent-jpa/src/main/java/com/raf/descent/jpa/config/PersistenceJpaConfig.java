package com.raf.descent.jpa.config;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.raf.descent.util.config.UtilConfig;


/**
 * Spring configuration class for persistence.
 * 
 * @author RAF
 */
@Configuration
@Import(value = { UtilConfig.class })
@ComponentScan("com.raf.descent.jpa")
@EnableTransactionManagement
public class PersistenceJpaConfig {

  /**
   * Constructor.
   */
  public PersistenceJpaConfig() {
    super();
  }

  /**
   * Initialize the entity manager factory.
   * 
   * @return entity manager factory
   * @throws NamingException
   */
  @Bean
  public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws NamingException {
    final LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
    emf.setDataSource(dataSource());
    emf.setPackagesToScan(new String[] { "com.raf.descent.jpa.domain"});

    final JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
    emf.setJpaVendorAdapter(vendorAdapter);
    emf.setJpaProperties(additionalProperties());
    emf.setPersistenceUnitName("descent");

    return emf;
  }

  /**
   * Set up the datasource.
   * 
   * @return the datasource
   * @throws NamingException
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
    properties.setProperty("hibernate.dialect", "org.hibernate.dialect.DerbyTenSevenDialect");
    properties.setProperty("hibernate.show_sql", "true");
    properties.setProperty("hibernate.format_sql", "false");
    return properties;
  }
}
