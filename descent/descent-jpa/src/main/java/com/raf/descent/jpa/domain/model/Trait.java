package com.raf.descent.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.raf.fwk.jpa.domain.AbstractNamedEntity;

import lombok.NoArgsConstructor;


/**
 * The persistent class for the TRAIT database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "TRAIT", schema = "DESCENT")
@NoArgsConstructor
public class Trait extends AbstractNamedEntity {

  /** Serial UID. */
  private static final long serialVersionUID = 6989805637120232263L;

}
