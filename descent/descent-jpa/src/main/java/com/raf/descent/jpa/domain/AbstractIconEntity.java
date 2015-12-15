package com.raf.descent.jpa.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Abstract super class for domain entities with name and icon.
 *
 * @author RAF
 */
@MappedSuperclass
public abstract class AbstractIconEntity extends AbstractNamedEntity implements DomainIconEntity<String> {

  /** Serial UID. */
  private static final long serialVersionUID = 1L;

  /** The icon. */
  @Column(name = "ICON", nullable = false, length = 30)
  private String icon;

  /**
   * Constructor.
   */
  public AbstractIconEntity() {
    super();
  }

  /**
   * Return the icon.
   *
   * @return the icon
   * @see DomainIconEntity#getIcon()
   */
  @Override
  public String getIcon() {
    return this.icon;
  }

  /**
   * Defines the icon.
   *
   * @param icon
   *          the icon to set
   * @see DomainIconEntity#setIcon(String)
   */
  @Override
  public void setIcon(final String icon) {
    this.icon = icon;
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractEntity#append(ToStringBuilder)
   */
  @Override
  protected final void appendNamed(final ToStringBuilder builder) {
    builder.append("icon", this.icon);
    appendIcon(builder);
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   */
  protected void appendIcon(final ToStringBuilder builder) {
    // RAS
  }

}
