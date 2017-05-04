package com.raf.descent.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.raf.fwk.jpa.domain.AbstractNamedEntity;

import lombok.NoArgsConstructor;


/**
 * The persistent class for the MONSTER_SIZE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "MONSTER_SIZE", schema = "DESCENT")
@NoArgsConstructor
public class MonsterSize extends AbstractNamedEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -7552965610430813095L;

}
