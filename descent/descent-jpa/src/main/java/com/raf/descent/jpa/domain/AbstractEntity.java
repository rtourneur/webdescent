package com.raf.descent.jpa.domain;

import javax.persistence.MappedSuperclass;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Abstract super class for domain entities.
 *
 * @author RAF
 */
@MappedSuperclass
public abstract class AbstractEntity {

  /**
   * Constructor.
   */
  public AbstractEntity() {
    super();
  }

  /**
   * Generate the toString.
   *
   * @see Object#toString()
   */
  @Override
  public final String toString() {
    final ToStringBuilder builder = new ToStringBuilder(this);
    append(builder);
    return builder.toString();
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   */
  protected abstract void append(ToStringBuilder builder);

}
