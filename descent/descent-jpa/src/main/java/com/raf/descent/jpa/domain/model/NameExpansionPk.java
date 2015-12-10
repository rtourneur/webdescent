package com.raf.descent.jpa.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The primary key class for database table with NAME and EXPANSION as PRIMARY KEY.
 * 
 * @author RAF
 */
@Embeddable
public class NameExpansionPk implements Serializable {

  /** Serial UID. */
  private static final long serialVersionUID = 6187498875500516420L;

  /** The name. */
  @Column(unique = true, nullable = false, length = 30)
  private String name;

  /** The expansion. */
  @Column(insertable = false, updatable = false, unique = true, nullable = false, length = 30)
  private String expansion;

  /**
   * Constructor.
   */
  public NameExpansionPk() {
    super();
  }

  /**
   * Returns the name.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Defines the name.
   *
   * @param name
   *          the name to set
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Returns the expansion.
   * 
   * @return the expansion
   */
  public String getExpansion() {
    return this.expansion;
  }

  /**
   * Defines the expansion.
   * 
   * @param expansion
   *          the expansion to set
   */
  public void setExpansion(final String expansion) {
    this.expansion = expansion;
  }

  /**
   * Implementation for hashCode.
   * 
   * @see Object#hashCode()
   */
  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(this.name).append(this.expansion).toHashCode();
  }

  /**
   * Implementation for equals.
   * 
   * @see Object#equals(Object)
   */
  @Override
  public boolean equals(final Object obj) {
    boolean equals;
    if (this == obj) {
      equals = true;
    } else {
      if (obj != null && getClass().equals(obj.getClass())) {
        final NameExpansionPk other = (NameExpansionPk) obj;
        equals = new EqualsBuilder().append(this.name, other.name).append(this.expansion, other.expansion).isEquals();
      } else {
        equals = false;
      }
    }
    return equals;
  }

  /**
   * Generate the toString.
   *
   * @see Object#toString()
   */
  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
