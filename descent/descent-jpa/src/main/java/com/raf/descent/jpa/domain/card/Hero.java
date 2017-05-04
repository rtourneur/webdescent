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

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The persistent class for the HERO database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "HERO", schema = "DESCENT")
@Getter
@Setter
@NoArgsConstructor
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
  @Column(name = "SPEED", nullable = false, precision = 1)
  private Integer speed;

  /** The health value. */
  @Column(name = "HEALTH", nullable = false, precision = 2)
  private Integer health;

  /** The stamina value. */
  @Column(name = "STAMINA", nullable = false, precision = 1)
  private Integer stamina;

  /** The defense dice name. */
  @Column(name = "DEFENSE", nullable = false, length = 30)
  private String defenseName;

  /** The defense base value. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "DEFENSE", nullable = false, insertable = false, updatable = false)
  private Dice defense;

  /** The might value. */
  @Column(name = "MIGHT", nullable = false, precision = 1)
  private Integer might;

  /** The knowledge value. */
  @Column(name = "KNOWLEDGE", nullable = false, precision = 1)
  private Integer knowledge;

  /** The willpower value. */
  @Column(name = "WILLPOWER", nullable = false, precision = 1)
  private Integer willpower;

  /** The awareness value. */
  @Column(name = "AWARENESS", nullable = false, precision = 1)
  private Integer awareness;

  /** The ability code. */
  @Column(name = "ABILITY_CODE", nullable = false, length = 30)
  private String abilityCode;

  /** The feat code. */
  @Column(name = "FEAT_CODE", nullable = false, length = 30)
  private String featCode;

  /** The image. */
  @Column(name = "IMAGE", nullable = false, length = 30)
  private String image;

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
   * Defines the defense.
   * 
   * @param defense
   *          the defense to set
   */
  public void setDefense(final Dice defense) {
    this.defense = defense;
    if (this.defense != null) {
      this.defenseName = this.defense.getName();
    }
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractExpansionEntity#appendExpansion(ToStringBuilder)
   */
  @Override
  protected final void appendExpansion(final ToStringBuilder builder) {
    builder.append("archetypeName", this.archetypeName).append("speed", this.speed).append("health", this.health)
        .append("stamina", this.stamina).append("defense", this.defenseName).append("might", this.might)
        .append("knowledge", this.knowledge).append("willpower", this.willpower).append("awareness", this.awareness)
        .append("abilityCode", this.abilityCode).append("featCode", this.featCode).append("image", this.image);
    if (this.archetype != null && Archetype.class.equals(this.archetype.getClass())) {
      builder.append("archetype", this.archetype);
    }
  }

}
