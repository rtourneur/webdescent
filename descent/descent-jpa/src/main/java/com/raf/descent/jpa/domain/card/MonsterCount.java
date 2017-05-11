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
 * The persistent class for the MONSTER_COUNT database table.
 * 
 * @author RAF
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class MonsterCount implements Serializable {

  /** Serial UID. */
  private static final long serialVersionUID = 8479396877170430878L;

  /** The heros count. */
  @Column(name = "HERO", nullable = false, precision = 1)
  private Integer hero;

  /** The master count. */
  @Column(name = "MASTER", nullable = false, precision = 1)
  private Integer master;

  /** The minion count. */
  @Column(name = "MINION", nullable = false, precision = 1)
  private Integer minion;

  /**
   * Generate the toString.
   *
   * @see Object#toString()
   */
  @Override
  public final String toString() {
    final ToStringBuilder builder = new ToStringBuilder(this, SHORT_PREFIX_STYLE);
    builder.append("hero", this.hero).append("master", this.master).append("minion", this.minion);
    return builder.toString();
  }

}
