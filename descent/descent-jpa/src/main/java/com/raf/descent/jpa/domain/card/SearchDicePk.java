package com.raf.descent.jpa.domain.card;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The primary key class for the ITEM_DICE database table.
 * 
 * @author RAF
 */
@Embeddable
public class SearchDicePk implements Serializable {

  /** Serial UID. */
  private static final long serialVersionUID = 6517379446992749131L;

  /** The search. */
  @Column(insertable = false, updatable = false, unique = true, nullable = false, length = 30)
  private String search;

  /** The expansion. */
  @Column(insertable = false, updatable = false, unique = true, nullable = false, length = 30)
  private String expansion;

  /** The dice. */
  @Column(insertable = false, updatable = false, unique = true, nullable = false, length = 30)
  private String dice;

  /** The index. */
  @Column(unique = true, nullable = false, precision = 1)
  private Integer index;

  /**
   * Constructor.
   */
  public SearchDicePk() {
    super();
  }

  /**
   * Returns the search.
   * 
   * @return the search
   */
  public String getSearch() {
    return this.search;
  }

  /**
   * Defines the search.
   * 
   * @param search
   *          the search to set
   */
  public void setSearch(final String item) {
    this.search = item;
  }

  /**
   * Returns the expansion.
   * 
   * @return the expansion
   */
  public String getExpansion() {
    return this.expansion;
  }

  /**
   * Defines the expansion.
   * 
   * @param expansion
   *          the expansion to set
   */
  public void setExpansion(final String expansion) {
    this.expansion = expansion;
  }

  /**
   * Returns the dice.
   * 
   * @return the dice
   */
  public String getDice() {
    return this.dice;
  }

  /**
   * Defines the dice.
   * 
   * @param dice
   *          the dice to set
   */
  public void setDice(final String dice) {
    this.dice = dice;
  }

  /**
   * Returns the index.
   * 
   * @return the index
   */
  public Integer getIndex() {
    return this.index;
  }

  /**
   * Defines the index.
   * 
   * @param index
   *          the index to set
   */
  public void setIndex(final Integer index) {
    this.index = index;
  }

  /**
   * Implementation for hashCode.
   * 
   * @see Object#hashCode()
   */
  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(this.search).append(this.expansion).append(this.dice).append(this.index)
        .toHashCode();
  }

  /**
   * Implementation for equals.
   * 
   * @see Object#equals(Object)
   */
  @Override
  public boolean equals(final Object obj) {
    boolean equals;
    if (this == obj) {
      equals = true;
    } else {
      if (obj != null && getClass().equals(obj.getClass())) {
        final SearchDicePk other = (SearchDicePk) obj;
        equals = new EqualsBuilder().append(this.search, other.search).append(this.expansion, other.expansion)
            .append(this.dice, other.dice).append(this.index, other.index).isEquals();
      } else {
        equals = false;
      }
    }
    return equals;
  }

  /**
   * Generate the toString.
   *
   * @see Object#toString()
   */
  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
