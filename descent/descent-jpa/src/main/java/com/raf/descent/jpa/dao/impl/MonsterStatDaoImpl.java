package com.raf.descent.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.MonsterStatDao;
import com.raf.descent.jpa.domain.card.MonsterStat;
import com.raf.descent.jpa.domain.card.MonsterStatPk;

/**
 * Implementation DAO for {@link MonsterStat}.
 * 
 * @author RAF
 */
@Repository
public final class MonsterStatDaoImpl extends AbstractDao<MonsterStat, MonsterStatPk> implements MonsterStatDao {

  /**
   * Constructor.
   */
  public MonsterStatDaoImpl() {
    super(MonsterStat.class);
  }

  /**
   * Returns the monster stat.
   * 
   * @param monster
   *          the monster
   * @param expansion
   *          the expansion
   * @param act
   *          the act
   * @param type
   *          the type
   * @return the monster stat
   * @see MonsterStatDao#getMonsterStat(String, String, String, String)
   */
  @Override
  public MonsterStat getMonsterStat(final String monster, final String expansion, final String act, final String type) {
    final MonsterStatPk ident = new MonsterStatPk();
    ident.setName(monster);
    ident.setExpansionName(expansion);
    ident.setActName(act);
    ident.setMonsterType(type);
    return getById(ident);
  }

  /**
   * Set the predicate for the findByExample request.
   * <ul>
   * <li>ident</li>
   * <li>monster group act</li>
   * </ul>
   *
   * @param root
   *          the root type
   * @param example
   *          the example
   * @see AbstractDao#getPredicates(Root, MonsterStat)
   */
  @Override
  protected Predicate[] getPredicates(final Root<MonsterStat> root, final MonsterStat example) {
    final List<Predicate> predicatesList = new ArrayList<Predicate>();
    if (example.getIdent() != null) {
      predicatesList.add(getEquals(root, IDENT, example.getIdent()));
    }
    addMonsterGroupActFilter(root, example, predicatesList);
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
  private void addMonsterGroupActFilter(final Root<MonsterStat> root, final MonsterStat example,
      final List<Predicate> predicatesList) {
    if (example.getIdent() != null && example.getIdent().getMonsterGroupActPk() != null) {
      predicatesList.add(getEquals(root, IDENT, "monsterGroupActPk", example.getIdent().getMonsterGroupActPk()));
    }
    if (example.getMonsterGroupAct() != null) {
      predicatesList.add(getEquals(root, "monsterGroupAct", example.getMonsterGroupAct()));
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
  protected List<Order> getOrder(final CriteriaBuilder builder, final Root<MonsterStat> root) {
    final List<Order> orders = new ArrayList<Order>();
    orders.add(builder.asc(root.get(IDENT).get("monsterGroupActPk")));
    orders.add(builder.asc(root.get(IDENT).get("monsterType")));
    return orders;
  }

}
