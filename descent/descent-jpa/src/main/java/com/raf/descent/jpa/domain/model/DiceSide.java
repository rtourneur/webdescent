package com.raf.descent.jpa.domain.model;

import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The embeddable class for the dice sides.
 * 
 * @author RAF
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class DiceSide implements Serializable {

  /** Serial UID. */
  private static final long serialVersionUID = -4455448096553112863L;

  /** The side of the dice (for unicity). */
  @Column(name = "SIDE", nullable = false, precision = 1)
  private int side;

  /** The Miss (for attack die). */
  @Column(name = "MISS")
  private Boolean miss;

  /** The range value. */
  @Column(name = "RANGE", precision = 1)
  private Integer range;

  /** The hearth value. */
  @Column(name = "HEART", precision = 1)
  private Integer heart;

  /** The surge value. */
  @Column(name = "SURGE", precision = 1)
  private Integer surge;

  /** The shield value. */
  @Column(name = "SHIELD", precision = 1)
  private Integer shield;

  /** The icon. */
  @Column(name = "ICON", length = 30)
  private String icon;

  /**
   * Generate the toString.
   *
   * @see Object#toString()
   */
  @Override
  public final String toString() {
    final ToStringBuilder builder = new ToStringBuilder(this, SHORT_PREFIX_STYLE);
    builder.append("side", this.side).append("miss", this.miss).append("range", this.range).append("heart", this.heart)
        .append("surge", this.surge).append("shield", this.shield).append("icon", this.icon);
    return builder.toString();
  }

}
