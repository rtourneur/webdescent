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
import com.raf.fwk.jpa.dao.AbstractDao;
import com.raf.fwk.jpa.dao.AbstractIdDao;

/**
 * Implementation DAO for {@link MonsterStat}.
 * 
 * @author RAF
 */
@Repository
public final class MonsterStatDaoImpl extends AbstractIdDao<MonsterStat> implements MonsterStatDao {

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
    final MonsterStat example = new MonsterStat();
    example.setName(monster);
    example.setExpansionName(expansion);
    example.setActName(act);
    example.setMonsterTypeName(type);
    return getByExample(example);
  }

  /**
   * Set the predicate for the getByExample request.
   * <ul>
   * <li>monster name</li>
   * <li>expansion</li>
   * <li>act</li>
   * <li>type</li>
   * </ul>
   *
   * @param root
   *          the root type
   * @param example
   *          the example
   * @return an array of predicates
   * @see AbstractIdDao#getUniquePredicates(Root, MonsterStat)
   */
  @Override
  protected Predicate[] getUniquePredicates(final Root<MonsterStat> root, final MonsterStat example) {
    final List<Predicate> predicatesList = new ArrayList<>();
    predicatesList.add(getEquals(root, NAME, example.getName()));
    predicatesList.add(getEquals(root, "expansionName", example.getExpansionName()));
    predicatesList.add(getEquals(root, "actName", example.getActName()));
    predicatesList.add(getEquals(root, "monsterTypeName", example.getMonsterTypeName()));
    return predicatesList.toArray(new Predicate[predicatesList.size()]);

  }

  /**
   * Set the predicate for the findByExample request.
   * <ul>
   * <li>ident</li>
   * <li>monster name</li>
   * <li>expansion</li>
   * <li>act</li>
   * <li>monsterType</li>
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
    final List<Predicate> predicatesList = new ArrayList<>();
    if (example.getIdent() != null) {
      predicatesList.add(getEquals(root, IDENT, example.getIdent()));
    }
    if (example.getName() != null) {
      predicatesList.add(getLike(root, NAME, example.getName()));
    }
    if (example.getExpansionName() != null) {
      predicatesList.add(getEquals(root, "expansionName", example.getExpansionName()));
    }
    if (example.getExpansion() != null) {
      predicatesList.add(getEquals(root, "expansion", example.getExpansion()));
    }
    if (example.getAct() != null) {
      predicatesList.add(getEquals(root, "act", example.getAct()));
    }
    if (example.getMonsterType() != null) {
      predicatesList.add(getEquals(root, "monsterType", example.getMonsterType()));
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
  protected List<Order> getOrder(final CriteriaBuilder builder, final Root<MonsterStat> root) {
    final List<Order> orders = new ArrayList<>();
    orders.add(builder.asc(root.get(IDENT)));
    return orders;
  }

}
