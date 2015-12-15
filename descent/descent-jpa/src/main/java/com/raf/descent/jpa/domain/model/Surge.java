package com.raf.descent.jpa.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.AbstractEntity;
import com.raf.descent.jpa.domain.DomainEntity;

/**
 * The persistent class for the SURGE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "SURGE", schema = "DESCENT")
public class Surge extends AbstractEntity implements DomainEntity<Integer> {

  /** Serial UID. */
  private static final long serialVersionUID = -1164148975394911240L;

  /** The identifier. */
  @Id
  @Column(name = "ID", unique = true, nullable = false, length = 30)
  private Integer ident;

  /** The rule code. */
  @Column(name = "RULE_CODE", nullable = false, length = 30)
  private String ruleCode;

  /** The surge count. */
  @Column(name = "SURGE", nullable = false, precision = 1)
  private Integer surgeCount;

  /** The damage. */
  @Column(nullable = true, precision = 1)
  private Integer damage;

  /** The range. */
  @Column(nullable = true, precision = 1)
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
   * Constructor.
   */
  public Surge() {
    super();
  }

  /**
   * Returns the serializable ID of domain entity.
   *
   * @return the ID
   * @see DomainEntity#getId()
   */
  @Override
  public final Integer getId() {
    return getIdent();
  }

  /**
   * Returns the identifier.
   * 
   * @return the ident
   */
  public Integer getIdent() {
    return this.ident;
  }

  /**
   * Defines the identifier.
   *
   * @param ident
   *          the identifier to set
   * @see DomainEntity#setIdent(Integer)
   */
  @Override
  public final void setIdent(final Integer ident) {
    this.ident = ident;
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
   * Returns the surge count.
   * 
   * @return the surgeCount
   */
  public Integer getSurgeCount() {
    return this.surgeCount;
  }

  /**
   * Defines the surge count.
   * 
   * @param surgeCount
   *          the surgeCount to set
   */
  public void setSurgeCount(final Integer surge) {
    this.surgeCount = surge;
  }

  /**
   * Returns the damage.
   * 
   * @return the damage
   */
  public Integer getDamage() {
    return this.damage;
  }

  /**
   * Defines the damage.
   * 
   * @param damage
   *          the damage to set
   */
  public void setDamage(final Integer damage) {
    this.damage = damage;
  }

  /**
   * Returns the range.
   * 
   * @return the range
   */
  public Integer getRange() {
    return this.range;
  }

  /**
   * Defines the range.
   * 
   * @param range
   *          the range to set
   */
  public void setRange(final Integer range) {
    this.range = range;
  }

  /**
   * Returns the ability name.
   * 
   * @return the abilityName
   */
  public String getAbilityName() {
    return this.abilityName;
  }

  /**
   * Defines the ability name.
   * 
   * @param abilityName
   *          the abilityName to set
   */
  public void setAbilityName(final String abilityName) {
    this.abilityName = abilityName;
  }

  /**
   * Returns the ability value.
   * 
   * @return the abilityValue
   */
  public Integer getAbilityValue() {
    return this.abilityValue;
  }

  /**
   * Defines the ability value.
   * 
   * @param abilityValue
   *          the abilityValue to set
   */
  public void setAbilityValue(final Integer abilityValue) {
    this.abilityValue = abilityValue;
  }

  /**
   * Returns the ability.
   * 
   * @return the ability
   */
  public Ability getAbility() {
    return this.ability;
  }

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
   * @see AbstractEntity#append(ToStringBuilder)
   */
  @Override
  protected final void append(final ToStringBuilder builder) {
    builder.append("ident", this.ident).append("ruleCode", this.ruleCode).append("surgeCount", this.surgeCount)
        .append("damage", this.damage).append("range", this.range).append("abilityName", this.abilityName)
        .append("abilityValue", this.abilityValue);
    if (this.ability != null && Ability.class.equals(this.ability.getClass())) {
      builder.append("ability", this.ability);
    }
  }

}
