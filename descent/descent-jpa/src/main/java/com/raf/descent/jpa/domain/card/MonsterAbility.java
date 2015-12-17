package com.raf.descent.jpa.domain.card;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.AbstractEntity;
import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.model.Ability;

/**
 * The persistent class for the MONSTER_ABILITY database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "MONSTER_ABILITY", schema = "DESCENT")
public class MonsterAbility extends AbstractEntity implements DomainEntity<MonsterAbilityPk> {

  /** Serial UID. */
  private static final long serialVersionUID = -2042593353573284690L;

  /** The identifier. */
  @EmbeddedId
  private MonsterAbilityPk ident;

  /** The ability value. */
  @Column(precision = 1)
  private Integer value;

  /** The action indicator. */
  @Column
  private Boolean action;

  /** The monster stat. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumns({
      @JoinColumn(name = "EXPANSION", referencedColumnName = "EXPANSION", nullable = false, insertable = false, updatable = false),
      @JoinColumn(name = "MONSTER_GROUP", referencedColumnName = "MONSTER_GROUP", nullable = false, insertable = false, updatable = false),
      @JoinColumn(name = "ACT", referencedColumnName = "ACT", nullable = false, insertable = false, updatable = false),
      @JoinColumn(name = "MONSTER_TYPE", referencedColumnName = "MONSTER_TYPE", nullable = false, insertable = false, updatable = false) })
  private MonsterStat monsterStat;

  /** The ability. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ABILITY", insertable = false, updatable = false)
  private Ability ability;

  /**
   * Constructor.
   */
  public MonsterAbility() {
    super();
  }

  /**
   * Returns the serializable ID of domain entity.
   *
   * @return the ID
   * @see DomainEntity#getId()
   */
  @Override
  public MonsterAbilityPk getId() {
    return getIdent();
  }

  /**
   * Returns the identifier.
   * 
   * @return the ident
   */
  public MonsterAbilityPk getIdent() {
    return this.ident;
  }

  /**
   * Defines the identifier.
   * 
   * @param ident
   *          the ident to set
   * @see DomainEntity#setIdent(MonsterAbilityPk)
   */
  @Override
  public void setIdent(final MonsterAbilityPk ident) {
    this.ident = ident;
  }

  /**
   * Returns the monster group name.
   *
   * @return the monster group name
   */
  public String getMonsterGroupName() {
    if (this.ident == null) {
      this.ident = new MonsterAbilityPk();
    }
    return this.ident.getName();
  }

  /**
   * Returns the expansion name.
   *
   * @return the expansion name
   */
  public String getExpansionName() {
    if (this.ident == null) {
      this.ident = new MonsterAbilityPk();
    }
    return this.ident.getExpansionName();
  }

  /**
   * Returns the act name.
   *
   * @return the act name
   */
  public String getActName() {
    if (this.ident == null) {
      this.ident = new MonsterAbilityPk();
    }
    return this.ident.getActName();
  }

  /**
   * Returns the monster type name.
   *
   * @return the monster type name
   */
  public String getMonsterTypeName() {
    if (this.ident == null) {
      this.ident = new MonsterAbilityPk();
    }
    return this.ident.getMonsterTypeName();
  }

  /**
   * Returns the ability name.
   *
   * @return the ability name
   */
  public String getAbilityName() {
    if (this.ident == null) {
      this.ident = new MonsterAbilityPk();
    }
    return this.ident.getAbility();
  }

  /**
   * Returns the value.
   * 
   * @return the value
   */
  public Integer getValue() {
    return this.value;
  }

  /**
   * Returns the value.
   * 
   * @param value
   *          the value to set
   */
  public void setValue(final Integer value) {
    this.value = value;
  }

  /**
   * Returns the action.
   * 
   * @return the action
   */
  public Boolean getAction() {
    return this.action;
  }

  /**
   * Returns the action.
   * 
   * @param action
   *          the action to set
   */
  public void setAction(final Boolean action) {
    this.action = action;
  }

  /**
   * Returns the monster stat.
   * 
   * @return the monsterStat
   */
  public MonsterStat getMonsterStat() {
    return this.monsterStat;
  }

  /**
   * Defines the monster stat.
   * 
   * @param monsterStat
   *          the monsterStat to set
   */
  public void setMonsterStat(final MonsterStat monsterGroupAct) {
    this.monsterStat = monsterGroupAct;
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
  protected void append(final ToStringBuilder builder) {
    if (this.ident != null) {
      builder.append("monsterGroupName", this.ident.getName()).append("expansionName", this.ident.getExpansionName())
          .append("actName", this.ident.getActName()).append("monsterTypeName", this.ident.getMonsterTypeName())
          .append("abilityName", this.ident.getAbility());
    }
    builder.append("value", this.value).append("action", this.action);
    if (this.monsterStat != null && MonsterStat.class.equals(this.monsterStat.getClass())) {
      builder.append("monsterStat", this.monsterStat);
    }
    if (this.ability != null && Ability.class.equals(this.ability.getClass())) {
      builder.append("ability", this.ability);
    }
  }

}
