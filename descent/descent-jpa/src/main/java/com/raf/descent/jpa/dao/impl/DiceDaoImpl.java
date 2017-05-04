package com.raf.descent.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.DiceDao;
import com.raf.descent.jpa.domain.model.Dice;
import com.raf.fwk.jpa.dao.AbstractDao;

/**
 * Implementation DAO for {@link Dice}.
 * 
 * @author RAF
 */
@Repository
public final class DiceDaoImpl extends AbstractDao<Dice, String> implements DiceDao {

  /**
   * Constructor.
   */
  public DiceDaoImpl() {
    super(Dice.class);
  }

  /**
   * Set the predicate for the findByExample request.
   * <ul>
   * <li>name</li>
   * <li>dice type</li>
   * </ul>
   *
   * @param root
   *          the root type
   * @param example
   *          the example
   * @see AbstractDao#getPredicates(Root, Dice)
   */
  @Override
  protected Predicate[] getPredicates(final Root<Dice> root, final Dice example) {
    final List<Predicate> predicatesList = new ArrayList<>();
    if (example.getName() != null) {
      predicatesList.add(getEquals(root, "name", example.getName()));
    }
    if (example.getDiceTypeName() != null) {
      predicatesList.add(getEquals(root, "diceTypeName", example.getDiceTypeName()));
    }
    if (example.getDiceType() != null) {
      predicatesList.add(getEquals(root, "diceType", example.getDiceType()));
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
  protected List<Order> getOrder(final CriteriaBuilder builder, final Root<Dice> root) {
    final List<Order> orders = new ArrayList<>();
    orders.add(builder.asc(root.get("name")));
    return orders;
  }

}
