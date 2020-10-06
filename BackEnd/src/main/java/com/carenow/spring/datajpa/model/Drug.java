package com.carenow.spring.datajpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "drugTable")

public class Drug {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int drugId;
	private String drugName;
	private String drugQuantity;
	private String drugExpDate;
	
	public int getDrugId() {
		return drugId;
	}
	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getDrugQuantity() {
		return drugQuantity;
	}
	public void setDrugQuantity(String drugQuantity) {
		this.drugQuantity = drugQuantity;
	}
	public String getDrugExpDate() {
		return drugExpDate;
	}
	public void setDrugExpDate(String drugExpDate) {
		this.drugExpDate = drugExpDate;
	}
	
	

}

