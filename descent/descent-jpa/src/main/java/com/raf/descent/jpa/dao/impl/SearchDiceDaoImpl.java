package com.raf.descent.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.SearchDiceDao;
import com.raf.descent.jpa.domain.card.SearchDice;
import com.raf.descent.jpa.domain.card.SearchDicePk;

/**
 * Implementation DAO for {@link SearchDice}.
 * 
 * @author RAF
 */
@Repository
public final class SearchDiceDaoImpl extends AbstractDao<SearchDice, SearchDicePk> implements SearchDiceDao {

  /**
   * Constructor.
   */
  public SearchDiceDaoImpl() {
    super(SearchDice.class);
  }

  /**
   * Set the predicate for the findByExample request.
   * <ul>
   * <li>search</li>
   * <li>dice</li>
   * </ul>
   *
   * @param root
   *          the root type
   * @param example
   *          the example
   * @see AbstractDao#getPredicates(Root, SearchDice)
   */
  @Override
  protected Predicate[] getPredicates(final Root<SearchDice> root, final SearchDice example) {
    final List<Predicate> predicatesList = new ArrayList<Predicate>();
    if (example.getSearch() != null) {
      predicatesList.add(getEquals(root, "search", example.getSearch()));
    }
    if (example.getSearchName() != null && example.getExpansionName() != null) {
      predicatesList.add(getEquals(root, IDENT, "search", example.getSearchName()));
      predicatesList.add(getEquals(root, IDENT, "expansion", example.getExpansionName()));
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
  protected List<Order> getOrder(final CriteriaBuilder builder, final Root<SearchDice> root) {
    final List<Order> orders = new ArrayList<Order>();
    orders.add(builder.asc(root.get(IDENT).get("search")));
    orders.add(builder.asc(root.get(IDENT).get("expansion")));
    orders.add(builder.asc(root.get(IDENT).get("index")));
    return orders;
  }

}
