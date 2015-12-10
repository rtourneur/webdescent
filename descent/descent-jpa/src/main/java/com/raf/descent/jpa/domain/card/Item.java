package com.raf.descent.jpa.domain.card;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.raf.descent.jpa.domain.AbstractNamedEntity;
import com.raf.descent.jpa.domain.model.AttackType;
import com.raf.descent.jpa.domain.model.Clazz;
import com.raf.descent.jpa.domain.model.Equipment;
import com.raf.descent.jpa.domain.model.Expansion;
import com.raf.descent.jpa.domain.model.ItemType;
import com.raf.descent.jpa.domain.model.Trait;

/**
 * The persistent class for the ITEM database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "ITEM", schema = "DESCENT")
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
  @Column(name = "ATTACK_TYPE", nullable = false, length = 30)
  private String attackTypeName;

  /** The equipmennt name. */
  @Column(name = "EQUIPMENT", nullable = false, length = 30)
  private String equipmentName;

  /** The cost. */
  @Column(precision = 3)
  private Integer cost;

  /** The rule code. */
  @Column(name = "RULE_CODE", nullable = false, length = 30)
  private String ruleCode;

  /** The count. */
  @Column(name = "\"COUNT\"", nullable = false, precision = 1)
  private Integer count;

  /** The class name. */
  @Column(name = "CLASS", length = 30)
  private String clazzName;

  /** The image. */
  @Column(nullable = false, length = 30)
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
  @OneToMany(mappedBy = "item", fetch = FetchType.LAZY)
  private List<ItemDice> dices;

  /** The list of traits. */
  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "ITEM_TRAIT", schema = "DESCENT", joinColumns = { @JoinColumn(name = "ITEM", nullable = false) }, inverseJoinColumns = { @JoinColumn(name = "TRAIT", nullable = false) })
  private List<Trait> traits;

  /**
   * Constructor.
   */
  public Item() {
    super();
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
   * Returns the item type name.
   * 
   * @return the itemTypeName
   */
  public String getItemTypeName() {
    return this.itemTypeName;
  }

  /**
   * Defines the item type name.
   * 
   * @param itemTypeName
   *          the itemTypeName to set
   */
  public void setItemTypeName(final String itemTypeName) {
    this.itemTypeName = itemTypeName;
  }

  /**
   * Returns the attack type name.
   * 
   * @return the attackTypeName
   */
  public String getAttackTypeName() {
    return this.attackTypeName;
  }

  /**
   * Defines the attack type name.
   * 
   * @param attackTypeName
   *          the attackTypeName to set
   */
  public void setAttackTypeName(final String attackTypeName) {
    this.attackTypeName = attackTypeName;
  }

  /**
   * Returns the equipment name.
   * 
   * @return the equipmentName
   */
  public String getEquipmentName() {
    return this.equipmentName;
  }

  /**
   * Defines the equipment name.
   * 
   * @param equipmentName
   *          the equipmentName to set
   */
  public void setEquipmentName(final String equipmentName) {
    this.equipmentName = equipmentName;
  }

  /**
   * Returns the cost.
   * 
   * @return the cost
   */
  public Integer getCost() {
    return this.cost;
  }

  /**
   * Defines the cost.
   * 
   * @param cost
   *          the cost to set
   */
  public void setCost(final Integer cost) {
    this.cost = cost;
  }

  /**
   * Returns the rule code.
   * 
   * @return the ruleCode
   */
  public String getRuleCode() {
    return this.ruleCode;
  }

  /**
   * Defines the rule code.
   * 
   * @param ruleCode
   *          the ruleCode to set
   */
  public void setRuleCode(final String ruleCode) {
    this.ruleCode = ruleCode;
  }

  /**
   * Returns the count.
   * 
   * @return the count
   */
  public Integer getCount() {
    return this.count;
  }

  /**
   * Defines the count.
   * 
   * @param count
   *          the count to set
   */
  public void setCount(final Integer count) {
    this.count = count;
  }

  /**
   * Returns the class name.
   * 
   * @return the clazzName
   */
  public String getClazzName() {
    return this.clazzName;
  }

  /**
   * Defines the class name.
   * 
   * @param clazzName
   *          the clazzName to set
   */
  public void setClazzName(final String clazzName) {
    this.clazzName = clazzName;
  }

  /**
   * Returns the image.
   * 
   * @return the image
   */
  public String getImage() {
    return this.image;
  }

  /**
   * Defines the image.
   * 
   * @param image
   *          the image to set
   */
  public void setImage(final String image) {
    this.image = image;
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
   * Returns the item type.
   * 
   * @return the itemType
   */
  public ItemType getItemType() {
    return this.itemType;
  }

  /**
   * Defines the item type.
   * 
   * @param itemType
   *          the itemType to set
   */
  public void setItemType(final ItemType itemType) {
    this.itemType = itemType;
  }

  /**
   * Returns the attack type.
   * 
   * @return the attackType
   */
  public AttackType getAttackType() {
    return this.attackType;
  }

  /**
   * Defines the attack type.
   * 
   * @param attackType
   *          the attackType to set
   */
  public void setAttackType(final AttackType attackType) {
    this.attackType = attackType;
  }

  /**
   * Returns the equipment.
   * 
   * @return the equipment
   */
  public Equipment getEquipment() {
    return this.equipment;
  }

  /**
   * Defines the equipment.
   * 
   * @param equipment
   *          the equipment to set
   */
  public void setEquipment(final Equipment equipment) {
    this.equipment = equipment;
  }

  /**
   * Returns the clazz.
   * 
   * @return the clazz
   */
  public Clazz getClazz() {
    return this.clazz;
  }

  /**
   * Defines the clazz.
   * 
   * @param clazz
   *          the clazz to set
   */
  public void setClazz(final Clazz clazz) {
    this.clazz = clazz;
  }

  /**
   * Returns the list of dices.
   * 
   * @return the dices
   */
  public List<ItemDice> getDices() {
    return this.dices;
  }

  /**
   * Defines the list of dices.
   * 
   * @param dices
   *          the dices to set
   */
  public void setDices(final List<ItemDice> dices) {
    this.dices = dices;
  }

  /**
   * Returns the list of traits.
   * 
   * @return the traits
   */
  public List<Trait> getTraits() {
    return this.traits;
  }

  /**
   * Defines the list of traits.
   * 
   * @param traits
   *          the traits to set
   */
  public void setTraits(final List<Trait> traits) {
    this.traits = traits;
  }

}
