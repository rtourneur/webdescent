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
import com.raf.descent.jpa.domain.model.Act;

/**
 * The persistent class for the MONSTER_GROUP_ACT database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "MONSTER_GROUP_ACT", schema = "DESCENT")
public class MonsterGroupAct extends AbstractEntity implements DomainEntity<MonsterGroupActPk> {

  /** Serial UID. */
  private static final long serialVersionUID = 8479396877170430878L;

  /** The identifier. */
  @EmbeddedId
  private MonsterGroupActPk ident;

  /** The image. */
  @Column(nullable = false, length = 30)
  private String image;

  /** The monster group. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumns({
      @JoinColumn(name = "EXPANSION", referencedColumnName = "EXPANSION", nullable = false, insertable = false, updatable = false),
      @JoinColumn(name = "MONSTER_GROUP", referencedColumnName = "NAME", nullable = false, insertable = false, updatable = false) })
  private MonsterGroup monsterGroup;

  /** The monster size. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ACT", insertable = false, updatable = false)
  private Act act;

  /**
   * Constructor.
   */
  public MonsterGroupAct() {
    super();
  }

  /**
   * Returns the serializable ID of domain entity.
   *
   * @return the ID
   * @see DomainEntity#getId()
   */
  @Override
  public MonsterGroupActPk getId() {
    return getIdent();
  }

  /**
   * Returns the identifier.
   * 
   * @return the ident
   */
  public MonsterGroupActPk getIdent() {
    return this.ident;
  }

  /**
   * Defines the identifier.
   * 
   * @param ident
   *          the ident to set
   * @see DomainEntity#setIdent(MonsterGroupActPk)
   */
  @Override
  public void setIdent(final MonsterGroupActPk ident) {
    this.ident = ident;
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
   * Returns the act.
   * 
   * @return the act
   */
  public Act getAct() {
    return this.act;
  }

  /**
   * Defines the act.
   * 
   * @param act
   *          the act to set
   */
  public void setAct(final Act act) {
    this.act = act;
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
          .append("actName", this.ident.getAct());
    }
    builder.append("image", this.image);
    if (this.monsterGroup != null && MonsterGroup.class.equals(this.monsterGroup.getClass())) {
      builder.append("monsterGroup", this.monsterGroup);
    }
    if (this.act != null && Act.class.equals(this.act.getClass())) {
      builder.append("act", this.act);
    }
  }

}
