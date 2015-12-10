package com.raf.descent.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.raf.descent.jpa.dao.ItemDao;
import com.raf.descent.jpa.domain.card.Item;

/**
 * Implementation DAO for {@link Item}.
 * 
 * @author RAF
 */
@Repository
public final class ItemDaoImpl extends AbstractDao<Item, String> implements ItemDao {

  /**
   * Constructor.
   */
  public ItemDaoImpl() {
    super(Item.class);
  }

  /**
   * Set the predicate for the findByExample request.
   * <ul>
   * <li>name</li>
   * <li>expansion</li>
   * <li>item type</li>
   * <li>attack type</li>
   * <li>equipment</li>
   * <li>class</li>
   * </ul>
   *
   * @param criteriaQuery
   *          the predicate
   * @param example
   *          the example
   * @see AbstractDao#getPredicates(Root, Item)
   */
  @Override
  protected Predicate[] getPredicates(final Root<Item> root, final Item example) {
    final List<Predicate> predicatesList = new ArrayList<Predicate>();
    if (example.getName() != null) {
      predicatesList.add(getEquals(root, "name", example.getName()));
    }
    if (example.getExpansionName() != null) {
      predicatesList.add(getEquals(root, "expansionName", example.getExpansionName()));
    }
    if (example.getExpansion() != null) {
      predicatesList.add(getEquals(root, "expansion", example.getExpansion()));
    }
    if (example.getItemTypeName() != null) {
      predicatesList.add(getEquals(root, "itemTypeName", example.getItemTypeName()));
    }
    if (example.getItemType() != null) {
      predicatesList.add(getEquals(root, "itemType", example.getItemType()));
    }
    if (example.getAttackTypeName() != null) {
      predicatesList.add(getEquals(root, "attackTypeName", example.getAttackTypeName()));
    }
    if (example.getAttackType() != null) {
      predicatesList.add(getEquals(root, "attackType", example.getAttackType()));
    }
    if (example.getEquipmentName() != null) {
      predicatesList.add(getEquals(root, "equipmentName", example.getEquipmentName()));
    }
    if (example.getEquipment() != null) {
      predicatesList.add(getEquals(root, "equipment", example.getEquipment()));
    }
    if (example.getClazzName() != null) {
      predicatesList.add(getEquals(root, "clazzName", example.getClazzName()));
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
  protected List<Order> getOrder(final CriteriaBuilder builder, final Root<Item> root) {
    final List<Order> orders = new ArrayList<Order>();
    orders.add(builder.asc(root.get("name")));
    return orders;
  }

}
