package com.raf.descent.jpa.domain;

import java.io.Serializable;

/**
 * Interface for Domain entities.
 *
 * @param <I>
 *          the serializable ID.
 * @author RAF
 */
public interface DomainNamedEntity<I extends Serializable> extends DomainEntity<I> {

  /**
   * Returns the name.
   *
   * @return the name
   */
  String getName();

  /**
   * Defines the name.
   *
   * @param name
   *          the name to set
   */
  void setName(String name);

  /**
   * Returns the message code.
   *
   * @return the message code
   */
  String getMessageCode();

  /**
   * Defines the message code.
   *
   * @param messageCode
   *          the message code to set
   */
  void setMessageCode(String messageCode);

}
