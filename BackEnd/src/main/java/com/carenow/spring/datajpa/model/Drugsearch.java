package com.carenow.spring.datajpa.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="drugstock")
public class Drugsearch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="drugID")
	private Integer drugID;	

	@Column(name ="drugname")
	private String drugname;
	
	@Column(name ="drugexpdate")
	private Date drugexpdate;
	
	@Column(name ="drugquantity")
	private Integer drugquantity;

	
	//Getters and Setters
	public Integer getDrugID() {
		return drugID;
	}

	public void setDrugID(Integer drugID) {
		this.drugID = drugID;
	}

	public String getDrugname() {
		return drugname;
	}

	public void setDrugname(String drugname) {
		this.drugname = drugname;
	}

	public Date getDrugexpdate() {
		return drugexpdate;
	}

	public void setDrugexpdate(Date drugexpdate) {
		this.drugexpdate = drugexpdate;
	}

	public Integer getDrugquantity() {
		return drugquantity;
	}

	public void setDrugquantity(Integer drugquantity) {
		this.drugquantity = drugquantity;
	}
	
	

}
