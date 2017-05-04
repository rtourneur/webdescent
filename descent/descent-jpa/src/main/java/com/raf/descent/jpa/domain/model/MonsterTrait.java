package com.raf.descent.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.raf.fwk.jpa.domain.AbstractIconEntity;

import lombok.NoArgsConstructor;

/**
 * The persistent class for the MONSTER_TRAIT database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "MONSTER_TRAIT", schema = "DESCENT")
@NoArgsConstructor
public class MonsterTrait extends AbstractIconEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -6191374173410355816L;

}
