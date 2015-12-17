package com.raf.descent.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.MonsterDefenseDao;
import com.raf.descent.jpa.domain.card.MonsterDefense;
import com.raf.descent.jpa.domain.card.MonsterStatDicePk;

/**
 * Implementation DAO for {@link MonsterDefense}.
 * 
 * @author RAF
 */
@Repository
public final class MonsterDefenseDaoImpl extends AbstractDao<MonsterDefense, MonsterStatDicePk> implements
    MonsterDefenseDao {

  /**
   * Constructor.
   */
  public MonsterDefenseDaoImpl() {
    super(MonsterDefense.class);
  }

  /**
   * Set the predicate for the findByExample request.
   * <ul>
   * <li>ident</li>
   * <li>monster stat</li>
   * </ul>
   *
   * @param root
   *          the root type
   * @param example
   *          the example
   * @see AbstractDao#getPredicates(Root, MonsterDefense)
   */
  @Override
  protected Predicate[] getPredicates(final Root<MonsterDefense> root, final MonsterDefense example) {
    final List<Predicate> predicatesList = new ArrayList<Predicate>();
    if (example.getIdent() != null) {
      predicatesList.add(getEquals(root, IDENT, example.getIdent()));
    }
    addMonsterStatFilter(root, example, predicatesList);
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
  private void addMonsterStatFilter(final Root<MonsterDefense> root, final MonsterDefense example,
      final List<Predicate> predicatesList) {
    if (example.getIdent() != null && example.getIdent().getMonsterStatPk() != null) {
      predicatesList.add(getEquals(root, IDENT, "monsterStatPk", example.getIdent().getMonsterStatPk()));
    }
    if (example.getMonsterStat() != null) {
      predicatesList.add(getEquals(root, "monsterStat", example.getMonsterStat()));
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
  protected List<Order> getOrder(final CriteriaBuilder builder, final Root<MonsterDefense> root) {
    final List<Order> orders = new ArrayList<Order>();
    orders.add(builder.asc(root.get(IDENT).get("monsterStatPk")));
    orders.add(builder.asc(root.get(IDENT).get("index")));
    return orders;
  }

}
