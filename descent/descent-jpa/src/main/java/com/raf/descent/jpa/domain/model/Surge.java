package com.raf.descent.jpa.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.fwk.jpa.domain.AbstractIdEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The persistent class for the SURGE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "SURGE", schema = "DESCENT")
@Getter
@Setter
@NoArgsConstructor
public class Surge extends AbstractIdEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -1164148975394911240L;

  /** The rule code. */
  @Column(name = "RULE_CODE", nullable = false, length = 30)
  private String ruleCode;

  /** The surge count. */
  @Column(name = "SURGE", nullable = false, precision = 1)
  private Integer surgeCount;

  /** The damage. */
  @Column(name = "DAMAGE", nullable = true, precision = 1)
  private Integer damage;

  /** The range. */
  @Column(name = "RANGE", nullable = true, precision = 1)
  private Integer range;

  /** The ability name. */
  @Column(name = "ABILITY", length = 30)
  private String abilityName;

  /** The abilityValue. */
  @Column(name = "ABILITY_VALUE", precision = 1)
  private Integer abilityValue;

  /** The ability. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ABILITY", insertable = false, updatable = false)
  private Ability ability;

  /**
   * Defines the ability.
   * 
   * @param ability
   *          the ability to set
   */
  public void setAbility(final Ability ability) {
    this.ability = ability;
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractIdEntity#appendId(ToStringBuilder)
   */
  @Override
  protected final void appendId(final ToStringBuilder builder) {
    builder.append("ruleCode", this.ruleCode).append("surgeCount", this.surgeCount).append("damage", this.damage)
        .append("range", this.range).append("abilityName", this.abilityName).append("abilityValue", this.abilityValue);
    if (this.ability != null && Ability.class.equals(this.ability.getClass())) {
      builder.append("ability", this.ability);
    }
  }

}
