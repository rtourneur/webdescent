package com.raf.descent.rule.model;

import java.util.List;

/**
 * Class for damages statistics.
 * 
 * @author RAF
 */
public final class Damages {

  /** The damage values. */
  private List<int[]> values;

  /**
   * Constructor.
   */
  public Damages() {
    super();
  }

  /**
   * Returns the damage values.
   * 
   * @return the values
   */
  public List<int[]> getValues() {
    return this.values;
  }

  /**
   * Defines the damage values.
   * 
   * @param values
   *          the values to set
   */
  public void setValues(final List<int[]> values) {
    this.values = values;
  }

  /**
   * Returns the min damage.
   * 
   * @return the min
   */
  public int getMin() {
    int min = 0;
    for (final int[] value : this.values) {
      if (min == 0) {
        min = value[0];
      } else {
        min = Math.min(min, value[0]);
      }
    }
    return min;
  }

  /**
   * Returns the max damage.
   * 
   * @return the max
   */
  public int getMax() {
    int max = 0;
    for (final int[] value : this.values) {
      if (max == 0) {
        max = value[0];
      } else {
        max = Math.max(max, value[0]);
      }
    }
    return max;
  }

  /**
   * Returns the average damage.
   * 
   * @return the average
   */
  public double getMoy() {
    int moy = 0;
    for (final int[] value : this.values) {
      moy += value[0];
    }
    return (double) moy / this.values.size() * 6 / 5;
  }

}
