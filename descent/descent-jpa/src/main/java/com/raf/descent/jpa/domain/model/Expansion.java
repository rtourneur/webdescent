package com.raf.descent.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.raf.fwk.jpa.domain.AbstractIconEntity;

import lombok.NoArgsConstructor;

/**
 * The persistent class for the EXPANSION database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "EXPANSION", schema = "DESCENT")
@NoArgsConstructor
public class Expansion extends AbstractIconEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -7278035123105018833L;

}
