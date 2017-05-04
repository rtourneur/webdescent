package com.raf.descent.jpa.domain.card;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.model.Surge;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The persistent class for the MONSTER_SURGE database table.
 * 
 * @author RAF
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class MonsterSurge implements Serializable {

  /** Serial UID. */
  private static final long serialVersionUID = -3937369406455990732L;

  /** The surge. */
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "SURGE", nullable = false)
  private Surge surge;

  /** The index. */
  @Column(name = "INDEX", nullable = false, precision = 1)
  private Integer index;

  /**
   * Generate the toString.
   *
   * @see Object#toString()
   */
  @Override
  public final String toString() {
    final ToStringBuilder builder = new ToStringBuilder(this);
    builder.append("surge", this.surge).append("index", this.index);
    return builder.toString();
  }

}
