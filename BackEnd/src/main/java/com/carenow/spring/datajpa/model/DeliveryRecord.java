package com.carenow.spring.datajpa.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "deliveryRecordTable")

public class DeliveryRecord {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int deliveryRecordId;
	private String delivererName;
	private String patientName;
	private String patientContact;
	private String deliveryAddress;
	private String status;
	
	public int getDeliveryRecordId() {
		return deliveryRecordId;
	}
	public void setDeliveryRecordId(int deliveryRecordId) {
		this.deliveryRecordId = deliveryRecordId;
	}
	public String getDelivererName() {
		return delivererName;
	}
	public void setDelivererName(String delivererName) {
		this.delivererName = delivererName;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientContact() {
		return patientContact;
	}
	public void setPatientContact(String patientContact) {
		this.patientContact = patientContact;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
