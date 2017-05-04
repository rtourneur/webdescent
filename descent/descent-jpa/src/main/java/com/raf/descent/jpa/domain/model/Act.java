package com.raf.descent.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.raf.fwk.jpa.domain.AbstractNamedEntity;

import lombok.NoArgsConstructor;

/**
 * The persistent class for the ACT database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "ACT", schema = "DESCENT")
@NoArgsConstructor
public class Act extends AbstractNamedEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -5970642087364403593L;

}
