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
import com.raf.descent.jpa.domain.model.MonsterType;

/**
 * The persistent class for the MONSTER_STAT database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "MONSTER_STAT", schema = "DESCENT")
public class MonsterStat extends AbstractEntity implements DomainEntity<MonsterStatPk> {

  /** Serial UID. */
  private static final long serialVersionUID = 8479396877170430878L;

  /** The identifier. */
  @EmbeddedId
  private MonsterStatPk ident;

  /** The speed value. */
  @Column(nullable = false, precision = 1)
  private Integer speed;

  /** The health value. */
  @Column(nullable = false, precision = 2)
  private Integer health;

  /** The monster group act. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumns({
      @JoinColumn(name = "EXPANSION", referencedColumnName = "EXPANSION", nullable = false, insertable = false, updatable = false),
      @JoinColumn(name = "MONSTER_GROUP", referencedColumnName = "MONSTER_GROUP", nullable = false, insertable = false, updatable = false),
      @JoinColumn(name = "ACT", referencedColumnName = "ACT", nullable = false, insertable = false, updatable = false) })
  private MonsterGroupAct monsterGroupAct;

  /** The monster type. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "MONSTER_TYPE", insertable = false, updatable = false)
  private MonsterType monsterType;

  /**
   * Constructor.
   */
  public MonsterStat() {
    super();
  }

  /**
   * Returns the serializable ID of domain entity.
   *
   * @return the ID
   * @see DomainEntity#getId()
   */
  @Override
  public MonsterStatPk getId() {
    return getIdent();
  }

  /**
   * Returns the identifier.
   * 
   * @return the ident
   */
  public MonsterStatPk getIdent() {
    return this.ident;
  }

  /**
   * Defines the identifier.
   * 
   * @param ident
   *          the ident to set
   * @see DomainEntity#setIdent(MonsterStatPk)
   */
  @Override
  public void setIdent(final MonsterStatPk ident) {
    this.ident = ident;
  }

  /**
   * Returns the monster group name.
   *
   * @return the monster group name
   */
  public String getMonsterGroupName() {
    if (this.ident == null) {
      this.ident = new MonsterStatPk();
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
      this.ident = new MonsterStatPk();
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
      this.ident = new MonsterStatPk();
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
      this.ident = new MonsterStatPk();
    }
    return this.ident.getMonsterType();
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
   * Returns the monster group act.
   * 
   * @return the monsterGroupAct
   */
  public MonsterGroupAct getMonsterGroupAct() {
    return this.monsterGroupAct;
  }

  /**
   * Defines the monster group act.
   * 
   * @param monsterGroupAct
   *          the monsterGroupAct to set
   */
  public void setMonsterGroupAct(final MonsterGroupAct monsterGroupAct) {
    this.monsterGroupAct = monsterGroupAct;
  }

  /**
   * Returns the monster type.
   * 
   * @return the monsterType
   */
  public MonsterType getMonsterType() {
    return this.monsterType;
  }

  /**
   * Defines the monster type.
   * 
   * @param monsterType
   *          the monsterType to set
   */
  public void setMonsterType(final MonsterType monsterType) {
    this.monsterType = monsterType;
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
          .append("actName", this.ident.getActName()).append("monsterTypeName", this.ident.getMonsterType());
    }
    builder.append("speed", this.speed).append("health", this.health);
    if (this.monsterGroupAct != null && MonsterGroupAct.class.equals(this.monsterGroupAct.getClass())) {
      builder.append("monsterGroupAct", this.monsterGroupAct);
    }
    if (this.monsterType != null && MonsterType.class.equals(this.monsterType.getClass())) {
      builder.append("monsterType", this.monsterType);
    }
  }

}
