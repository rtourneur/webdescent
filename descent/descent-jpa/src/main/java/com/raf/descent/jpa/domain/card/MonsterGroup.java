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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.model.AbstractExpansionEntity;
import com.raf.descent.jpa.domain.model.AttackType;
import com.raf.descent.jpa.domain.model.MonsterSize;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The persistent class for the MONSTER_GROUP database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "MONSTER_GROUP", schema = "DESCENT")
@Getter
@Setter
@NoArgsConstructor
public class MonsterGroup extends AbstractExpansionEntity {

  /** Serial UID. */
  private static final long serialVersionUID = 6789842339165409178L;

  /** The attack type name. */
  @Column(name = "ATTACK_TYPE", nullable = false, length = 30)
  private String attackTypeName;

  /** The monster size name. */
  @Column(name = "MONSTER_SIZE", nullable = false, length = 30)
  private String monsterSizeName;

  /** The master count. */
  @Column(name = "MASTER", nullable = false, precision = 1)
  private Integer master;

  /** The minion count. */
  @Column(name = "MINION", nullable = false, precision = 1)
  private Integer minion;

  /** The attack type. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ATTACK_TYPE", nullable = false, insertable = false, updatable = false)
  private AttackType attackType;

  /** The monster size. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "MONSTER_SIZE", nullable = false, insertable = false, updatable = false)
  private MonsterSize monsterSize;

  /** The list of traits. */
  @ElementCollection
  @CollectionTable(name = "MONSTER_GROUP_TRAIT", schema = "DESCENT", joinColumns = {
      @JoinColumn(name = "MONSTER", referencedColumnName = "NAME"),
      @JoinColumn(name = "EXPANSION", referencedColumnName = "EXPANSION") }, indexes = {
          @Index(name = "IDX_MONSTER_GROUP_TRAIT", columnList = "MONSTER, EXPANSION, TRAIT", unique = true) })
  private List<MonsterGroupTrait> traits;

  /** The list of act. */
  @ElementCollection
  @CollectionTable(name = "MONSTER_GROUP_ACT", schema = "DESCENT", joinColumns = {
      @JoinColumn(name = "MONSTER", referencedColumnName = "NAME"),
      @JoinColumn(name = "EXPANSION", referencedColumnName = "EXPANSION") }, indexes = {
          @Index(name = "IDX_MONSTER_GROUP_ACT", columnList = "MONSTER, EXPANSION, ACT", unique = true) })
  private List<MonsterGroupAct> monsterGroupActs;

  /** The list of act. */
  @ElementCollection
  @CollectionTable(name = "MONSTER_COUNT", schema = "DESCENT", joinColumns = {
      @JoinColumn(name = "MONSTER", referencedColumnName = "NAME"),
      @JoinColumn(name = "EXPANSION", referencedColumnName = "EXPANSION") }, indexes = {
          @Index(name = "IDX_MONSTER_COUNT", columnList = "MONSTER, EXPANSION, HERO", unique = true) })
  private List<MonsterCount> monsterCounts;

  /** The stats of monsters. */
  @OneToMany(mappedBy = "monsterGroup")
  private List<MonsterStat> monsterStats;

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
   * Defines the monster size.
   * 
   * @param monsterSize
   *          the monsterSize to set
   */
  public void setMonsterSize(final MonsterSize monsterSize) {
    this.monsterSize = monsterSize;
    if (this.monsterSize != null) {
      this.monsterSizeName = this.monsterSize.getName();
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
  protected void appendExpansion(final ToStringBuilder builder) {
    builder.append("attackTypeName", this.attackTypeName).append("monsterSizeName", this.monsterSizeName)
        .append("master", this.master).append("minion", this.minion);
    if (this.attackType != null && AttackType.class.equals(this.attackType.getClass())) {
      builder.append("attackType", this.attackType);
    }
    if (this.monsterSize != null && MonsterSize.class.equals(this.monsterSize.getClass())) {
      builder.append("monsterSize", this.monsterSize);
    }
  }

}
