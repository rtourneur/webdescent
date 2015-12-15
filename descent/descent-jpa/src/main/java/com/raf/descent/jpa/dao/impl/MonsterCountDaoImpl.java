package com.raf.descent.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.MonsterCountDao;
import com.raf.descent.jpa.domain.card.MonsterCount;
import com.raf.descent.jpa.domain.card.MonsterCountPk;

/**
 * Implementation DAO for {@link MonsterCount}.
 * 
 * @author RAF
 */
@Repository
public final class MonsterCountDaoImpl extends AbstractDao<MonsterCount, MonsterCountPk> implements
    MonsterCountDao {

  /**
   * Constructor.
   */
  public MonsterCountDaoImpl() {
    super(MonsterCount.class);
  }

  /**
   * Set the predicate for the findByExample request.
   * <ul>
   * <li>ident</li>
   * <li>monster group</li>
   * </ul>
   *
   * @param root
   *          the root type
   * @param example
   *          the example
   * @see AbstractDao#getPredicates(Root, MonsterCount)
   */
  @Override
  protected Predicate[] getPredicates(final Root<MonsterCount> root, final MonsterCount example) {
    final List<Predicate> predicatesList = new ArrayList<Predicate>();
    if (example.getIdent() != null) {
      predicatesList.add(getEquals(root, IDENT, example.getIdent()));
    }
    addMonsterGroupFilter(root, example, predicatesList);
    return predicatesList.toArray(new Predicate[predicatesList.size()]);
  }

  /**
   * Add monster group filter.
   * 
   * @param root
   *          the root type
   * @param example
   *          the example
   * @param predicatesList
   *          the predicate list
   */
  private void addMonsterGroupFilter(final Root<MonsterCount> root, final MonsterCount example,
      final List<Predicate> predicatesList) {
    if (example.getIdent() != null && example.getIdent().getNameExpansionPk() != null) {
      predicatesList.add(getEquals(root, IDENT, "nameExpansionPk", example.getIdent().getNameExpansionPk()));
    }
    if (example.getMonsterGroup() != null) {
      predicatesList.add(getEquals(root, "monsterGroup", example.getMonsterGroup()));
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
  protected List<Order> getOrder(final CriteriaBuilder builder, final Root<MonsterCount> root) {
    final List<Order> orders = new ArrayList<Order>();
    orders.add(builder.asc(root.get(IDENT).get("nameExpansionPk")));
    orders.add(builder.asc(root.get(IDENT).get("heros")));
    return orders;
  }

}
