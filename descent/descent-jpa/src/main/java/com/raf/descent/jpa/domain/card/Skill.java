package com.raf.descent.jpa.domain.card;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.raf.descent.jpa.domain.AbstractEntity;
import com.raf.descent.jpa.domain.DomainNamedEntity;
import com.raf.descent.jpa.domain.model.Clazz;

/**
 * The persistent class for the SKILL database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "SKILL", schema = "DESCENT")
public class Skill extends AbstractEntity implements DomainNamedEntity<SkillPk> {

  /** Serial UID. */
  private static final long serialVersionUID = -5703651183951258200L;

  /** The identifier. */
  @EmbeddedId
  private SkillPk ident;

  /** The message code. */
  @Column(name = "MESSAGE_CODE", nullable = false, length = 40)
  private String messageCode;

  /** The experience cost. */
  @Column(nullable = false, precision = 1)
  private Integer experience;

  /** The rule code. */
  @Column(name = "RULE_CODE", nullable = false, length = 40)
  private String ruleCode;

  /** The stamina cost. */
  @Column(nullable = false, length = 1)
  private String cost;

  /** The class. */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "CLASS", nullable = false, insertable = false, updatable = false)
  private Clazz clazz;

  /**
   * Constructor.
   */
  public Skill() {
    super();
  }

  /**
   * Returns the serializable ID of domain entity.
   *
   * @return the ID
   * @see DomainNamedEntity#getId()
   */
  @Override
  public SkillPk getId() {
    return getIdent();
  }

  /**
   * Returns the identifier.
   * 
   * @return the ident
   */
  public SkillPk getIdent() {
    return this.ident;
  }

  /**
   * Defines the identifier.
   * 
   * @param ident
   *          the ident to set
   * @see DomainNamedEntity#setIdent(SkillPk)
   */
  @Override
  public void setIdent(final SkillPk ident) {
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
      this.ident = new SkillPk();
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
      this.ident = new SkillPk();
    }
    this.ident.setName(name);
  }

  /**
   * Returns the class name.
   *
   * @return the clazzName
   */
  public String getClazzName() {
    if (this.ident == null) {
      this.ident = new SkillPk();
    }
    return this.ident.getClazz();
  }

  /**
   * Defines the name.
   *
   * @param clazzName
   *          the clazzName to set
   */
  public void setClazzName(final String clazzName) {
    if (this.ident == null) {
      this.ident = new SkillPk();
    }
    this.ident.setClazz(clazzName);
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
   *          the messageCode to set
   * @see DomainNamedEntity#setMessageCode(String)
   */
  @Override
  public void setMessageCode(final String messageCode) {
    this.messageCode = messageCode;
  }

  /**
   * Returns the experience.
   * 
   * @return the experience
   */
  public Integer getExperience() {
    return this.experience;
  }

  /**
   * Defines the experience.
   * 
   * @param experience
   *          the experience to set
   */
  public void setExperience(final Integer experience) {
    this.experience = experience;
  }

  /**
   * Returns the rule code.
   * 
   * @return the ruleCode
   */
  public String getRuleCode() {
    return this.ruleCode;
  }

  /**
   * Defines the rule code.
   * 
   * @param ruleCode
   *          the ruleCode to set
   */
  public void setRuleCode(final String ruleCode) {
    this.ruleCode = ruleCode;
  }

  /**
   * Returns the cost.
   * 
   * @return the cost
   */
  public String getCost() {
    return this.cost;
  }

  /**
   * Defines the cost.
   * 
   * @param cost
   *          the cost to set
   */
  public void setCost(final String cost) {
    this.cost = cost;
  }

  /**
   * Returns the class.
   * 
   * @return the clazz
   */
  public Clazz getClazz() {
    return this.clazz;
  }

  /**
   * Defines the class.
   * 
   * @param clazz
   *          the clazz to set
   */
  public void setClazz(final Clazz clazz) {
    this.clazz = clazz;
  }

  /**
   * Append the properties for the to string builder.
   * 
   * @param builder
   *          the builder
   * @see AbstractEntity#append(ToStringBuilder)
   */
  @Override
  protected void append(final ToStringBuilder builder) {
    builder.append("name", getName()).append("clazzName", getClazzName()).append("messageCode", this.messageCode)
        .append("experience", this.experience).append("ruleCode", this.ruleCode).append("cost", this.cost);
    if (this.clazz != null && Clazz.class.equals(this.clazz.getClass())) {
      builder.append("clazz", this.clazz);
    }
  }
}
