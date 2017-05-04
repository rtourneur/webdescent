package com.raf.descent.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.SearchDao;
import com.raf.descent.jpa.domain.card.Search;
import com.raf.descent.jpa.domain.model.NameExpansionPk;
import com.raf.fwk.jpa.dao.AbstractDao;

/**
 * Implementation DAO for {@link Search}.
 * 
 * @author RAF
 */
@Repository
public final class SearchDaoImpl extends AbstractDao<Search, NameExpansionPk> implements SearchDao {

  /**
   * Constructor.
   */
  public SearchDaoImpl() {
    super(Search.class);
  }

  /**
   * Set the predicate for the findByExample request.
   * <ul>
   * <li>name</li>
   * <li>expansion</li>
   * <li>attack type</li>
   * </ul>
   *
   * @param root
   *          the root type
   * @param example
   *          the example
   * @see AbstractDao#getPredicates(Root, Search)
   */
  @Override
  protected Predicate[] getPredicates(final Root<Search> root, final Search example) {
    final List<Predicate> predicatesList = new ArrayList<>();
    if (example.getName() != null) {
      predicatesList.add(getEquals(root, IDENT, "name", example.getName()));
    }
    addExpansionFilter(root, example, predicatesList);
    addAttackTypeFilter(root, example, predicatesList);
    return predicatesList.toArray(new Predicate[predicatesList.size()]);
  }

  /**
   * Add expansion filter.
   * 
   * @param root
   *          the root type
   * @param example
   *          the example
   * @param predicatesList
   *          the predicate list
   */
  private void addExpansionFilter(final Root<Search> root, final Search example, final List<Predicate> predicatesList) {
    if (example.getExpansionName() != null) {
      predicatesList.add(getEquals(root, IDENT, "expansion", example.getExpansionName()));
    }
    if (example.getExpansion() != null) {
      predicatesList.add(getEquals(root, "expansion", example.getExpansion()));
    }
  }

  /**
   * Add attack type filter.
   * 
   * @param root
   *          the root type
   * @param example
   *          the example
   * @param predicatesList
   *          the predicate list
   */
  private void addAttackTypeFilter(final Root<Search> root, final Search example,
      final List<Predicate> predicatesList) {
    if (example.getAttackTypeName() != null) {
      predicatesList.add(getEquals(root, "attackTypeName", example.getAttackTypeName()));
    }
    if (example.getAttackType() != null) {
      predicatesList.add(getEquals(root, "attackType", example.getAttackType()));
    }
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
  protected List<Order> getOrder(final CriteriaBuilder builder, final Root<Search> root) {
    final List<Order> orders = new ArrayList<>();
    orders.add(builder.asc(root.get(IDENT).get("name")));
    orders.add(builder.asc(root.get(IDENT).get("expansion")));
    return orders;
  }

}
