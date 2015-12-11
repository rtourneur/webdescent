package com.raf.descent.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.ClazzDao;
import com.raf.descent.jpa.domain.model.Clazz;

/**
 * Implementation DAO for {@link Clazz}.
 * 
 * @author RAF
 */
@Repository
public final class ClazzDaoImpl extends AbstractDao<Clazz, String> implements ClazzDao {

  /**
   * Constructor.
   */
  public ClazzDaoImpl() {
    super(Clazz.class);
  }

  /**
   * Set the predicate for the findByExample request.
   * <ul>
   * <li>name</li>
   * <li>archetype</li>
   * <li>expansion</li>
   * </ul>
   *
   * @param root
   *          the root type
   * @param example
   *          the example
   * @see AbstractDao#getPredicates(Root, Clazz)
   */
  @Override
  protected Predicate[] getPredicates(final Root<Clazz> root, final Clazz example) {
    final List<Predicate> predicatesList = new ArrayList<Predicate>();
    if (example.getName() != null) {
      predicatesList.add(getEquals(root, "name", example.getName()));
    }
    if (example.getArchetypeName() != null) {
      predicatesList.add(getEquals(root, "archetypeName", example.getArchetypeName()));
    }
    if (example.getArchetype() != null) {
      predicatesList.add(getEquals(root, "archetype", example.getArchetype()));
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
  protected List<Order> getOrder(final CriteriaBuilder builder, final Root<Clazz> root) {
    final List<Order> orders = new ArrayList<Order>();
    orders.add(builder.asc(root.get("name")));
    return orders;
  }

}
