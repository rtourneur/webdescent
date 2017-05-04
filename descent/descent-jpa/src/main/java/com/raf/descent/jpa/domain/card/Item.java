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

import com.raf.descent.jpa.domain.model.AttackType;
import com.raf.descent.jpa.domain.model.Clazz;
import com.raf.descent.jpa.domain.model.Equipment;
import com.raf.descent.jpa.domain.model.Expansion;
import com.raf.descent.jpa.domain.model.ItemType;
import com.raf.descent.jpa.domain.model.ObjectTrait;
import com.raf.descent.jpa.domain.model.StatDiceName;
import com.raf.fwk.jpa.domain.AbstractNamedEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The persistent class for the ITEM database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "ITEM", schema = "DESCENT")
@Getter
@Setter
@NoArgsConstructor
public class Item extends AbstractNamedEntity {

  /** Serial UID. */
  private static final long serialVersionUID = 2076464997993579868L;

  /** The expansion name. */
  @Column(name = "EXPANSION", nullable = false, length = 30)
  private String expansionName;

  /** The item type name. */
  @Column(name = "ITEM_TYPE", nullable = false, length = 30)
  private String itemTypeName;

  /** The attack type name. */
  @Column(name = "ATTACK_TYPE", length = 30)
  private String attackTypeName;

  /** The equipmennt name. */
  @Column(name = "EQUIPMENT", nullable = false, length = 30)
  private String equipmentName;

  /** The cost. */
  @Column(name = "COST", precision = 3)
  private Integer cost;

  /** The rule code. */
  @Column(name = "RULE_CODE", nullable = false, length = 30)
  private String ruleCode;

  /** The count. */
  @Column(name = "\"COUNT\"", nullable = false, precision = 1)
  private Integer count;

  /** The class name. */
  @Column(name = "CLASS", length = 30)
  private String className;

  /** The image. */
  @Column(name = "IMAGE", nullable = false, length = 30)
  private String image;

  /** The expansion. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "EXPANSION", nullable = false, insertable = false, updatable = false)
  private Expansion expansion;

  /** The item type. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ITEM_TYPE", nullable = false, insertable = false, updatable = false)
  private ItemType itemType;

  /** The attack type. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ATTACK_TYPE", insertable = false, updatable = false)
  private AttackType attackType;

  /** The equipement space. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "EQUIPMENT", nullable = false, insertable = false, updatable = false)
  private Equipment equipment;

  /** The class. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "CLASS", insertable = false, updatable = false)
  private Clazz clazz;

  /** The list of dices. */
  @ElementCollection
  @CollectionTable(name = "ITEM_DICE", schema = "DESCENT", joinColumns = { @JoinColumn(name = "ITEM") }, indexes = {
      @Index(name = "IDX_ITEM_DICE", columnList = "ITEM, DICE, INDEX", unique = true) })
  private List<StatDiceName> diceNames;

  /** The list of traits. */
  @ElementCollection
  @CollectionTable(name = "ITEM_TRAIT", schema = "DESCENT", joinColumns = { @JoinColumn(name = "ITEM") }, indexes = {
      @Index(name = "IDX_ITEM_TRAIT", columnList = "ITEM, TRAIT", unique = true) })
  private List<ObjectTrait> traits;

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
   * Defines the item type.
   * 
   * @param itemType
   *          the itemType to set
   */
  public void setItemType(final ItemType itemType) {
    this.itemType = itemType;
    if (this.itemType != null) {
      this.itemTypeName = this.itemType.getName();
    }
  }

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
   * Defines the equipment.
   * 
   * @param equipment
   *          the equipment to set
   */
  public void setEquipment(final Equipment equipment) {
    this.equipment = equipment;
    if (this.equipment != null) {
      this.equipmentName = this.equipment.getName();
    }
  }

  /**
   * Defines the clazz.
   * 
   * @param clazz
   *          the clazz to set
   */
  public void setClazz(final Clazz clazz) {
    this.clazz = clazz;
    if (this.clazz != null) {
      this.className = this.clazz.getName();
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
    builder.append("expansionName", this.expansionName).append("itemTypeName", this.itemTypeName)
        .append("attackTypeName", this.attackTypeName).append("equipmentName", this.equipmentName)
        .append("cost", this.cost).append("ruleCode", this.ruleCode).append("count", this.count)
        .append("className", this.className).append("image", this.image).append("diceNames", this.diceNames)
        .append("traits", this.traits);
    appendExpansion(builder);
    appendItemType(builder);
    appendAttackType(builder);
    appendEquipment(builder);
    appendClazz(builder);
  }

  /**
   * Append the expansion properties for the to string builder.
   * 
   * @param builder
   *          the builder
   */
  private void appendExpansion(final ToStringBuilder builder) {
    if (this.expansion != null && Expansion.class.equals(this.expansion.getClass())) {
      builder.append("expansion", this.expansion);
    }
  }

  /**
   * Append the item type properties for the to string builder.
   * 
   * @param builder
   *          the builder
   */
  private void appendItemType(final ToStringBuilder builder) {
    if (this.itemType != null && ItemType.class.equals(this.itemType.getClass())) {
      builder.append("itemType", this.itemType);
    }
  }

  /**
   * Append the attack type properties for the to string builder.
   * 
   * @param builder
   *          the builder
   */
  private void appendAttackType(final ToStringBuilder builder) {
    if (this.attackType != null && AttackType.class.equals(this.attackType.getClass())) {
      builder.append("attackType", this.attackType);
    }
  }

  /**
   * Append the equipment properties for the to string builder.
   * 
   * @param builder
   *          the builder
   */
  private void appendEquipment(final ToStringBuilder builder) {
    if (this.equipment != null && Equipment.class.equals(this.equipment.getClass())) {
      builder.append("equipment", this.equipment);
    }
  }

  /**
   * Append the clazz properties for the to string builder.
   * 
   * @param builder
   *          the builder
   */
  private void appendClazz(final ToStringBuilder builder) {
    if (this.clazz != null && Clazz.class.equals(this.clazz.getClass())) {
      builder.append("clazz", this.clazz);
    }
  }

}
