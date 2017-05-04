package com.raf.descent.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.SkillDao;
import com.raf.descent.jpa.domain.card.Skill;
import com.raf.fwk.jpa.dao.AbstractDao;

/**
 * Implementation DAO for {@link Skill}.
 * 
 * @author RAF
 */
@Repository
public final class SkillDaoImpl extends AbstractDao<Skill, String> implements SkillDao {

  /**
   * Constructor.
   */
  public SkillDaoImpl() {
    super(Skill.class);
  }

  /**
   * Set the predicate for the findByExample request.
   * <ul>
   * <li>name</li>
   * <li>dice type</li>
   * </ul>
   *
   * @param root
   *          the root type
   * @param example
   *          the example
   * @see AbstractDao#getPredicates(Root, Skill)
   */
  @Override
  protected Predicate[] getPredicates(final Root<Skill> root, final Skill example) {
    final List<Predicate> predicatesList = new ArrayList<>();
    if (example.getName() != null) {
      predicatesList.add(getEquals(root, NAME, example.getName()));
    }
    if (example.getClassName() != null) {
      predicatesList.add(getEquals(root, "className", example.getClassName()));
    }
    if (example.getClazz() != null) {
      predicatesList.add(getEquals(root, "clazz", example.getClazz()));
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
  protected List<Order> getOrder(final CriteriaBuilder builder, final Root<Skill> root) {
    final List<Order> orders = new ArrayList<>();
    orders.add(builder.asc(root.get(NAME)));
    return orders;
  }

}
