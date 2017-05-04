package com.raf.descent.jpa.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.fwk.jpa.domain.AbstractNamedEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The persistent class for the CONDITION database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "CONDITION", schema = "DESCENT")
@Getter
@Setter
@NoArgsConstructor
public class Condition extends AbstractNamedEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -1164148975394911240L;

  /** The rule code. */
  @Column(name = "RULE_CODE", nullable = false, length = 30)
  private String ruleCode;

  /** The expansion name. */
  @Column(name = "EXPANSION", nullable = false, length = 30)
  private String expansionName;

  /** The image. */
  @Column(name = "IMAGE", nullable = false, length = 30)
  private String image;

  /** The expansion. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "EXPANSION", nullable = false, insertable = false, updatable = false)
  private Expansion expansion;

  /**
   * Defines the expansion.
   * 
   * @param expansion
   *          the expansion to set
   */
  public void setExpansion(final Expansion expansion) {
    this.expansion = expansion;
    if (this.expansion != null) {
      this.expansionName = this.expansion.getName();
    }
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractNamedEntity#appendNamed(ToStringBuilder)
   */
  @Override
  protected final void appendNamed(final ToStringBuilder builder) {
    builder.append("ruleCode", this.ruleCode).append("expansionName", this.expansionName).append("image", this.image);
    if (this.expansion != null && Expansion.class.equals(this.expansion.getClass())) {
      builder.append("expansion", this.expansion);
    }
  }

}
