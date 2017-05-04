package com.raf.descent.jpa.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.fwk.jpa.domain.AbstractNamedEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The persistent class for the ABILITY database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "ABILITY", schema = "DESCENT")
@Getter
@Setter
@NoArgsConstructor
public class Ability extends AbstractNamedEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -1164148975394911240L;

  /** The rule code. */
  @Column(name = "RULE_CODE", nullable = false, length = 30)
  private String ruleCode;

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractNamedEntity#appendNamed(ToStringBuilder)
   */
  @Override
  protected final void appendNamed(final ToStringBuilder builder) {
    builder.append("ruleCode", this.ruleCode);
  }

}
