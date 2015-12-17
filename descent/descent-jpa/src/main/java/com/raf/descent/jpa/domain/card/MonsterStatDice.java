package com.raf.descent.jpa.domain.card;

import javax.persistence.EmbeddedId;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.AbstractEntity;
import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.model.Dice;

/**
 * The persistent class for the MONSTER_STAT database table.
 * 
 * @author RAF
 */
@MappedSuperclass
public class MonsterStatDice extends AbstractEntity implements DomainEntity<MonsterStatDicePk> {

  /** Serial UID. */
  private static final long serialVersionUID = 7727090188217071509L;

  /** The identifier. */
  @EmbeddedId
  private MonsterStatDicePk ident;

  /** The monster stat. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumns({
      @JoinColumn(name = "EXPANSION", referencedColumnName = "EXPANSION", nullable = false, insertable = false, updatable = false),
      @JoinColumn(name = "MONSTER_GROUP", referencedColumnName = "MONSTER_GROUP", nullable = false, insertable = false, updatable = false),
      @JoinColumn(name = "ACT", referencedColumnName = "ACT", nullable = false, insertable = false, updatable = false),
      @JoinColumn(name = "MONSTER_TYPE", referencedColumnName = "MONSTER_TYPE", nullable = false, insertable = false, updatable = false) })
  private MonsterStat monsterStat;

  /** The dice. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "DICE", insertable = false, updatable = false)
  private Dice dice;

  /**
   * Constructor.
   */
  public MonsterStatDice() {
    super();
  }

  /**
   * Returns the serializable ID of domain entity.
   *
   * @return the ID
   * @see DomainEntity#getId()
   */
  @Override
  public MonsterStatDicePk getId() {
    return getIdent();
  }

  /**
   * Returns the identifier.
   * 
   * @return the ident
   */
  public MonsterStatDicePk getIdent() {
    return this.ident;
  }

  /**
   * Defines the identifier.
   * 
   * @param ident
   *          the ident to set
   * @see DomainEntity#setIdent(MonsterStatDicePk)
   */
  @Override
  public void setIdent(final MonsterStatDicePk ident) {
    this.ident = ident;
  }

  /**
   * Returns the monster group name.
   *
   * @return the monster group name
   */
  public String getMonsterGroupName() {
    if (this.ident == null) {
      this.ident = new MonsterStatDicePk();
    }
    return this.ident.getName();
  }

  /**
   * Returns the expansion name.
   *
   * @return the expansion name
   */
  public String getExpansionName() {
    if (this.ident == null) {
      this.ident = new MonsterStatDicePk();
    }
    return this.ident.getExpansionName();
  }

  /**
   * Returns the act name.
   *
   * @return the act name
   */
  public String getActName() {
    if (this.ident == null) {
      this.ident = new MonsterStatDicePk();
    }
    return this.ident.getActName();
  }

  /**
   * Returns the monster type name.
   *
   * @return the monster type name
   */
  public String getMonsterTypeName() {
    if (this.ident == null) {
      this.ident = new MonsterStatDicePk();
    }
    return this.ident.getMonsterTypeName();
  }

  /**
   * Returns the dice name.
   *
   * @return the dice name
   */
  public String getDiceName() {
    if (this.ident == null) {
      this.ident = new MonsterStatDicePk();
    }
    return this.ident.getDice();
  }

  /**
   * Returns the index.
   *
   * @return the index
   */
  public Integer getIndex() {
    if (this.ident == null) {
      this.ident = new MonsterStatDicePk();
    }
    return this.ident.getIndex();
  }
  /**
   * Returns the monster stat.
   * 
   * @return the monsterStat
   */
  public MonsterStat getMonsterStat() {
    return this.monsterStat;
  }

  /**
   * Defines the monster stat.
   * 
   * @param monsterStat
   *          the monsterStat to set
   */
  public void setMonsterStat(final MonsterStat monsterGroupAct) {
    this.monsterStat = monsterGroupAct;
  }

  /**
   * Returns the monster type.
   * 
   * @return the dice
   */
  public Dice getDice() {
    return this.dice;
  }

  /**
   * Defines the monster type.
   * 
   * @param dice
   *          the dice to set
   */
  public void setDice(final Dice monsterType) {
    this.dice = monsterType;
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractEntity#append(ToStringBuilder)
   */
  @Override
  protected void append(final ToStringBuilder builder) {
    if (this.ident != null) {
      builder.append("monsterGroupName", this.ident.getName()).append("expansionName", this.ident.getExpansionName())
          .append("actName", this.ident.getActName()).append("monsterTypeName", this.ident.getMonsterTypeName())
          .append("diceName", this.ident.getDice()).append("index", this.ident.getIndex());
    }
    if (this.monsterStat != null && MonsterStat.class.equals(this.monsterStat.getClass())) {
      builder.append("monsterStat", this.monsterStat);
    }
    if (this.dice != null && Dice.class.equals(this.dice.getClass())) {
      builder.append("dice", this.dice);
    }
  }

}
