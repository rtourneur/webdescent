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
import com.raf.fwk.jpa.dao.AbstractDao;

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
   * @param root
   *          the root type
   * @param example
   *          the example
   * @see AbstractDao#getPredicates(Root, Item)
   */
  @Override
  protected Predicate[] getPredicates(final Root<Item> root, final Item example) {
    final List<Predicate> predicatesList = new ArrayList<>();
    if (example.getName() != null) {
      predicatesList.add(getEquals(root, "name", example.getName()));
    }
    addExpansionFilter(root, example, predicatesList);
    addItemTypeFilter(root, example, predicatesList);
    addAttackTypeFilter(root, example, predicatesList);
    addEquipmentFilter(root, example, predicatesList);
    addClazzFilter(root, example, predicatesList);
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
  private void addExpansionFilter(final Root<Item> root, final Item example, final List<Predicate> predicatesList) {
    if (example.getExpansionName() != null) {
      predicatesList.add(getEquals(root, "expansionName", example.getExpansionName()));
    }
    if (example.getExpansion() != null) {
      predicatesList.add(getEquals(root, "expansion", example.getExpansion()));
    }
  }

  /**
   * Add item type filter.
   * 
   * @param root
   *          the root type
   * @param example
   *          the example
   * @param predicatesList
   *          the predicate list
   */
  private void addItemTypeFilter(final Root<Item> root, final Item example, final List<Predicate> predicatesList) {
    if (example.getItemTypeName() != null) {
      predicatesList.add(getEquals(root, "itemTypeName", example.getItemTypeName()));
    }
    if (example.getItemType() != null) {
      predicatesList.add(getEquals(root, "itemType", example.getItemType()));
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
  private void addAttackTypeFilter(final Root<Item> root, final Item example, final List<Predicate> predicatesList) {
    if (example.getAttackTypeName() != null) {
      predicatesList.add(getEquals(root, "attackTypeName", example.getAttackTypeName()));
    }
    if (example.getAttackType() != null) {
      predicatesList.add(getEquals(root, "attackType", example.getAttackType()));
    }
  }

  /**
   * Add equipment filter.
   * 
   * @param root
   *          the root type
   * @param example
   *          the example
   * @param predicatesList
   *          the predicate list
   */
  private void addEquipmentFilter(final Root<Item> root, final Item example, final List<Predicate> predicatesList) {
    if (example.getEquipmentName() != null) {
      predicatesList.add(getEquals(root, "equipmentName", example.getEquipmentName()));
    }
    if (example.getEquipment() != null) {
      predicatesList.add(getEquals(root, "equipment", example.getEquipment()));
    }
  }

  /**
   * Add clazz filter.
   * 
   * @param root
   *          the root type
   * @param example
   *          the example
   * @param predicatesList
   *          the predicate list
   */
  private void addClazzFilter(final Root<Item> root, final Item example, final List<Predicate> predicatesList) {
    if (example.getClassName() != null) {
      predicatesList.add(getEquals(root, "className", example.getClassName()));
    }
    if (example.getClazz() != null) {
      predicatesList.add(getEquals(root, "clazz", example.getClazz()));
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
  protected List<Order> getOrder(final CriteriaBuilder builder, final Root<Item> root) {
    final List<Order> orders = new ArrayList<>();
    orders.add(builder.asc(root.get("name")));
    return orders;
  }

}
