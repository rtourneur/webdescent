package com.raf.descent.rule.model;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class for damages statistics.
 * 
 * @author RAF
 */
@Getter
@Setter
@NoArgsConstructor
public final class Damages {

  /** The ranged indicator. */
  private boolean ranged;

  /** The damage values. */
  private List<DamageValue> values;

  /**
   * Returns the min damage.
   * 
   * @return the min
   */
  public int getMinDamage() {
    int min = 0;
    for (final DamageValue value : this.values) {
      if (min == 0) {
        min = value.getDamage();
      } else {
        min = Math.min(min, value.getDamage());
      }
    }
    return min;
  }

  /**
   * Returns the max damage.
   * 
   * @return the max
   */
  public int getMaxDamage() {
    int max = 0;
    for (final DamageValue value : this.values) {
      if (max == 0) {
        max = value.getDamage();
      } else {
        max = Math.max(max, value.getDamage());
      }
    }
    return max;
  }

  /**
   * Returns the average damage.
   * 
   * @return the average
   */
  public double getMoyDamage() {
    int moy = 0;
    for (final DamageValue value : this.values) {
      moy += value.getDamage();
    }
    return (double) moy / this.values.size() * 6 / 5;
  }

  /**
   * Returns the min range.
   * 
   * @return the min
   */
  public int getMinRange() {
    int min = 0;
    for (final DamageValue value : this.values) {
      if (min == 0) {
        min = value.getRange();
      } else {
        min = Math.min(min, value.getRange());
      }
    }
    return min;
  }

  /**
   * Returns the max range.
   * 
   * @return the max
   */
  public int getMaxRange() {
    int max = 0;
    for (final DamageValue value : this.values) {
      if (max == 0) {
        max = value.getRange();
      } else {
        max = Math.max(max, value.getRange());
      }
    }
    return max;
  }

  /**
   * Returns the average range.
   * 
   * @return the average
   */
  public double getMoyRange() {
    int moy = 0;
    for (final DamageValue value : this.values) {
      moy += value.getRange();
    }
    return (double) moy / this.values.size() * 6 / 5;
  }

  /**
   * Generate the toString.
   * 
   * @return the toString
   * 
   * @see Object#toString()
   */
  @Override
  public String toString() {
    final ToStringBuilder builder = new ToStringBuilder(this);
    builder.append("damage", getMinDamage() + "-" + getMaxDamage() + "(" + getMoyDamage() + ")");
    if (this.ranged) {
      builder.append("range", getMinRange() + "-" + getMaxRange() + "(" + getMoyRange() + ")");
    }
    builder.append("values", this.values.toArray());
    return builder.toString();
  }

}
