package com.raf.descent.jpa.domain.card;

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
import com.raf.descent.jpa.domain.model.Surge;

/**
 * The persistent class for the MONSTER_SURGE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "MONSTER_SURGE", schema = "DESCENT")
public class MonsterSurge extends AbstractEntity implements DomainEntity<MonsterSurgePk> {

  /** Serial UID. */
  private static final long serialVersionUID = -3937369406455990732L;

  /** The identifier. */
  @EmbeddedId
  private MonsterSurgePk ident;

  /** The monster stat. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumns({
      @JoinColumn(name = "EXPANSION", referencedColumnName = "EXPANSION", nullable = false, insertable = false, updatable = false),
      @JoinColumn(name = "MONSTER_GROUP", referencedColumnName = "MONSTER_GROUP", nullable = false, insertable = false, updatable = false),
      @JoinColumn(name = "ACT", referencedColumnName = "ACT", nullable = false, insertable = false, updatable = false),
      @JoinColumn(name = "MONSTER_TYPE", referencedColumnName = "MONSTER_TYPE", nullable = false, insertable = false, updatable = false) })
  private MonsterStat monsterStat;

  /** The surge. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "SURGE", insertable = false, updatable = false)
  private Surge surge;

  /**
   * Constructor.
   */
  public MonsterSurge() {
    super();
  }

  /**
   * Returns the serializable ID of domain entity.
   *
   * @return the ID
   * @see DomainEntity#getId()
   */
  @Override
  public MonsterSurgePk getId() {
    return getIdent();
  }

  /**
   * Returns the identifier.
   * 
   * @return the ident
   */
  public MonsterSurgePk getIdent() {
    return this.ident;
  }

  /**
   * Defines the identifier.
   * 
   * @param ident
   *          the ident to set
   * @see DomainEntity#setIdent(MonsterSurgePk)
   */
  @Override
  public void setIdent(final MonsterSurgePk ident) {
    this.ident = ident;
  }

  /**
   * Returns the monster group name.
   *
   * @return the monster group name
   */
  public String getMonsterGroupName() {
    if (this.ident == null) {
      this.ident = new MonsterSurgePk();
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
      this.ident = new MonsterSurgePk();
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
      this.ident = new MonsterSurgePk();
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
      this.ident = new MonsterSurgePk();
    }
    return this.ident.getMonsterTypeName();
  }

  /**
   * Returns the surge name.
   *
   * @return the surge name
   */
  public Integer getSurgeId() {
    if (this.ident == null) {
      this.ident = new MonsterSurgePk();
    }
    return this.ident.getSurge();
  }

  /**
   * Returns the index.
   *
   * @return the index
   */
  public Integer getIndex() {
    if (this.ident == null) {
      this.ident = new MonsterSurgePk();
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
   * Returns the surge.
   * 
   * @return the surge
   */
  public Surge getSurge() {
    return this.surge;
  }

  /**
   * Defines the surge.
   * 
   * @param surge
   *          the surge to set
   */
  public void setSurge(final Surge surge) {
    this.surge = surge;
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
          .append("surgeId", this.ident.getSurge()).append("index", this.ident.getIndex());
    }
    if (this.monsterStat != null && MonsterStat.class.equals(this.monsterStat.getClass())) {
      builder.append("monsterStat", this.monsterStat);
    }
    if (this.surge != null && Surge.class.equals(this.surge.getClass())) {
      builder.append("surge", this.surge);
    }
  }

}
