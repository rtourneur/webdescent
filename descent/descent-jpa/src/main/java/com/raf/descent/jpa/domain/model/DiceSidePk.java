package com.raf.descent.jpa.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The primary key class for the DICE_SIDE database table.
 * 
 * @author RAF
 */
@Embeddable
public class DiceSidePk implements Serializable {

  /** Serial UID. */
  private static final long serialVersionUID = 1L;

  /** The dice. */
  @Column(insertable = false, updatable = false, unique = true, nullable = false, length = 30)
  private String dice;

  /** The side of the dice (for unicity). */
  @Column(nullable = false, precision = 1)
  private Integer side;

  /**
   * Constructor.
   */
  public DiceSidePk() {
    super();
  }

  /**
   * Returns the dice.
   * 
   * @return the dice
   */
  public String getDice() {
    return this.dice;
  }

  /**
   * Defines the dice.
   * 
   * @param dice
   *          the dice to set
   */
  public void setDice(final String dice) {
    this.dice = dice;
  }

  /**
   * Returns the side.
   * 
   * @return the side
   */
  public Integer getSide() {
    return this.side;
  }

  /**
   * Defines the side.
   * 
   * @param side
   *          the side to set
   */
  public void setSide(final Integer side) {
    this.side = side;
  }

  /**
   * Implementation for hashCode.
   * 
   * @see Object#hashCode()
   */
  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(this.dice).append(this.side).toHashCode();
  }

  /**
   * Implementation for equals.
   * 
   * @see Object#equals(Object)
   */
  @Override
  public boolean equals(final Object obj) {
    boolean equals;
    if (this == obj) {
      equals = true;
    } else {
      if (obj != null && getClass().equals(obj.getClass())) {
        final DiceSidePk other = (DiceSidePk) obj;
        equals = new EqualsBuilder().append(this.dice, other.dice).append(this.side, other.side).isEquals();
      } else {
        equals = false;
      }
    }
    return equals;
  }

  /**
   * Generate the toString.
   *
   * @see Object#toString()
   */
  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}
