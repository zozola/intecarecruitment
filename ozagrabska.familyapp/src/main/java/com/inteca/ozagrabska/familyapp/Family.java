package com.inteca.ozagrabska.familyapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "Family")
public class Family {

	@Column(name = "familyName", length = 32)
	private String familyName;

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "nrOfAdults")
	private Integer nrOfAdults;

	@Column(name = "nrOfChildren")
	private Integer nrOfChildren;

	@Column(name = "nrOfInfants")
	private Integer nrOfInfants;

}
