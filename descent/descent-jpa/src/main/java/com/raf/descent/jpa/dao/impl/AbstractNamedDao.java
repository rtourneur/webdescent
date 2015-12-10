package com.raf.descent.jpa.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.raf.descent.jpa.domain.DomainNamedEntity;

/**
 * Abstract implementation for all DAOs.
 *
 * @author RAF
 * @param <E>
 *          the interface entity
 * @param <I>
 *          the identifier
 */
public abstract class AbstractNamedDao<E extends DomainNamedEntity<I>, I extends Serializable> extends
    AbstractDao<E, I> {

  /**
   * Constructor.
   *
   * @param entityClass
   *          the entity class.
   */
  protected AbstractNamedDao(final Class<? extends E> entityClass) {
    super(entityClass);
  }

  /**
   * Set the predicate for the findByExample request.
   * <ul>
   * <li>name</li>
   * </ul>
   *
   * @param criteriaQuery
   *          the predicate
   * @param example
   *          the example
   * @see AbstractDao#getPredicates(Root, DomainNamedEntity)
   */
  @Override
  protected final Predicate[] getPredicates(final Root<E> root, final E example) {
    final List<Predicate> predicatesList = new ArrayList<Predicate>();
    if (example.getName() != null) {
      predicatesList.add(getEquals(root, "name", example.getName()));
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
  protected final List<Order> getOrder(final CriteriaBuilder builder, final Root<E> root) {
    final List<Order> orders = new ArrayList<Order>();
    orders.add(builder.asc(root.get("name")));
    return orders;
  }

}
