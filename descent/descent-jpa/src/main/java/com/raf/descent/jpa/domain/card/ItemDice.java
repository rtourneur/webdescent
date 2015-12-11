package com.raf.descent.jpa.domain.card;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.AbstractEntity;
import com.raf.descent.jpa.domain.DomainEntity;
import com.raf.descent.jpa.domain.model.Dice;

/**
 * The persistent class for the ITEM_DICE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "ITEM_DICE", schema = "DESCENT")
public class ItemDice extends AbstractEntity implements DomainEntity<ItemDicePk> {

  /** Serial UID. */
  private static final long serialVersionUID = -668694173537458469L;

  /** The identifier. */
  @EmbeddedId
  private ItemDicePk ident;

  /** The item. */
  @ManyToOne
  @JoinColumn(name = "ITEM", nullable = false, insertable = false, updatable = false)
  private Item item;

  /** The dice. */
  @ManyToOne
  @JoinColumn(name = "DICE", nullable = false, insertable = false, updatable = false)
  private Dice dice;

  /**
   * Constructor.
   */
  public ItemDice() {
    super();
  }

  /**
   * Returns the serializable ID of domain entity.
   *
   * @return the ID
   * @see DomainEntity#getId()
   */
  @Override
  public ItemDicePk getId() {
    return getIdent();
  }

  /**
   * Returns the identifier.
   * 
   * @return the ident
   */
  public ItemDicePk getIdent() {
    return this.ident;
  }

  /**
   * Defines the identifier.
   * 
   * @param ident
   *          the ident to set
   * @see DomainEntity#setIdent(ItemDicePk)
   */
  @Override
  public void setIdent(final ItemDicePk ident) {
    this.ident = ident;
  }

  /**
   * Returns the item name.
   * 
   * @return the item name
   */
  public String getItemName() {
    if (this.ident == null) {
      this.ident = new ItemDicePk();
    }
    return this.ident.getItem();
  }

  /**
   * Returns the dice name.
   * 
   * @return the dice name
   */
  public String getDiceName() {
    if (this.ident == null) {
      this.ident = new ItemDicePk();
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
      this.ident = new ItemDicePk();
    }
    return this.ident.getIndex();
  }

  /**
   * Returns the item.
   * 
   * @return the item
   */
  public Item getItem() {
    return this.item;
  }

  /**
   * Defines the item.
   * 
   * @param item
   *          the item to set
   */
  public void setItem(final Item item) {
    this.item = item;
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
    builder.append("itemName", getItemName()).append("diceName", getDiceName()).append("index", getIndex());
    if (this.item != null && Item.class.equals(this.item.getClass())) {
      builder.append("item", this.item);
    }
    if (this.dice != null && Dice.class.equals(this.dice.getClass())) {
      builder.append("dice", this.dice);
    }
  }

}
