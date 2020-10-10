package com.carenow.spring.datajpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="reorder")
public class Reorder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="reorderID")
	private Integer reorderID;
	
	@Column(name ="patientID")
	private Integer patientID;
	
	@Column(name ="presidID")
	private Integer presidID;

	public Integer getReorderID() {
		return reorderID;
	}

	public void setReorderID(Integer reorderID) {
		this.reorderID = reorderID;
	}

	public Integer getPatientID() {
		return patientID;
	}

	public void setPatientID(Integer patientID) {
		this.patientID = patientID;
	}

	public Integer getPresidID() {
		return presidID;
	}

	public void setPresidID(Integer presidID) {
		this.presidID = presidID;
	}
	

}
