package com.raf.descent.jpa.domain.card;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.model.AbstractExpansionEntity;
import com.raf.descent.jpa.domain.model.Archetype;
import com.raf.descent.jpa.domain.model.Dice;

/**
 * The persistent class for the HERO database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "HERO", schema = "DESCENT")
public class Hero extends AbstractExpansionEntity {

  /** Serial UID. */
  private static final long serialVersionUID = 8821650335118007446L;

  /** The archetype name. */
  @Column(name = "ARCHETYPE", nullable = false, length = 30)
  private String archetypeName;

  /** The archetype. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ARCHETYPE", nullable = false, insertable = false, updatable = false)
  private Archetype archetype;

  /** The speed value. */
  @Column(nullable = false, precision = 1)
  private Integer speed;

  /** The health value. */
  @Column(nullable = false, precision = 2)
  private Integer health;

  /** The stamina value. */
  @Column(nullable = false, precision = 1)
  private Integer stamina;

  /** The defense dice name. */
  @Column(name = "DEFENSE", nullable = false, length = 30)
  private String defenseName;

  /** The defense base value. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "DEFENSE", nullable = false, insertable = false, updatable = false)
  private Dice defense;

  /** The might value. */
  @Column(nullable = false, precision = 1)
  private Integer might;

  /** The knowledge value. */
  @Column(nullable = false, precision = 1)
  private Integer knowledge;

  /** The willpower value. */
  @Column(nullable = false, precision = 1)
  private Integer willpower;

  /** The awareness value. */
  @Column(nullable = false, precision = 1)
  private Integer awareness;

  /** The ability code. */
  @Column(name = "ABILITY_CODE", nullable = false, length = 30)
  private String abilityCode;

  /** The feat code. */
  @Column(name = "FEAT_CODE", nullable = false, length = 30)
  private String featCode;

  /**
   * Constructor.
   */
  public Hero() {
    super();
  }

  /**
   * Returns the archetype name.
   * 
   * @return the archetypeName
   */
  public String getArchetypeName() {
    return this.archetypeName;
  }

  /**
   * Defines the archetype name.
   * 
   * @param archetypeName
   *          the archetypeName to set
   */
  public void setArchetypeName(final String archetypeName) {
    this.archetypeName = archetypeName;
  }

  /**
   * Returns the archetype.
   * 
   * @return the archetype
   */
  public Archetype getArchetype() {
    return this.archetype;
  }

  /**
   * Defines the archetype.
   * 
   * @param archetype
   *          the archetype to set
   */
  public void setArchetype(final Archetype archetype) {
    this.archetype = archetype;
  }

  /**
   * Returns the speed.
   * 
   * @return the speed
   */
  public Integer getSpeed() {
    return this.speed;
  }

  /**
   * Defines the speed.
   * 
   * @param speed
   *          the speed to set
   */
  public void setSpeed(final Integer speed) {
    this.speed = speed;
  }

  /**
   * Returns the health.
   * 
   * @return the health
   */
  public Integer getHealth() {
    return this.health;
  }

  /**
   * Defines the health.
   * 
   * @param health
   *          the health to set
   */
  public void setHealth(final Integer health) {
    this.health = health;
  }

  /**
   * Returns the stamina.
   * 
   * @return the stamina
   */
  public Integer getStamina() {
    return this.stamina;
  }

  /**
   * Defines the stamina.
   * 
   * @param stamina
   *          the stamina to set
   */
  public void setStamina(final Integer stamina) {
    this.stamina = stamina;
  }

  /**
   * Returns the defense dice name.
   * 
   * @return the defenseName
   */
  public String getDefenseName() {
    return this.defenseName;
  }

  /**
   * Defines the defense dice name.
   * 
   * @param defenseName
   *          the defenseName to set
   */
  public void setDefenseName(final String defenseName) {
    this.defenseName = defenseName;
  }

  /**
   * Returns the defense.
   * 
   * @return the defense
   */
  public Dice getDefense() {
    return this.defense;
  }

  /**
   * Defines the defense.
   * 
   * @param defense
   *          the defense to set
   */
  public void setDefense(final Dice dice) {
    this.defense = dice;
  }

  /**
   * Returns the might.
   * 
   * @return the might
   */
  public Integer getMight() {
    return this.might;
  }

  /**
   * Defines the might.
   * 
   * @param might
   *          the might to set
   */
  public void setMight(final Integer might) {
    this.might = might;
  }

  /**
   * Returns the knowledge.
   * 
   * @return the knowledge
   */
  public Integer getKnowledge() {
    return this.knowledge;
  }

  /**
   * Defines the knowledge.
   * 
   * @param knowledge
   *          the knowledge to set
   */
  public void setKnowledge(final Integer knowledge) {
    this.knowledge = knowledge;
  }

  /**
   * Returns the willpower.
   * 
   * @return the willpower
   */
  public Integer getWillpower() {
    return this.willpower;
  }

  /**
   * Defines the willpower.
   * 
   * @param willpower
   *          the willpower to set
   */
  public void setWillpower(final Integer willpower) {
    this.willpower = willpower;
  }

  /**
   * Returns the awareness.
   * 
   * @return the awareness
   */
  public Integer getAwareness() {
    return this.awareness;
  }

  /**
   * Defines the awareness.
   * 
   * @param awareness
   *          the awareness to set
   */
  public void setAwareness(final Integer awareness) {
    this.awareness = awareness;
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
   * Returns the feat code.
   * 
   * @return the featCode
   */
  public String getFeatCode() {
    return this.featCode;
  }

  /**
   * Defines the feat code.
   * 
   * @param featCode
   *          the featCode to set
   */
  public void setFeatCode(final String featCode) {
    this.featCode = featCode;
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
    builder.append("archetypeName", this.archetypeName).append("speed", this.speed).append("health", this.health)
        .append("stamina", this.stamina).append("defense", this.defenseName).append("might", this.might)
        .append("knowledge", this.knowledge).append("willpower", this.willpower).append("awareness", this.awareness)
        .append("abilityCode", this.abilityCode).append("featCode", this.featCode);
    if (this.archetype != null && Archetype.class.equals(this.archetype.getClass())) {
      builder.append("archetype", this.archetype);
    }
  }

}
