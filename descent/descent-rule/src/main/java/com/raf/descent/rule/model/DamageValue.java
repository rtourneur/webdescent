package com.raf.descent.rule.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Class for damages value statistic.
 * 
 * @author RAF
 *
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class DamageValue implements Serializable {

  /** Serial UID. */
  private static final long serialVersionUID = 1164260046427487676L;

  /** The range value. */
  private int range;

  /** The damage value. */
  private int damage;

  /** The surge value. */
  private int surge;

  /** The miss indicator. */
  private boolean miss;
}
