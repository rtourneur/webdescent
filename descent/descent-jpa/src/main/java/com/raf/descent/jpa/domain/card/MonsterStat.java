package com.raf.descent.jpa.domain.card;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.model.Act;
import com.raf.descent.jpa.domain.model.Expansion;
import com.raf.descent.jpa.domain.model.MonsterType;
import com.raf.descent.jpa.domain.model.StatDice;
import com.raf.descent.jpa.domain.model.StatDiceName;
import com.raf.fwk.jpa.domain.AbstractIdEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The persistent class for the MONSTER_STAT database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "MONSTER_STAT", schema = "DESCENT", indexes = @Index(name = "IDX_MONSTER_STAT", columnList = "NAME, EXPANSION, ACT, MONSTER_TYPE", unique = true))
@Getter
@Setter
@NoArgsConstructor
public class MonsterStat extends AbstractIdEntity {

  /** Serial UID. */
  private static final long serialVersionUID = 8479396877170430878L;

  /** The name. */
  @Column(name = "NAME", unique = true, nullable = false, length = 30)
  private String name;

  /** The expansion. */
  @Column(name = "EXPANSION", unique = true, nullable = false, length = 30)
  private String expansionName;

  /** The act. */
  @Column(name = "ACT", nullable = false, length = 30)
  private String actName;

  /** The monster type. */
  @Column(name = "MONSTER_TYPE", length = 30)
  private String monsterTypeName;

  /** The speed value. */
  @Column(name = "SPEED", nullable = false, precision = 1)
  private Integer speed;

  /** The health value. */
  @Column(name = "HEALTH", nullable = false, precision = 2)
  private Integer health;

  /** The expansion. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "EXPANSION", nullable = false, insertable = false, updatable = false)
  private Expansion expansion;

  /** The expansion. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ACT", nullable = false, insertable = false, updatable = false)
  private Act act;

  /** The monster type. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "MONSTER_TYPE", insertable = false, updatable = false)
  private MonsterType monsterType;

  /** The monster type. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumns({
      @JoinColumn(name = "NAME", referencedColumnName = "NAME", nullable = false, insertable = false, updatable = false),
      @JoinColumn(name = "EXPANSION", referencedColumnName = "EXPANSION", nullable = false, insertable = false, updatable = false) })
  private MonsterGroup monsterGroup;

  /** The monster defences dices. */
  @ElementCollection(fetch = FetchType.EAGER)
  @CollectionTable(name = "MONSTER_DEFENSE", schema = "DESCENT", joinColumns = { @JoinColumn(name = "ID") }, indexes = {
      @Index(name = "IDX_MONSTER_DEFENSE", columnList = "ID, DICE, INDEX", unique = true) })
  private List<StatDiceName> defenseDiceNames;

  /** The monster attack dices. */
  @ElementCollection(fetch = FetchType.EAGER)
  @CollectionTable(name = "MONSTER_ATTACK", schema = "DESCENT", joinColumns = { @JoinColumn(name = "ID") }, indexes = {
      @Index(name = "IDX_MONSTER_ATTACK", columnList = "ID, DICE, INDEX", unique = true) })
  private List<StatDiceName> attackDiceNames;

  /** The monster abilities. */
  @ElementCollection(fetch = FetchType.EAGER)
  @CollectionTable(name = "MONSTER_ABILITY", schema = "DESCENT", joinColumns = { @JoinColumn(name = "ID") }, indexes = {
      @Index(name = "IDX_MONSTER_ABILITY", columnList = "ID, ABILITY", unique = true) })
  private List<MonsterAbility> abilities;

  /** The monster surges. */
  @ElementCollection(fetch = FetchType.LAZY)
  @CollectionTable(name = "MONSTER_SURGE", schema = "DESCENT", joinColumns = { @JoinColumn(name = "ID") }, indexes = {
      @Index(name = "IDX_MONSTER_SURGE", columnList = "ID, SURGE, INDEX", unique = true) })
  private List<MonsterSurge> surges;

  /** The monster attack dices. */
  @ElementCollection(fetch = FetchType.LAZY)
  @CollectionTable(name = "MONSTER_ATTACK", schema = "DESCENT", joinColumns = { @JoinColumn(name = "ID") }, indexes = {
      @Index(name = "IDX_MONSTER_ATTACK", columnList = "ID, DICE, INDEX", unique = true) })
  private List<StatDice> attackDices;

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractIdEntity#appendId(ToStringBuilder)
   */
  @Override
  protected final void appendId(final ToStringBuilder builder) {
    builder.append("name", this.name).append("expansionName", this.expansionName).append("actName", this.actName)
        .append("monsterTypeName", this.monsterTypeName).append("speed", this.speed).append("health", this.health)
        .append("defenseDiceNames", this.defenseDiceNames).append("attackDiceNames", this.attackDiceNames)
        .append("abilities", this.abilities).append("surges", this.surges);
    appendExpansion(builder);
    appendAct(builder);
    appendMonsterType(builder);
    appendMonsterGroup(builder);
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
   * Append the expansion properties for the to string builder.
   * 
   * @param builder
   *          the builder
   */
  private void appendAct(final ToStringBuilder builder) {
    if (this.act != null && Act.class.equals(this.act.getClass())) {
      builder.append("act", this.act);
    }
  }

  /**
   * Append the expansion properties for the to string builder.
   * 
   * @param builder
   *          the builder
   */
  private void appendMonsterType(final ToStringBuilder builder) {
    if (this.monsterType != null && MonsterType.class.equals(this.monsterType.getClass())) {
      builder.append("monsterType", this.monsterType);
    }
  }

  /**
   * Append the expansion properties for the to string builder.
   * 
   * @param builder
   *          the builder
   */
  private void appendMonsterGroup(final ToStringBuilder builder) {
    if (this.monsterGroup != null && MonsterGroup.class.equals(this.monsterGroup.getClass())) {
      builder.append("monsterGroup", this.monsterGroup);
    }
  }

}
