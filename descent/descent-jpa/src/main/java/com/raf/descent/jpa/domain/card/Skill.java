package com.raf.descent.jpa.domain.card;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.model.Clazz;
import com.raf.fwk.jpa.domain.AbstractEntity;
import com.raf.fwk.jpa.domain.AbstractNamedEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The persistent class for the SKILL database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "SKILL", schema = "DESCENT")
@Getter
@Setter
@NoArgsConstructor
public class Skill extends AbstractNamedEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -5703651183951258200L;

  /** The class name. */
  @Column(name = "CLASS", nullable = false, length = 30)
  private String className;

  /** The experience cost. */
  @Column(name = "EXPERIENCE", nullable = false, precision = 1)
  private Integer experience;

  /** The rule code. */
  @Column(name = "RULE_CODE", nullable = false, length = 40)
  private String ruleCode;

  /** The stamina cost. */
  @Column(name = "COST", nullable = false, length = 1)
  private String cost;

  /** The class. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "CLASS", nullable = false, insertable = false, updatable = false)
  private Clazz clazz;

  /**
   * Defines the class.
   * 
   * @param clazz
   *          the clazz to set
   */
  public void setClazz(final Clazz clazz) {
    this.clazz = clazz;
    if (this.clazz != null) {
      this.className = this.clazz.getName();
    }
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractEntity#append(ToStringBuilder)
   */
  @Override
  protected final void appendNamed(final ToStringBuilder builder) {
    builder.append("className", this.className).append("experience", this.experience).append("ruleCode", this.ruleCode)
        .append("cost", this.cost);
    if (this.clazz != null && Clazz.class.equals(this.clazz.getClass())) {
      builder.append("clazz", this.clazz);
    }
  }
}
