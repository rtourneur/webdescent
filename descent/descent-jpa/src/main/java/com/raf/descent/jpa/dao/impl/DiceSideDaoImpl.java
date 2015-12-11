package com.raf.descent.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.DiceSideDao;
import com.raf.descent.jpa.domain.model.DiceSide;
import com.raf.descent.jpa.domain.model.DiceSidePk;

/**
 * Implementation DAO for {@link DiceSide}.
 * 
 * @author RAF
 */
@Repository
public final class DiceSideDaoImpl extends AbstractDao<DiceSide, DiceSidePk> implements DiceSideDao {

  /**
   * Constructor.
   */
  public DiceSideDaoImpl() {
    super(DiceSide.class);
  }

  /**
   * Set the predicate for the findByExample request.
   * <ul>
   * <li>dice</li>
   * <li>side</li>
   * </ul>
   *
   * @param root
   *          the root type
   * @param example
   *          the example
   * @see AbstractDao#getPredicates(Root, DiceSide)
   */
  @Override
  protected Predicate[] getPredicates(final Root<DiceSide> root, final DiceSide example) {
    final List<Predicate> predicatesList = new ArrayList<Predicate>();
    if (example.getDice() != null) {
      predicatesList.add(getEquals(root, "dice", example.getDice()));
    }
    if (example.getDiceName() != null) {
      predicatesList.add(getEquals(root, IDENT,  "dice", example.getDiceName()));
    }
    if (example.getSide() != null) {
      predicatesList.add(getEquals(root, IDENT,  "side", example.getSide()));
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
  protected List<Order> getOrder(final CriteriaBuilder builder, final Root<DiceSide> root) {
    final List<Order> orders = new ArrayList<Order>();
    orders.add(builder.asc(root.get(IDENT).get("dice")));
    orders.add(builder.asc(root.get(IDENT).get("side")));
    return orders;
  }

}
