package com.raf.descent.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.raf.fwk.jpa.domain.AbstractNamedEntity;

import lombok.NoArgsConstructor;


/**
 * The persistent class for the MONSTER_TYPE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "MONSTER_TYPE", schema = "DESCENT")
@NoArgsConstructor
public class MonsterType extends AbstractNamedEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -7885222402948786458L;

}
