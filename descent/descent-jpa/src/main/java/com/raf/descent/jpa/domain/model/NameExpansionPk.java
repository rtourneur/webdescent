package com.raf.descent.jpa.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The primary key class for database table with NAME and EXPANSION as PRIMARY KEY.
 * 
 * @author RAF
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class NameExpansionPk implements Serializable {

  /** Serial UID. */
  private static final long serialVersionUID = 6187498875500516420L;

  /** The name. */
  @Column(name = "NAME", nullable = false, length = 30)
  private String name;

  /** The expansion. */
  @Column(name = "EXPANSION", nullable = false, length = 30)
  private String expansion;

  /**
   * Implementation for hashCode.
   * 
   * @see Object#hashCode()
   */
  @Override
  public final int hashCode() {
    return new HashCodeBuilder().append(this.name).append(this.expansion).toHashCode();
  }

  /**
   * Implementation for equals.
   * 
   * @see Object#equals(Object)
   */
  @Override
  public final boolean equals(final Object obj) {
    final boolean equals;
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
  public final String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
