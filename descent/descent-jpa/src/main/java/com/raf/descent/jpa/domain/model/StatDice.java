package com.raf.descent.jpa.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.commons.lang3.builder.ToStringBuilder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The embeddable class for the stat dices.
 * 
 * @author RAF
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class StatDice implements Serializable {

  /** Serial UID. */
  private static final long serialVersionUID = -5253063535044546737L;

  /** The dice. */
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "DICE", nullable = false, insertable = false, updatable = false)
  private Dice dice;

  /** The index of the dice (for unicity). */
  @Column(name = "INDEX", nullable = false, precision = 1)
  private int index;

  /**
   * Generate the toString.
   *
   * @see Object#toString()
   */
  @Override
  public final String toString() {
    final ToStringBuilder builder = new ToStringBuilder(this);
    if (this.dice != null && Dice.class.equals(this.dice.getClass())) {
      builder.append("dice", this.dice);
    }
    builder.append("index", this.index);
    return builder.toString();
  }

}
