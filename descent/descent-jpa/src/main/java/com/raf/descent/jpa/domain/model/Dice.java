package com.raf.descent.jpa.domain.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.AbstractNamedEntity;

/**
 * The persistent class for the DICE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "DICE", schema = "DESCENT")
public class Dice extends AbstractNamedEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -72946343124079373L;

  /** The dice type name. */
  @Column(name = "DICE_TYPE", nullable = false)
  private String diceTypeName;

  /** The dice type. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "DICE_TYPE", nullable = false, insertable = false, updatable = false)
  private DiceType diceType;

  /** The dice sides. */
  @OneToMany(mappedBy = "dice", fetch = FetchType.LAZY)
  private List<DiceSide> diceSides;

  /**
   * Constructor.
   */
  public Dice() {
    super();
  }

  /**
   * Returns the dice type name.
   * 
   * @return the diceTypeName
   */
  public String getDiceTypeName() {
    return this.diceTypeName;
  }

  /**
   * Defines the dice type name.
   * 
   * @param diceTypeName
   *          the diceTypeName to set
   */
  public void setDiceTypeName(final String diceTypeName) {
    this.diceTypeName = diceTypeName;
  }

  /**
   * Returns the dice type.
   * 
   * @return the dice type.
   */
  public DiceType getDiceType() {
    return this.diceType;
  }

  /**
   * Defines the dice type.
   * 
   * @param diceType
   *          the dice type to set.
   */
  public void setDiceType(final DiceType diceType) {
    this.diceType = diceType;
  }

  /**
   * Returns the dice sides.
   * 
   * @return the diceSides
   */
  public List<DiceSide> getDiceSides() {
    return this.diceSides;
  }

  /**
   * Define the dice sides.
   * 
   * @param diceSides
   *          the diceSides to set
   */
  public void setDiceSides(final List<DiceSide> diceSides) {
    this.diceSides = diceSides;
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractNamedEntity#appendNamed(ToStringBuilder)
   */
  @Override
  protected void appendNamed(final ToStringBuilder builder) {
    builder.append("diceTypeName", this.diceTypeName);
    if (this.diceType != null && DiceType.class.equals(this.diceType.getClass())) {
      builder.append("diceType", this.diceType);
    }
  }

}
