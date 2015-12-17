package com.raf.descent.jpa.domain.card;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.model.NameExpansionPk;

/**
 * The primary key class for the MONSTER_COUNT database table.
 * 
 * @author RAF
 */
@Embeddable
public class MonsterCountPk implements Serializable {

  /** Serial UID. */
  private static final long serialVersionUID = -1476895782442322402L;

  /** The name expansion key. */
  @Embedded
  @AttributeOverride(name = "name", column = @Column(name = "MONSTER_GROUP"))
  private NameExpansionPk nameExpansionPk;

  /** The heros count. */
  @Column(unique = true, nullable = false, precision = 1)
  private Integer heros;

  /**
   * Constructor.
   */
  public MonsterCountPk() {
    super();
  }

  /**
   * Returns the name expansion key.
   * 
   * @return the nameExpansionPk
   */
  public NameExpansionPk getNameExpansionPk() {
    return this.nameExpansionPk;
  }

  /**
   * Defines the name expansion key.
   * 
   * @param nameExpansionPk
   *          the nameExpansionPk to set
   */
  public void setNameExpansionPk(final NameExpansionPk nameExpansionPk) {
    this.nameExpansionPk = nameExpansionPk;
  }

  /**
   * Returns the name.
   *
   * @return the name
   */
  public String getName() {
    if (this.nameExpansionPk == null) {
      this.nameExpansionPk = new NameExpansionPk();
    }
    return this.nameExpansionPk.getName();
  }

  /**
   * Defines the name.
   *
   * @param name
   *          the name to set
   */
  public void setName(final String name) {
    if (this.nameExpansionPk == null) {
      this.nameExpansionPk = new NameExpansionPk();
    }
    this.nameExpansionPk.setName(name);
  }

  /**
   * Returns the expansion name.
   *
   * @return the expansion name
   */
  public String getExpansionName() {
    if (this.nameExpansionPk == null) {
      this.nameExpansionPk = new NameExpansionPk();
    }
    return this.nameExpansionPk.getExpansion();
  }

  /**
   * Defines the expansion name.
   *
   * @param expansionName
   *          the expansionName to set
   */
  public void setExpansionName(final String expansionName) {
    if (this.nameExpansionPk == null) {
      this.nameExpansionPk = new NameExpansionPk();
    }
    this.nameExpansionPk.setExpansion(expansionName);
  }

  /**
   * Returns the heros.
   *
   * @return the heros
   */
  public Integer getHeros() {
    return this.heros;
  }

  /**
   * Defines the heros.
   *
   * @param heros
   *          the heros to set
   */
  public void setHeros(final Integer heros) {
    this.heros = heros;
  }

  /**
   * Implementation for hashCode.
   * 
   * @see Object#hashCode()
   */
  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(this.nameExpansionPk).append(this.heros).toHashCode();
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
        final MonsterCountPk other = (MonsterCountPk) obj;
        equals = new EqualsBuilder().append(this.nameExpansionPk, other.nameExpansionPk)
            .append(this.heros, other.heros).isEquals();
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
