package com.raf.descent.jpa.domain.card;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The primary key class for the MONSTER_SURGE database table.
 * 
 * @author RAF
 */
@Embeddable
public class MonsterSurgePk implements Serializable {

  /** Serial UID. */
  private static final long serialVersionUID = 1316750280181193506L;

  /** The monster stat key. */
  @Embedded
  private MonsterStatPk monsterStatPk;

  /** The surge. */
  @Column(unique = true, nullable = false, length = 30)
  private Integer surge;

  /** The index. */
  @Column(unique = true, nullable = false, precision = 1)
  private Integer index;

  /**
   * Constructor.
   */
  public MonsterSurgePk() {
    super();
  }

  /**
   * Returns the name expansion key.
   * 
   * @return the monsterStatPk
   */
  public MonsterStatPk getMonsterStatPk() {
    return this.monsterStatPk;
  }

  /**
   * Defines the name expansion key.
   * 
   * @param monsterStatPk
   *          the monsterStatPk to set
   */
  public void setMonsterStatPk(final MonsterStatPk nameExpansionPk) {
    this.monsterStatPk = nameExpansionPk;
  }

  /**
   * Returns the name.
   *
   * @return the name
   */
  public String getName() {
    if (this.monsterStatPk == null) {
      this.monsterStatPk = new MonsterStatPk();
    }
    return this.monsterStatPk.getName();
  }

  /**
   * Defines the name.
   *
   * @param name
   *          the name to set
   */
  public void setName(final String name) {
    if (this.monsterStatPk == null) {
      this.monsterStatPk = new MonsterStatPk();
    }
    this.monsterStatPk.setName(name);
  }

  /**
   * Returns the expansion name.
   *
   * @return the expansion name
   */
  public String getExpansionName() {
    if (this.monsterStatPk == null) {
      this.monsterStatPk = new MonsterStatPk();
    }
    return this.monsterStatPk.getExpansionName();
  }

  /**
   * Defines the expansion name.
   *
   * @param expansionName
   *          the expansionName to set
   */
  public void setExpansionName(final String expansionName) {
    if (this.monsterStatPk == null) {
      this.monsterStatPk = new MonsterStatPk();
    }
    this.monsterStatPk.setExpansionName(expansionName);
  }

  /**
   * Returns the act name.
   *
   * @return the act name
   */
  public String getActName() {
    if (this.monsterStatPk == null) {
      this.monsterStatPk = new MonsterStatPk();
    }
    return this.monsterStatPk.getActName();
  }

  /**
   * Defines the act name.
   *
   * @param actName
   *          the actName to set
   */
  public void setActName(final String actName) {
    if (this.monsterStatPk == null) {
      this.monsterStatPk = new MonsterStatPk();
    }
    this.monsterStatPk.setActName(actName);
  }

  /**
   * Returns the monster type name.
   *
   * @return the monster type name
   */
  public String getMonsterTypeName() {
    if (this.monsterStatPk == null) {
      this.monsterStatPk = new MonsterStatPk();
    }
    return this.monsterStatPk.getMonsterType();
  }

  /**
   * Defines the monster type name.
   *
   * @param monsterTypeName
   *          the monsterTypeName to set
   */
  public void setMonsterTypeName(final String monsterTypeName) {
    if (this.monsterStatPk == null) {
      this.monsterStatPk = new MonsterStatPk();
    }
    this.monsterStatPk.setMonsterType(monsterTypeName);
  }

  /**
   * Returns the surge.
   *
   * @return the surge
   */
  public Integer getSurge() {
    return this.surge;
  }

  /**
   * Defines the surge.
   *
   * @param surge
   *          the surge to set
   */
  public void setSurge(final Integer surge) {
    this.surge = surge;
  }

  /**
   * Returns the index.
   * 
   * @return the index
   */
  public Integer getIndex() {
    return this.index;
  }

  /**
   * Defines the index.
   * 
   * @param index
   *          the index to set
   */
  public void setIndex(final Integer index) {
    this.index = index;
  }

  /**
   * Implementation for hashCode.
   * 
   * @see Object#hashCode()
   */
  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(this.monsterStatPk).append(this.surge).append(this.index).toHashCode();
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
        final MonsterSurgePk other = (MonsterSurgePk) obj;
        equals = new EqualsBuilder().append(this.monsterStatPk, other.monsterStatPk).append(this.surge, other.surge)
            .append(this.index, other.index).isEquals();
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
