package com.raf.descent.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.ConditionDao;
import com.raf.descent.jpa.domain.model.Condition;

/**
 * Implementation DAO for {@link Condition}.
 * 
 * @author RAF
 */
@Repository
public final class ConditionDaoImpl extends AbstractDao<Condition, String> implements ConditionDao {

  /**
   * Constructor.
   */
  public ConditionDaoImpl() {
    super(Condition.class);
  }

  /**
   * Set the predicate for the findByExample request.
   * <ul>
   * <li>name</li>
   * <li>expansion</li>
   * </ul>
   *
   * @param root
   *          the root type
   * @param example
   *          the example
   * @see AbstractDao#getPredicates(Root, Condition)
   */
  @Override
  protected Predicate[] getPredicates(final Root<Condition> root, final Condition example) {
    final List<Predicate> predicatesList = new ArrayList<Predicate>();
    if (example.getName() != null) {
      predicatesList.add(getEquals(root, "name", example.getName()));
    }
    if (example.getExpansionName() != null) {
      predicatesList.add(getEquals(root, "expansionName", example.getExpansionName()));
    }
    if (example.getExpansion() != null) {
      predicatesList.add(getEquals(root, "expansion", example.getExpansion()));
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
  protected List<Order> getOrder(final CriteriaBuilder builder, final Root<Condition> root) {
    final List<Order> orders = new ArrayList<Order>();
    orders.add(builder.asc(root.get("name")));
    return orders;
  }

}
