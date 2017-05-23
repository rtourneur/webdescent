package com.raf.descent.jpa.domain.model;

import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode
public class StatDiceName implements Serializable {

  /** Serial UID. */
  private static final long serialVersionUID = -5253063535044546737L;

  /** The dice name. */
  @Column(name = "DICE", nullable = false, length = 30)
  private String diceName;

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
    final ToStringBuilder builder = new ToStringBuilder(this, SHORT_PREFIX_STYLE);
    builder.append("dice", this.diceName).append("index", this.index);
    return builder.toString();
  }

}
