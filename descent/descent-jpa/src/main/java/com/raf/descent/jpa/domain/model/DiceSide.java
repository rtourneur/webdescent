package com.raf.descent.jpa.domain.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.AbstractEntity;
import com.raf.descent.jpa.domain.DomainEntity;

/**
 * The persistent class for the DICE_SIDE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "DICE_SIDE", schema = "DESCENT")
public class DiceSide extends AbstractEntity implements DomainEntity<DiceSidePk> {

  /** Serial UID. */
  private static final long serialVersionUID = 1L;

  /** The identifier. */
  @EmbeddedId
  private DiceSidePk ident;

  /** The Miss (for attack die). */
  @Column
  private Boolean miss;

  /** The range value. */
  @Column(precision = 1)
  private Integer range;

  /** The hearth value. */
  @Column(precision = 1)
  private Integer heart;

  /** The surge value. */
  @Column(precision = 1)
  private Integer surge;

  /** The shield value. */
  @Column(precision = 1)
  private Integer shield;

  /** The icon. */
  @Column(length = 30)
  private String icon;

  /** The dice. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "DICE", nullable = false, insertable = false, updatable = false)
  private Dice dice;

  /**
   * Constructor.
   */
  public DiceSide() {
    super();
  }

  /**
   * Returns the serializable ID of domain entity.
   *
   * @return the ID
   * @see DomainEntity#getId()
   */
  @Override
  public DiceSidePk getId() {
    return getIdent();
  }

  /**
   * Returns the ident.
   * 
   * @return the ident
   */
  public DiceSidePk getIdent() {
    return this.ident;
  }

  /**
   * Defines the ident.
   * 
   * @param ident
   *          the ident to set
   */
  @Override
  public void setIdent(final DiceSidePk ident) {
    this.ident = ident;
  }

  /**
   * Returns the dice name from the identifier.
   * 
   * @return the dice name
   */
  public String getDiceName() {
    if (this.ident == null) {
      this.ident = new DiceSidePk();
    }
    return this.ident.getDice();
  }

  /**
   * Returns the side from the identifier.
   * 
   * @return the side
   */
  public Integer getSide() {
    if (this.ident == null) {
      this.ident = new DiceSidePk();
    }
    return this.ident.getSide();
  }

  /**
   * Returns the miss.
   * 
   * @return the miss
   */
  public Boolean getMiss() {
    return this.miss;
  }

  /**
   * Defines the miss.
   * 
   * @param miss
   *          the miss to set
   */
  public void setMiss(final Boolean miss) {
    this.miss = miss;
  }

  /**
   * Returns the range.
   * 
   * @return the range
   */
  public Integer getRange() {
    return this.range;
  }

  /**
   * Defines the range.
   * 
   * @param range
   *          the range to set
   */
  public void setRange(final Integer range) {
    this.range = range;
  }

  /**
   * Returns the heart.
   * 
   * @return the heart
   */
  public Integer getHeart() {
    return this.heart;
  }

  /**
   * Defines the heart.
   * 
   * @param heart
   *          the heart to set
   */
  public void setHeart(final Integer heart) {
    this.heart = heart;
  }

  /**
   * Returns the surge.
   * 
   * @return the surge
   */
  public Integer getSurge() {
    return this.surge;
  }

  /**
   * Defines the surge.
   * 
   * @param surge
   *          the surge to set
   */
  public void setSurge(final Integer surge) {
    this.surge = surge;
  }

  /**
   * Returns the shield.
   * 
   * @return the shield
   */
  public Integer getShield() {
    return this.shield;
  }

  /**
   * Defines the shield.
   * 
   * @param shield
   *          the shield to set
   */
  public void setShield(final Integer shield) {
    this.shield = shield;
  }

  /**
   * Returns the icon.
   * 
   * @return the icon
   */
  public String getIcon() {
    return this.icon;
  }

  /**
   * Defines the icon.
   * 
   * @param icon
   *          the icon to set
   */
  public void setIcon(final String icon) {
    this.icon = icon;
  }

  /**
   * Returns the dice.
   * 
   * @return the dice
   */
  public Dice getDice() {
    return this.dice;
  }

  /**
   * Defines the dice.
   * 
   * @param dice
   *          the dice to set
   */
  public void setDice(final Dice dice) {
    this.dice = dice;
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
    builder.append("diceName", getDiceName()).append("side", getSide()).append("miss", this.miss)
        .append("range", this.range).append("heart", this.heart).append("surge", this.surge)
        .append("shield", this.shield).append("icon", this.icon);
    if (this.dice != null && Dice.class.equals(this.dice.getClass())) {
      builder.append("dice", this.dice);
    }
  }

}
