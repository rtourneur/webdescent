package com.raf.descent.jpa.domain.card;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.model.AbstractExpansionEntity;
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

  /** The gold. */
  @Column(precision = 2)
  private Integer gold;

  /** The list of traits. */
  @ManyToMany
  @JoinTable(name = "SEARCH_TRAIT", joinColumns = {
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

  /* (non-Javadoc)
   * @see com.raf.descent.jpa.domain.model.AbstractExpansionEntity#appendExpansion(org.apache.commons.lang3.builder.ToStringBuilder)
   */
  @Override
  protected void appendExpansion(ToStringBuilder builder) {
    // TODO Auto-generated method stub
    
  }

}
