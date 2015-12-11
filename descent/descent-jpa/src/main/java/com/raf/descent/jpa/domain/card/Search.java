package com.raf.descent.jpa.domain.card;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.model.AbstractExpansionEntity;
import com.raf.descent.jpa.domain.model.AttackType;
import com.raf.descent.jpa.domain.model.Trait;

/**
 * The persistent class for the SEARCH database table.
 * 
 */
@Entity
@Table(name = "SEARCH", schema = "DESCENT")
public class Search extends AbstractExpansionEntity {

  /** Serial UID. */
  private static final long serialVersionUID = 5182466893676410840L;

  /** The ability code. */
  @Column(name = "ABILITY_CODE", nullable = false, length = 30)
  private String abilityCode;

  /** The attack type name. */
  @Column(name = "ATTACK_TYPE", length = 30)
  private String attackTypeName;

  /** The gold. */
  @Column(precision = 2)
  private Integer gold;

  /** The count. */
  @Column(name = "\"COUNT\"", nullable = false, precision = 1)
  private Integer count;

  /** The attack type. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ATTACK_TYPE", insertable = false, updatable = false)
  private AttackType attackType;

  /** The list of dices. */
  @OneToMany(mappedBy = "search", fetch = FetchType.LAZY)
  private List<SearchDice> dices;

  /** The list of traits. */
  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "SEARCH_TRAIT", schema = "DESCENT", joinColumns = {
      @JoinColumn(name = "SEARCH", nullable = false, referencedColumnName = "NAME"),
      @JoinColumn(name = "EXPANSION", nullable = false, referencedColumnName = "EXPANSION") }, inverseJoinColumns = { @JoinColumn(name = "TRAIT", nullable = false) })
  private List<Trait> traits;

  /**
   * Constructor.
   */
  public Search() {
    super();
  }

  /**
   * Returns the ability code.
   * 
   * @return the abilityCode
   */
  public String getAbilityCode() {
    return this.abilityCode;
  }

  /**
   * Defines the ability code.
   * 
   * @param abilityCode
   *          the abilityCode to set
   */
  public void setAbilityCode(final String abilityCode) {
    this.abilityCode = abilityCode;
  }

  /**
   * Returns the attack type name.
   * 
   * @return the attackTypeName
   */
  public String getAttackTypeName() {
    return this.attackTypeName;
  }

  /**
   * Defines the attack type name.
   * 
   * @param attackTypeName
   *          the attackTypeName to set
   */
  public void setAttackTypeName(final String attackTypeName) {
    this.attackTypeName = attackTypeName;
  }

  /**
   * Returns the gold.
   * 
   * @return the gold
   */
  public Integer getGold() {
    return this.gold;
  }

  /**
   * Defines the gold.
   * 
   * @param gold
   *          the gold to set
   */
  public void setGold(final Integer gold) {
    this.gold = gold;
  }

  /**
   * Returns the count.
   * 
   * @return the count
   */
  public Integer getCount() {
    return this.count;
  }

  /**
   * Defines the count.
   * 
   * @param count
   *          the count to set
   */
  public void setCount(final Integer count) {
    this.count = count;
  }

  /**
   * Returns the attack type.
   * 
   * @return the attackType
   */
  public AttackType getAttackType() {
    return this.attackType;
  }

  /**
   * Defines the attack type.
   * 
   * @param attackType
   *          the attackType to set
   */
  public void setAttackType(final AttackType attackType) {
    this.attackType = attackType;
  }

  /**
   * Returns the list of dices.
   * 
   * @return the dices
   */
  public List<SearchDice> getDices() {
    return this.dices;
  }

  /**
   * Defines the list of dices.
   * 
   * @param dices
   *          the dices to set
   */
  public void setDices(final List<SearchDice> dices) {
    this.dices = dices;
  }

  /**
   * Returns the list of traits.
   * 
   * @return the traits
   */
  public List<Trait> getTraits() {
    return this.traits;
  }

  /**
   * Defines the list of traits.
   * 
   * @param traits
   *          the traits to set
   */
  public void setTraits(final List<Trait> traits) {
    this.traits = traits;
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractExpansionEntity#appendExpansion(ToStringBuilder)
   */
  @Override
  protected void appendExpansion(final ToStringBuilder builder) {
    builder.append("abilityCode", this.abilityCode).append("attackTypeName", this.attackTypeName)
        .append("gold", this.gold).append("count", this.count);
  }

}
