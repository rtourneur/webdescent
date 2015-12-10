package com.raf.descent.jpa.domain;

import java.io.Serializable;

/**
 * Interface for Domain entities.
 *
 * @param <I>
 *          the serializable ID.
 * @author RAF
 */
public interface DomainIconEntity<I extends Serializable> extends DomainNamedEntity<I> {

  /**
   * Return the icon.
   *
   * @return the icon
   */
  String getIcon();

  /**
   * Define the icon.
   *
   * @param icon
   *          the icon to set
   */
  void setIcon(String icon);
}
