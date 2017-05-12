package com.raf.descent.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.SurgeDao;
import com.raf.descent.jpa.domain.model.Surge;
import com.raf.fwk.jpa.dao.AbstractDao;

/**
 * Implementation DAO for {@link Surge}.
 * 
 * @author RAF
 */
@Repository
public final class SurgeDaoImpl extends AbstractDao<Surge, Integer> implements SurgeDao {

  /**
   * Constructor.
   */
  public SurgeDaoImpl() {
    super(Surge.class);
  }

  /**
   * Set the predicate for the findByExample request.
   * <ul>
   * <li>id</li>
   * </ul>
   *
   * @param root
   *          the root type
   * @param example
   *          the example
   * @see AbstractDao#getPredicates(Root, com.raf.fwk.jpa.domain.DomainEntity)
   */
  @Override
  protected Predicate[] getPredicates(final Root<Surge> root, final Surge example) {
    final List<Predicate> predicatesList = new ArrayList<>();
    if (example.getIdent() != null) {
      predicatesList.add(getEquals(root, "ident", example.getIdent()));
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
  protected List<Order> getOrder(final CriteriaBuilder builder, final Root<Surge> root) {
    final List<Order> orders = new ArrayList<>();
    orders.add(builder.asc(root.get("ident")));
    return orders;
  }

}
