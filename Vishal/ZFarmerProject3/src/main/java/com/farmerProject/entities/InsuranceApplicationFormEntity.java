package com.farmerProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "InsuranceApplicationDetails")
public class InsuranceApplicationFormEntity {
	
	@Id
	@GeneratedValue
	private long insuranceID;
	private String season;
	private String year;
	private String Crop;
	private String sumInsured;
	private String area;
	
}


