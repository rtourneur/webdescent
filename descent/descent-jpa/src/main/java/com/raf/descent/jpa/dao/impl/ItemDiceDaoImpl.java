package com.raf.descent.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.ItemDiceDao;
import com.raf.descent.jpa.domain.card.ItemDice;
import com.raf.descent.jpa.domain.card.ItemDicePk;

/**
 * Implementation DAO for {@link ItemDice}.
 * 
 * @author RAF
 */
@Repository
public final class ItemDiceDaoImpl extends AbstractDao<ItemDice, ItemDicePk> implements ItemDiceDao {

  /**
   * Constructor.
   */
  public ItemDiceDaoImpl() {
    super(ItemDice.class);
  }

  /**
   * Set the predicate for the findByExample request.
   * <ul>
   * <li>item</li>
   * <li>dice</li>
   * </ul>
   *
   * @param root
   *          the root type
   * @param example
   *          the example
   * @see AbstractDao#getPredicates(Root, ItemDice)
   */
  @Override
  protected Predicate[] getPredicates(final Root<ItemDice> root, final ItemDice example) {
    final List<Predicate> predicatesList = new ArrayList<Predicate>();
    if (example.getItem() != null) {
      predicatesList.add(getEquals(root, "item", example.getItem()));
    }
    if (example.getItemName() != null) {
      predicatesList.add(getEquals(root, IDENT, "item", example.getItemName()));
    }
    if (example.getDice() != null) {
      predicatesList.add(getEquals(root, "dice", example.getDice()));
    }
    if (example.getDiceName() != null) {
      predicatesList.add(getEquals(root, IDENT, "dice", example.getDiceName()));
    }
    return predicatesList.toArray(new Predicate[predicatesList.size()]);
  }

  /**
   * Returns the criteria default order.
   * 
   * @param builder
   *          the criteria builder
   * @param root
   *          the root type
   * @return the criteria order
   * @see AbstractDao#getOrder(CriteriaBuilder, Root)
   */
  @Override
  protected List<Order> getOrder(final CriteriaBuilder builder, final Root<ItemDice> root) {
    final List<Order> orders = new ArrayList<Order>();
    orders.add(builder.asc(root.get(IDENT).get("item")));
    orders.add(builder.asc(root.get(IDENT).get("index")));
    return orders;
  }

}
