package com.raf.descent.jpa.domain.card;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The persistent class for the MONSTER_ABILITY database table.
 * 
 * @author RAF
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class MonsterAbility implements Serializable {

  /** Serial UID. */
  private static final long serialVersionUID = -2042593353573284690L;

  /** The ability. */
  @Column(name = "ABILITY", nullable = false, length = 30)
  private String ability;

  /** The ability value. */
  @Column(name = "VALUE", precision = 1)
  private Integer value;

  /** The action indicator. */
  @Column(name = "ACTION")
  private Boolean action;

  /**
   * Generate the toString.
   *
   * @see Object#toString()
   */
  @Override
  public final String toString() {
    final ToStringBuilder builder = new ToStringBuilder(this);
    builder.append("ability", this.ability).append("value", this.value).append("action", this.action);
    return builder.toString();
  }

}
