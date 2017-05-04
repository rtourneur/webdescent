package com.raf.descent.jpa.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.raf.fwk.jpa.domain.AbstractNamedEntity;

import lombok.NoArgsConstructor;

/**
 * The persistent class for the DICE_TYPE database table.
 * 
 * @author RAF
 */
@Entity
@Table(name = "DICE_TYPE", schema = "DESCENT")
@NoArgsConstructor
public class DiceType extends AbstractNamedEntity {

  /** Serial UID. */
  private static final long serialVersionUID = -6908004875964809128L;

}
