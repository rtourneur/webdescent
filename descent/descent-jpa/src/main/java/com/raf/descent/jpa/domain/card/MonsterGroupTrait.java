package com.raf.descent.jpa.domain.card;

import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The embeddable class for the traits of the monsters group.
 * 
 * @author RAF
 *
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class MonsterGroupTrait implements Serializable {

  /** Serial UID. */
  private static final long serialVersionUID = -1139898293105165189L;

  /** The trait name. */
  @Column(name = "TRAIT", nullable = false, length = 30)
  private String trait;

  /**
   * Generate the toString.
   *
   * @see Object#toString()
   */
  @Override
  public final String toString() {
    final ToStringBuilder builder = new ToStringBuilder(this, SHORT_PREFIX_STYLE);
    builder.append("trait", this.trait);
    return builder.toString();
  }

}
