package com.raf.descent.jpa.domain.card;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.AbstractEntity;
import com.raf.descent.jpa.domain.DomainNamedEntity;
import com.raf.descent.jpa.domain.model.AttackType;
import com.raf.descent.jpa.domain.model.Expansion;
import com.raf.descent.jpa.domain.model.MonsterSize;
import com.raf.descent.jpa.domain.model.MonsterTrait;
import com.raf.descent.jpa.domain.model.NameExpansionPk;

/**
 * The persistent class for the MONSTER_GROUP database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "MONSTER_GROUP", schema = "DESCENT")
public class MonsterGroup extends AbstractEntity implements DomainNamedEntity<NameExpansionPk> {

  /** Serial UID. */
  private static final long serialVersionUID = 6789842339165409178L;

  /** The identifier. */
  @EmbeddedId
  private NameExpansionPk ident;

  /** The message code. */
  @Column(name = "MESSAGE_CODE", nullable = false, length = 40)
  private String messageCode;

  /** The attack type name. */
  @Column(name = "ATTACK_TYPE", length = 30)
  private String attackTypeName;

  /** The monster size name. */
  @Column(name = "MONSTER_SIZE", length = 30)
  private String monsterSizeName;

  /** The master count. */
  @Column(precision = 1)
  private Integer master;

  /** The minion count. */
  @Column(precision = 1)
  private Integer minion;

  /** The expansion. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "EXPANSION", nullable = false, insertable = false, updatable = false)
  private Expansion expansion;

  /** The attack type. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ATTACK_TYPE", insertable = false, updatable = false)
  private AttackType attackType;

  /** The monster size. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "MONSTER_SIZE", insertable = false, updatable = false)
  private MonsterSize monsterSize;

  /** The list of traits. */
  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "MONSTER_GROUP_TRAIT", schema = "DESCENT", joinColumns = {
      @JoinColumn(name = "MONSTER_GROUP", nullable = false, referencedColumnName = "NAME"),
      @JoinColumn(name = "EXPANSION", nullable = false, referencedColumnName = "EXPANSION") }, inverseJoinColumns = { @JoinColumn(name = "MONSTER_TRAIT", nullable = false) })
  private List<MonsterTrait> traits;

  /**
   * Constructor.
   */
  public MonsterGroup() {
    super();
  }

  /**
   * Returns the serializable ID of domain entity.
   *
   * @return the ID
   * @see DomainNamedEntity#getId()
   */
  @Override
  public NameExpansionPk getId() {
    return getIdent();
  }

  /**
   * Returns the identifier.
   * 
   * @return the ident
   */
  public NameExpansionPk getIdent() {
    return this.ident;
  }

  /**
   * Defines the identifier.
   * 
   * @param ident
   *          the ident to set
   * @see DomainNamedEntity#setIdent(NameExpansionPk)
   */
  @Override
  public void setIdent(final NameExpansionPk ident) {
    this.ident = ident;
  }

  /**
   * Returns the name.
   *
   * @return the name
   * @see DomainNamedEntity#getName()
   */
  @Override
  public String getName() {
    if (this.ident == null) {
      this.ident = new NameExpansionPk();
    }
    return this.ident.getName();
  }

  /**
   * Defines the name.
   *
   * @param name
   *          the name to set
   * @see DomainNamedEntity#setName(String)
   */
  @Override
  public void setName(final String name) {
    if (this.ident == null) {
      this.ident = new NameExpansionPk();
    }
    this.ident.setName(name);
  }

  /**
   * Returns the expansion name.
   *
   * @return the expansion name
   */
  public String getExpansionName() {
    if (this.ident == null) {
      this.ident = new NameExpansionPk();
    }
    return this.ident.getExpansion();
  }

  /**
   * Defines the expansion name.
   *
   * @param expansionName
   *          the expansionName to set
   */
  public void setExpansionName(final String expansionName) {
    if (this.ident == null) {
      this.ident = new NameExpansionPk();
    }
    this.ident.setExpansion(expansionName);
  }

  /**
   * Returns the message code.
   * 
   * @return the message code
   * @see DomainNamedEntity#getMessageCode()
   */
  @Override
  public String getMessageCode() {
    return this.messageCode;
  }

  /**
   * Defines the message code.
   * 
   * @param messageCode
   *          the message code
   * @see DomainNamedEntity#setMessageCode(String)
   */
  @Override
  public void setMessageCode(final String messageCode) {
    this.messageCode = messageCode;
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
   * Returns the monster size name.
   * 
   * @return the attackTypeName
   */
  public String getMonsterSizeName() {
    return this.monsterSizeName;
  }

  /**
   * Defines the monster size name.
   * 
   * @param monsterSizeName
   *          the monsterSizeName to set
   */
  public void setMonsterSizeName(final String monsterSizeName) {
    this.monsterSizeName = monsterSizeName;
  }

  /**
   * Returns the master.
   * 
   * @return the master
   */
  public Integer getMaster() {
    return this.master;
  }

  /**
   * Defines the master.
   * 
   * @param master
   *          the master to set
   */
  public void setMaster(final Integer master) {
    this.master = master;
  }

  /**
   * Returns the minion.
   * 
   * @return the minion
   */
  public Integer getMinion() {
    return this.minion;
  }

  /**
   * Defines the minion.
   * 
   * @param minion
   *          the minion to set
   */
  public void setMinion(final Integer minion) {
    this.minion = minion;
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
   * Returns the monster size.
   * 
   * @return the monsterSize
   */
  public MonsterSize getMonsterSize() {
    return this.monsterSize;
  }

  /**
   * Defines the monster size.
   * 
   * @param monsterSize
   *          the monsterSize to set
   */
  public void setMonsterSize(final MonsterSize monsterSize) {
    this.monsterSize = monsterSize;
  }

  /**
   * Returns the list of traits.
   * 
   * @return the traits
   */
  public List<MonsterTrait> getTraits() {
    return this.traits;
  }

  /**
   * Defines the list of traits.
   * 
   * @param traits
   *          the traits to set
   */
  public void setTraits(final List<MonsterTrait> traits) {
    this.traits = traits;
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractEntity#append(ToStringBuilder)
   */
  @Override
  protected final void append(final ToStringBuilder builder) {
    builder.append("name", getName()).append("expansionName", getExpansionName())
        .append("messageCode", this.messageCode).append("attackTypeName", this.attackTypeName)
        .append("monsterSizeName", this.monsterSizeName).append("master", this.master).append("minion", this.minion);
    if (this.expansion != null && Expansion.class.equals(this.expansion.getClass())) {
      builder.append("expansion", this.expansion);
    }
    if (this.attackType != null && AttackType.class.equals(this.attackType.getClass())) {
      builder.append("attackType", this.attackType);
    }
    if (this.monsterSize != null && MonsterSize.class.equals(this.monsterSize.getClass())) {
      builder.append("monsterSize", this.monsterSize);
    }
  }

}
