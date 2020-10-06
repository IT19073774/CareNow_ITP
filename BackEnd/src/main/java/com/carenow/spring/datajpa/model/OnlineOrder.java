package com.carenow.spring.datajpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	

@Entity
@Table(name = "onlineOrderTable")

public class OnlineOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int reOrderId;
	private String patientId;
	private String prescriptionId;
	private String status;
	
	public int getReOrderId() {
		return reOrderId;
	}
	public void setReOrderId(int reOrderId) {
		this.reOrderId = reOrderId;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getPrescriptionId() {
		return prescriptionId;
	}
	public void setPrescriptionId(String prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}

