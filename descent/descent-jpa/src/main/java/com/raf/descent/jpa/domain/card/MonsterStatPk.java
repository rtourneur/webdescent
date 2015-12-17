package com.raf.descent.jpa.domain.card;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The primary key class for the MONSTER_STAT database table.
 * 
 * @author RAF
 */
@Embeddable
public class MonsterStatPk implements Serializable {

  /** Serial UID. */
  private static final long serialVersionUID = -464257149999181187L;

  /** The monster group act key. */
  @Embedded
  private MonsterGroupActPk monsterGroupActPk;

  /** The monster type. */
  @Column(name = "MONSTER_TYPE", unique = true, nullable = false, length = 30)
  private String monsterType;

  /**
   * Constructor.
   */
  public MonsterStatPk() {
    super();
  }

  /**
   * Returns the monster group act key.
   * 
   * @return the monsterGroupActPk
   */
  public MonsterGroupActPk getMonsterGroupActPk() {
    return this.monsterGroupActPk;
  }

  /**
   * Defines the monster group act key.
   * 
   * @param monsterGroupActPk
   *          the monsterGroupActPk to set
   */
  public void setMonsterGroupActPk(final MonsterGroupActPk nameExpansionPk) {
    this.monsterGroupActPk = nameExpansionPk;
  }

  /**
   * Returns the name.
   *
   * @return the name
   */
  public String getName() {
    if (this.monsterGroupActPk == null) {
      this.monsterGroupActPk = new MonsterGroupActPk();
    }
    return this.monsterGroupActPk.getName();
  }

  /**
   * Defines the name.
   *
   * @param name
   *          the name to set
   */
  public void setName(final String name) {
    if (this.monsterGroupActPk == null) {
      this.monsterGroupActPk = new MonsterGroupActPk();
    }
    this.monsterGroupActPk.setName(name);
  }

  /**
   * Returns the expansion name.
   *
   * @return the expansion name
   */
  public String getExpansionName() {
    if (this.monsterGroupActPk == null) {
      this.monsterGroupActPk = new MonsterGroupActPk();
    }
    return this.monsterGroupActPk.getExpansionName();
  }

  /**
   * Defines the expansion name.
   *
   * @param expansionName
   *          the expansionName to set
   */
  public void setExpansionName(final String expansionName) {
    if (this.monsterGroupActPk == null) {
      this.monsterGroupActPk = new MonsterGroupActPk();
    }
    this.monsterGroupActPk.setExpansionName(expansionName);
  }

  /**
   * Returns the act name.
   *
   * @return the act name
   */
  public String getActName() {
    if (this.monsterGroupActPk == null) {
      this.monsterGroupActPk = new MonsterGroupActPk();
    }
    return this.monsterGroupActPk.getAct();
  }

  /**
   * Defines the act name.
   *
   * @param actName
   *          the actName to set
   */
  public void setActName(final String actName) {
    if (this.monsterGroupActPk == null) {
      this.monsterGroupActPk = new MonsterGroupActPk();
    }
    this.monsterGroupActPk.setAct(actName);
  }

  /**
   * Returns the monster type.
   *
   * @return the monsterType
   */
  public String getMonsterType() {
    return this.monsterType;
  }

  /**
   * Defines the monster type.
   *
   * @param monsterType
   *          the monsterType to set
   */
  public void setMonsterType(final String monsterType) {
    this.monsterType = monsterType;
  }

  /**
   * Implementation for hashCode.
   * 
   * @see Object#hashCode()
   */
  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(this.monsterGroupActPk).append(this.monsterType).toHashCode();
  }

  /**
   * Implementation for equals.
   * 
   * @see Object#equals(Object)
   */
  @Override
  public boolean equals(final Object obj) {
    boolean equals;
    if (this == obj) {
      equals = true;
    } else {
      if (obj != null && getClass().equals(obj.getClass())) {
        final MonsterStatPk other = (MonsterStatPk) obj;
        equals = new EqualsBuilder().append(this.monsterGroupActPk, other.monsterGroupActPk)
            .append(this.monsterType, other.monsterType).isEquals();
      } else {
        equals = false;
      }
    }
    return equals;
  }

  /**
   * Generate the toString.
   *
   * @see Object#toString()
   */
  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
