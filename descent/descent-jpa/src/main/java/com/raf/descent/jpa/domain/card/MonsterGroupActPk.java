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
 * The primary key class for the MONSTER_GROUP_ACT database table.
 * 
 * @author RAF
 */
@Embeddable
public class MonsterGroupActPk implements Serializable {

  /** Serial UID. */
  private static final long serialVersionUID = -3840646623686622890L;

  /** The name expansion key. */
  @Embedded
  @AttributeOverride(name = "name", column = @Column(name = "MONSTER_GROUP"))
  private NameExpansionPk nameExpansionPk;

  /** The act. */
  @Column(unique = true, nullable = false, length = 30)
  private String act;

  /**
   * Constructor.
   */
  public MonsterGroupActPk() {
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
   * Returns the act.
   *
   * @return the act
   */
  public String getAct() {
    return this.act;
  }

  /**
   * Defines the act.
   *
   * @param act
   *          the act to set
   */
  public void setAct(final String act) {
    this.act = act;
  }

  /**
   * Implementation for hashCode.
   * 
   * @see Object#hashCode()
   */
  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(this.nameExpansionPk).append(this.act).toHashCode();
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
        final MonsterGroupActPk other = (MonsterGroupActPk) obj;
        equals = new EqualsBuilder().append(this.nameExpansionPk, other.nameExpansionPk).append(this.act, other.act)
            .isEquals();
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
