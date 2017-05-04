package com.raf.descent.jpa.domain.card;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.model.AbstractExpansionEntity;
import com.raf.descent.jpa.domain.model.AttackType;
import com.raf.descent.jpa.domain.model.ObjectTrait;
import com.raf.descent.jpa.domain.model.StatDiceName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The persistent class for the SEARCH database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "SEARCH", schema = "DESCENT")
@Getter
@Setter
@NoArgsConstructor
public class Search extends AbstractExpansionEntity {

  /** Serial UID. */
  private static final long serialVersionUID = 5182466893676410840L;

  /** The ability code. */
  @Column(name = "ABILITY_CODE", nullable = false, length = 30)
  private String abilityCode;

  /** The attack type name. */
  @Column(name = "ATTACK_TYPE", length = 30)
  private String attackTypeName;

  /** The gold. */
  @Column(precision = 2)
  private Integer gold;

  /** The count. */
  @Column(name = "\"COUNT\"", nullable = false, precision = 1)
  private Integer count;

  /** The attack type. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ATTACK_TYPE", insertable = false, updatable = false)
  private AttackType attackType;

  /** The image. */
  @Column(name = "IMAGE", nullable = false, length = 30)
  private String image;

  /** The list of dices. */
  @ElementCollection
  @CollectionTable(name = "SEARCH_DICE", schema = "DESCENT", joinColumns = {
      @JoinColumn(name = "SEARCH", referencedColumnName = "NAME"),
      @JoinColumn(name = "EXPANSION", referencedColumnName = "EXPANSION") }, indexes = {
          @Index(name = "IDX_SEARCH_DICE", columnList = "SEARCH, EXPANSION, DICE, INDEX", unique = true) })
  private List<StatDiceName> diceNames;

  /** The list of traits. */
  @ElementCollection
  @CollectionTable(name = "SEARCH_TRAIT", schema = "DESCENT", joinColumns = {
      @JoinColumn(name = "SEARCH", referencedColumnName = "NAME"),
      @JoinColumn(name = "EXPANSION", referencedColumnName = "EXPANSION") }, indexes = {
          @Index(name = "IDX_SEARCH_TRAIT", columnList = "SEARCH, EXPANSION, TRAIT", unique = true) })
  private List<ObjectTrait> traits;

  /**
   * Defines the attack type.
   * 
   * @param attackType
   *          the attackType to set
   */
  public void setAttackType(final AttackType attackType) {
    this.attackType = attackType;
    if (this.attackType != null) {
      this.attackTypeName = this.attackType.getName();
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
    builder.append("abilityCode", this.abilityCode).append("attackTypeName", this.attackTypeName)
        .append("gold", this.gold).append("count", this.count).append("image", this.image)
        .append("diceNames", this.diceNames).append("traits", this.traits);
  }

}
