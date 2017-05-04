package com.raf.descent.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.raf.fwk.jpa.domain.AbstractIconEntity;

import lombok.NoArgsConstructor;

/**
 * The persistent class for the ARCHETYPE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "ARCHETYPE", schema = "DESCENT")
@NoArgsConstructor
public class Archetype extends AbstractIconEntity {

  /** Serial UID. */
  private static final long serialVersionUID = 912599585494891023L;

}
