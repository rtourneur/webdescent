package com.raf.descent.jpa.domain.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.fwk.jpa.domain.AbstractEntity;
import com.raf.fwk.jpa.domain.DomainNamedEntity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Abstract super class for domain named entities.
 *
 * @author RAF
 */
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class AbstractExpansionEntity extends AbstractEntity implements DomainNamedEntity<NameExpansionPk> {

  /** Serial UID. */
  private static final long serialVersionUID = 1L;

  /** The identifier. */
  @EmbeddedId
  private NameExpansionPk ident;

  /** The message code. */
  @Column(name = "MESSAGE_CODE", nullable = false, length = 30)
  private String messageCode;

  /** The expansion. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "EXPANSION", nullable = false, insertable = false, updatable = false)
  private Expansion expansion;

  /**
   * Returns the serializable ID of domain entity.
   *
   * @return the ID
   * @see DomainNamedEntity#getId()
   */
  @Override
  public NameExpansionPk getIdentifier() {
    return this.ident;
  }

  /**
   * Defines the identifier.
   * 
   * @param identifier
   *          the ident to set
   * @see DomainNamedEntity#setIdent(NameExpansionPk)
   */
  @Override
  public void setIdentifier(final NameExpansionPk identifier) {
    this.ident = identifier;
  }

  /**
   * Returns the name.
   *
   * @return the name
   * @see DomainNamedEntity#getName()
   */
  @Override
  public String getName() {
    if (this.ident == null) {
      this.ident = new NameExpansionPk();
    }
    return this.ident.getName();
  }

  /**
   * Defines the name.
   *
   * @param name
   *          the name to set
   * @see DomainNamedEntity#setName(String)
   */
  @Override
  public void setName(final String name) {
    if (this.ident == null) {
      this.ident = new NameExpansionPk();
    }
    this.ident.setName(name);
  }

  /**
   * Returns the expansion name.
   *
   * @return the expansion name
   */
  public String getExpansionName() {
    if (this.ident == null) {
      this.ident = new NameExpansionPk();
    }
    return this.ident.getExpansion();
  }

  /**
   * Defines the expansion name.
   *
   * @param expansionName
   *          the expansionName to set
   */
  public void setExpansionName(final String expansionName) {
    if (this.ident == null) {
      this.ident = new NameExpansionPk();
    }
    this.ident.setExpansion(expansionName);
  }

  /**
   * Defines the expansion.
   * 
   * @param expansion
   *          the expansion to set
   */
  public void setExpansion(final Expansion expansion) {
    this.expansion = expansion;
    if (this.expansion != null) {
      setExpansionName(this.expansion.getName());
    }
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractEntity#append(ToStringBuilder)
   */
  @Override
  protected final void append(final ToStringBuilder builder) {
    builder.append("name", getName()).append("expansionName", getExpansionName()).append("messageCode",
        this.messageCode);
    appendExpansion(builder);
    if (this.expansion != null && Expansion.class.equals(this.expansion.getClass())) {
      builder.append("expansion", this.expansion);
    }
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   */
  protected abstract void appendExpansion(ToStringBuilder builder);
}
