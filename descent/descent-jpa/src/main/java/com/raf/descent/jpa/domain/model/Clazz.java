package com.raf.descent.jpa.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.fwk.jpa.domain.AbstractNamedEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * The persistent class for the CLASS database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "CLASS", schema = "DESCENT")
@Getter
@Setter
@NoArgsConstructor
public class Clazz extends AbstractNamedEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -1527319358180018196L;

  /** The archetype name. */
  @Column(name = "ARCHETYPE", nullable = false, length = 30)
  private String archetypeName;

  /** The expansion name. */
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
   * Defines the archetype.
   * 
   * @param archetype
   *          the archetype to set
   */
  public void setArchetype(final Archetype archetype) {
    this.archetype = archetype;
    if (this.archetype != null) {
      this.archetypeName = this.archetype.getName();
    }
  }

  /**
   * Defines the expansion.
   * 
   * @param expansion
   *          the expansion to set
   */
  public void setExpansion(final Expansion expansion) {
    this.expansion = expansion;
    if (this.expansion != null) {
      this.expansionName = this.expansion.getName();
    }
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractNamedEntity#appendNamed(ToStringBuilder)
   */
  @Override
  protected final void appendNamed(final ToStringBuilder builder) {
    builder.append("archetypeName", this.archetypeName).append("expansionName", this.expansionName);
    if (this.archetype != null && Archetype.class.equals(this.archetype.getClass())) {
      builder.append("archetype", this.archetype);
    }
    if (this.expansion != null && Expansion.class.equals(this.expansion.getClass())) {
      builder.append("expansion", this.expansion);
    }
  }

}
