package com.raf.descent.jpa.domain.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.AbstractEntity;
import com.raf.descent.jpa.domain.DomainNamedEntity;

/**
 * Abstract super class for domain named entities.
 *
 * @author RAF
 */
@MappedSuperclass
public abstract class AbstractExpansionEntity extends AbstractEntity implements DomainNamedEntity<NameExpansionPk> {

  /** Serial UID. */
  private static final long serialVersionUID = 1L;

  /** The identifier. */
  @EmbeddedId
  private NameExpansionPk ident;

  /** The message code. */
  @Column(name = "MESSAGE_CODE", nullable = false, length = 30)
  private String messageCode;

  /** The image. */
  @Column(nullable = false, length = 30)
  private String image;

  /** The expansion. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "EXPANSION", nullable = false, insertable = false, updatable = false)
  private Expansion expansion;

  /**
   * Constructor.
   */
  public AbstractExpansionEntity() {
    super();
  }

  /**
   * Returns the serializable ID of domain entity.
   *
   * @return the ID
   * @see DomainNamedEntity#getId()
   */
  @Override
  public NameExpansionPk getId() {
    return getIdent();
  }

  /**
   * Returns the identifier.
   * 
   * @return the ident
   */
  public NameExpansionPk getIdent() {
    return this.ident;
  }

  /**
   * Defines the identifier.
   * 
   * @param ident
   *          the ident to set
   * @see DomainNamedEntity#setIdent(NameExpansionPk)
   */
  @Override
  public void setIdent(final NameExpansionPk ident) {
    this.ident = ident;
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
   * Returns the message code.
   * 
   * @return the message code
   * @see DomainNamedEntity#getMessageCode()
   */
  @Override
  public String getMessageCode() {
    return this.messageCode;
  }

  /**
   * Defines the message code.
   * 
   * @param messageCode
   *          the message code
   * @see DomainNamedEntity#setMessageCode(String)
   */
  @Override
  public void setMessageCode(final String messageCode) {
    this.messageCode = messageCode;
  }

  /**
   * Returns the image.
   * 
   * @return the image
   */
  public String getImage() {
    return this.image;
  }

  /**
   * Defines the image.
   * 
   * @param image
   *          the image to set
   */
  public void setImage(final String image) {
    this.image = image;
  }

  /**
   * Returns the expansion.
   * 
   * @return the expansion
   */
  public Expansion getExpansion() {
    return this.expansion;
  }

  /**
   * Defines the expansion.
   * 
   * @param expansion
   *          the expansion to set
   */
  public void setExpansion(final Expansion expansion) {
    this.expansion = expansion;
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
    builder.append("name", getName()).append("expansionName", getExpansionName())
        .append("messageCode", this.messageCode);
    appendExpansion(builder);
    if (this.expansion != null && Expansion.class.equals(this.expansion.getClass())) {
      builder.append("expansion", this.expansion);
    }
    builder.append("image", this.image);
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   */
  protected abstract void appendExpansion(ToStringBuilder builder);
}
