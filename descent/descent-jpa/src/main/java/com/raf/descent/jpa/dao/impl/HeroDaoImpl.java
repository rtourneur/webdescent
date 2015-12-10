package com.raf.descent.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.HeroDao;
import com.raf.descent.jpa.domain.card.Hero;
import com.raf.descent.jpa.domain.model.NameExpansionPk;

/**
 * Implementation DAO for {@link Hero}.
 * 
 * @author RAF
 */
@Repository
public final class HeroDaoImpl extends AbstractDao<Hero, NameExpansionPk> implements HeroDao {

  /**
   * Constructor.
   */
  public HeroDaoImpl() {
    super(Hero.class);
  }

  /**
   * Set the predicate for the findByExample request.
   * <ul>
   * <li>name</li>
   * <li>expansion</li>
   * <li>archetype</li>
   * </ul>
   *
   * @param criteriaQuery
   *          the predicate
   * @param example
   *          the example
   * @see AbstractDao#getPredicates(Root, Hero)
   */
  @Override
  protected Predicate[] getPredicates(final Root<Hero> root, final Hero example) {
    final List<Predicate> predicatesList = new ArrayList<Predicate>();
    if (example.getName() != null) {
      predicatesList.add(getEquals(root, IDENT, "name", example.getName()));
    }
    if (example.getExpansionName() != null) {
      predicatesList.add(getEquals(root, IDENT, "expansion", example.getExpansionName()));
    }
    if (example.getExpansion() != null) {
      predicatesList.add(getEquals(root, "expansion", example.getExpansion()));
    }
    if (example.getArchetypeName() != null) {
      predicatesList.add(getEquals(root, "archetypeName", example.getArchetypeName()));
    }
    if (example.getArchetype() != null) {
      predicatesList.add(getEquals(root, "archetype", example.getArchetype()));
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
  protected List<Order> getOrder(final CriteriaBuilder builder, final Root<Hero> root) {
    final List<Order> orders = new ArrayList<Order>();
    orders.add(builder.asc(root.get(IDENT).get("name")));
    orders.add(builder.asc(root.get(IDENT).get("expansion")));
    return orders;
  }

}
