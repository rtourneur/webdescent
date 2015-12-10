package com.raf.descent.jpa.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.AbstractNamedEntity;

/**
 * The persistent class for the CLASS database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "CLASS", schema = "DESCENT")
public class Clazz extends AbstractNamedEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -1527319358180018196L;

  /** The archetype name. */
  @Column(name = "ARCHETYPE", nullable = false, length = 30)
  private String archetypeName;

  /** The archetype name. */
  @Column(name = "EXPANSION", nullable = false, length = 30)
  private String expansionName;

  /** The archetype. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ARCHETYPE", nullable = false, insertable = false, updatable = false)
  private Archetype archetype;

  /** The expansion. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "EXPANSION", nullable = false, insertable = false, updatable = false)
  private Expansion expansion;

  /**
   * Constructor.
   */
  public Clazz() {
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
   * Returns the expansion name.
   * 
   * @return the expansionName
   */
  public String getExpansionName() {
    return this.expansionName;
  }

  /**
   * Defines the expansion name.
   * 
   * @param expansionName
   *          the expansionName to set
   */
  public void setExpansionName(final String expansionName) {
    this.expansionName = expansionName;
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
   * Returns the expansion.
   * 
   * @return the expansion
   */
  public Expansion getExpansion() {
    return this.expansion;
  }

  /**
   * Defines the expansion.
   * 
   * @param expansion
   *          the expansion to set
   */
  public void setExpansion(final Expansion expansion) {
    this.expansion = expansion;
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractNamedEntity#appendNamed(ToStringBuilder)
   */
  @Override
  protected void appendNamed(final ToStringBuilder builder) {
    builder.append("archetypeName", this.archetypeName).append("expansionName", this.expansionName);
    if (this.archetype != null && Archetype.class.equals(this.archetype.getClass())) {
      builder.append("archetype", this.archetype);
    }
    if (this.expansion != null && Expansion.class.equals(this.expansion.getClass())) {
      builder.append("expansion", this.expansion);
    }
  }

}
