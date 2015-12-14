package com.raf.descent.jpa.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.AbstractNamedEntity;

/**
 * The persistent class for the CONDITION database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "CONDITION", schema = "DESCENT")
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
  @Column(nullable = false, length = 30)
  private String image;

  /** The expansion. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "EXPANSION", nullable = false, insertable = false, updatable = false)
  private Expansion expansion;

  /**
   * Constructor.
   */
  public Condition() {
    super();
  }

  /**
   * Returns the rule code.
   * 
   * @return the ruleCode
   */
  public String getRuleCode() {
    return this.ruleCode;
  }

  /**
   * Defines the rule code.
   * 
   * @param ruleCode
   *          the ruleCode to set
   */
  public void setRuleCode(final String ruleCode) {
    this.ruleCode = ruleCode;
  }

  /**
   * Returns the expansion name.
   * 
   * @return the expansionName
   */
  public String getExpansionName() {
    return this.expansionName;
  }

  /**
   * Defines the expansion name.
   * 
   * @param expansionName
   *          the expansionName to set
   */
  public void setExpansionName(final String expansionName) {
    this.expansionName = expansionName;
  }

  /**
   * Returns the image.
   * 
   * @return the image
   */
  public String getImage() {
    return this.image;
  }

  /**
   * Defines the image.
   * 
   * @param image
   *          the image to set
   */
  public void setImage(final String image) {
    this.image = image;
  }

  /**
   * Returns the expansion.
   * 
   * @return the expansion
   */
  public Expansion getExpansion() {
    return this.expansion;
  }

  /**
   * Defines the expansion.
   * 
   * @param expansion
   *          the expansion to set
   */
  public void setExpansion(final Expansion expansion) {
    this.expansion = expansion;
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractNamedEntity#appendNamed(ToStringBuilder)
   */
  @Override
  protected void appendNamed(final ToStringBuilder builder) {
    builder.append("ruleCode", this.ruleCode).append("expansionName", this.expansionName).append("image", this.image);
    if (this.expansion != null && Expansion.class.equals(this.expansion.getClass())) {
      builder.append("expansion", this.expansion);
    }
  }

}
