package com.raf.descent.jpa.domain.card;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.AbstractEntity;
import com.raf.descent.jpa.domain.DomainEntity;

/**
 * The persistent class for the MONSTER_COUNT database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "MONSTER_COUNT", schema = "DESCENT")
public class MonsterCount extends AbstractEntity implements DomainEntity<MonsterCountPk> {

  /** Serial UID. */
  private static final long serialVersionUID = 8479396877170430878L;

  /** The identifier. */
  @EmbeddedId
  private MonsterCountPk ident;

  /** The master count. */
  @Column(nullable = false, precision = 1)
  private Integer master;

  /** The minion count. */
  @Column(nullable = false, precision = 1)
  private Integer minion;

  /** The monster group. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumns({
      @JoinColumn(name = "EXPANSION", referencedColumnName = "EXPANSION", nullable = false, insertable = false, updatable = false),
      @JoinColumn(name = "MONSTER_GROUP", referencedColumnName = "NAME", nullable = false, insertable = false, updatable = false) })
  private MonsterGroup monsterGroup;

  /**
   * Constructor.
   */
  public MonsterCount() {
    super();
  }

  /**
   * Returns the serializable ID of domain entity.
   *
   * @return the ID
   * @see DomainEntity#getId()
   */
  @Override
  public MonsterCountPk getId() {
    return getIdent();
  }

  /**
   * Returns the identifier.
   * 
   * @return the ident
   */
  public MonsterCountPk getIdent() {
    return this.ident;
  }

  /**
   * Defines the identifier.
   * 
   * @param ident
   *          the ident to set
   * @see DomainEntity#setIdent(MonsterCountPk)
   */
  @Override
  public void setIdent(final MonsterCountPk ident) {
    this.ident = ident;
  }

  /**
   * Returns the master count.
   * 
   * @return the master
   */
  public Integer getMaster() {
    return this.master;
  }

  /**
   * Defines the master count.
   * 
   * @param master
   *          the master to set
   */
  public void setMaster(final Integer master) {
    this.master = master;
  }

  /**
   * Returns the minion count.
   * 
   * @return the minion
   */
  public Integer getMinion() {
    return this.minion;
  }

  /**
   * Defines the minion count.
   * 
   * @param minion
   *          the minion to set
   */
  public void setMinion(final Integer minion) {
    this.minion = minion;
  }

  /**
   * Returns the monster group.
   * 
   * @return the monsterGroup
   */
  public MonsterGroup getMonsterGroup() {
    return this.monsterGroup;
  }

  /**
   * Defines the monster group.
   * 
   * @param monsterGroup
   *          the monsterGroup to set
   */
  public void setMonsterGroup(final MonsterGroup monsterGroup) {
    this.monsterGroup = monsterGroup;
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
          .append("heros", this.ident.getHeros());
    }
    builder.append("master", this.master).append("minion", this.minion);
    if (this.monsterGroup != null && MonsterGroup.class.equals(this.monsterGroup.getClass())) {
      builder.append("monsterGroup", this.monsterGroup);
    }
  }

}
