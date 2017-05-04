package com.raf.descent.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.raf.fwk.jpa.domain.AbstractIconEntity;

import lombok.NoArgsConstructor;


/**
 * The persistent class for the ATTACK_TYPE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "ATTACK_TYPE", schema = "DESCENT")
@NoArgsConstructor
public class AttackType extends AbstractIconEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -8308862486797498564L;

}
