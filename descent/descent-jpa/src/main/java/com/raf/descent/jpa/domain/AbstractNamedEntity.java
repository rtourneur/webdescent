package com.raf.descent.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Abstract super class for domain named entities.
 *
 * @author RAF
 */
@MappedSuperclass
public abstract class AbstractNamedEntity extends AbstractEntity implements DomainNamedEntity<String> {

  /** Serial UID. */
  private static final long serialVersionUID = 1L;

  /** The name. */
  @Id
  @Column(name = "NAME", unique = true, nullable = false, length = 30)
  private String name;

  /** The message code. */
  @Column(name = "MESSAGE_CODE", nullable = false, length = 30)
  private String messageCode;

  /**
   * Constructor.
   */
  public AbstractNamedEntity() {
    super();
  }

  /**
   * Returns the serializable ID of domain entity.
   *
   * @return the ID
   * @see DomainNamedEntity#getId()
   */
  @Override
  public final String getId() {
    return getName();
  }

  /**
   * Define the identifier.
   *
   * @param ident
   *          the identifier to set
   * @see DomainNamedEntity#setIdent(java.io.Serializable)
   */
  @Override
  public final void setIdent(final String ident) {
    setName(ident);
  }

  /**
   * Returns the name.
   *
   * @return the name
   * @see DomainNamedEntity#getName()
   */
  @Override
  public String getName() {
    return this.name;
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
    this.name = name;
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
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractEntity#append(ToStringBuilder)
   */
  @Override
  protected final void append(final ToStringBuilder builder) {
    builder.append("name", this.name).append("messageCode", this.messageCode);
    appendNamed(builder);
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   */
  protected void appendNamed(final ToStringBuilder builder){
    // RAS
  }

}
