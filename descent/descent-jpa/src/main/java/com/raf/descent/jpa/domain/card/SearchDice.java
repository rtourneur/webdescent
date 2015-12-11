package com.raf.descent.jpa.domain.card;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.AbstractEntity;
import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.model.Dice;

/**
 * The persistent class for the SEARCH_DICE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "SEARCH_DICE", schema = "DESCENT")
public class SearchDice extends AbstractEntity implements DomainEntity<SearchDicePk> {

  /** Serial UID. */
  private static final long serialVersionUID = -668694173537458469L;

  /** The identifier. */
  @EmbeddedId
  private SearchDicePk ident;

  /** The search. */
  @ManyToOne
  @JoinColumns({
      @JoinColumn(name = "EXPANSION", referencedColumnName = "EXPANSION", nullable = false, insertable = false, updatable = false),
      @JoinColumn(name = "SEARCH", referencedColumnName = "NAME", nullable = false, insertable = false, updatable = false) })
  private Search search;

  /** The dice. */
  @ManyToOne
  @JoinColumn(name = "DICE", nullable = false, insertable = false, updatable = false)
  private Dice dice;

  /**
   * Constructor.
   */
  public SearchDice() {
    super();
  }

  /**
   * Returns the serializable ID of domain entity.
   *
   * @return the ID
   * @see DomainEntity#getId()
   */
  @Override
  public SearchDicePk getId() {
    return getIdent();
  }

  /**
   * Returns the identifier.
   * 
   * @return the ident
   */
  public SearchDicePk getIdent() {
    return this.ident;
  }

  /**
   * Defines the identifier.
   * 
   * @param ident
   *          the ident to set
   * @see DomainEntity#setIdent(SearchDicePk)
   */
  @Override
  public void setIdent(final SearchDicePk ident) {
    this.ident = ident;
  }

  /**
   * Returns the search name.
   * 
   * @return the search name
   */
  public String getSearchName() {
    if (this.ident == null) {
      this.ident = new SearchDicePk();
    }
    return this.ident.getSearch();
  }

  /**
   * Returns the expansion name.
   * 
   * @return the expansion name
   */
  public String getExpansionName() {
    if (this.ident == null) {
      this.ident = new SearchDicePk();
    }
    return this.ident.getExpansion();
  }

  /**
   * Returns the dice name.
   * 
   * @return the dice name
   */
  public String getDiceName() {
    if (this.ident == null) {
      this.ident = new SearchDicePk();
    }
    return this.ident.getDice();
  }

  /**
   * Returns the index.
   * 
   * @return the index
   */
  public Integer getIndex() {
    if (this.ident == null) {
      this.ident = new SearchDicePk();
    }
    return this.ident.getIndex();
  }

  /**
   * Returns the search.
   * 
   * @return the search
   */
  public Search getSearch() {
    return this.search;
  }

  /**
   * Defines the search.
   * 
   * @param search
   *          the search to set
   */
  public void setSearch(final Search item) {
    this.search = item;
  }

  /**
   * Returns the dice.
   * 
   * @return the dice
   */
  public Dice getDice() {
    return this.dice;
  }

  /**
   * Defines the dice.
   * 
   * @param dice
   *          the dice to set
   */
  public void setDice(final Dice dice) {
    this.dice = dice;
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractEntity#append(ToStringBuilder)
   */
  @Override
  protected void append(final ToStringBuilder builder) {
    builder.append("itemName", getSearchName()).append("diceName", getDiceName()).append("index", getIndex());
    if (this.search != null && Search.class.equals(this.search.getClass())) {
      builder.append("search", this.search);
    }
    if (this.dice != null && Dice.class.equals(this.dice.getClass())) {
      builder.append("dice", this.dice);
    }
  }

}
