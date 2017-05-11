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
 * The embeddable class for the MONSTER_GROUP_ACT database table.
 * 
 * @author RAF
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class MonsterGroupAct implements Serializable {

  /** Serial UID. */
  private static final long serialVersionUID = 8479396877170430878L;

  /** The act. */
  @Column(name = "ACT", nullable = false, length = 30)
  private String act;

  /** The image. */
  @Column(name = "IMAGE", nullable = false, length = 30)
  private String image;

  /**
   * Generate the toString.
   *
   * @see Object#toString()
   */
  @Override
  public final String toString() {
    final ToStringBuilder builder = new ToStringBuilder(this, SHORT_PREFIX_STYLE);
    builder.append("act", this.act).append("image", this.image);
    return builder.toString();
  }

}
