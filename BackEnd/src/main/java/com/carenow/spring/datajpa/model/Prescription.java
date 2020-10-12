package com.carenow.spring.datajpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prescriptionTable")

public class Prescription {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name ="prescriptionId")
	private int prescriptionId;
	
	@Column(name ="patientId")
	private Integer patientId;
	
	@Column(name ="doctorID")
	private Integer doctorID;
	
	@Column(name ="patientName")
	private String patientName;
	
	@Column(name ="patientAge")
	private Integer patientAge;
	
	@Column(name ="docFee")
	private Integer docFee;
	
	@Column(name ="drugs")
	private String drugs;
	
	@Column(name ="prescriptionDate")
	private Date prescriptionDate;
	
	@Column(name ="status")
	private String status;
	
	public int getPrescriptionId() {
		return prescriptionId;
	}
	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public Integer getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(Integer doctorID) {
		this.doctorID = doctorID;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Integer getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(Integer patientAge) {
		this.patientAge = patientAge;
	}
	public Integer getDocFee() {
		return docFee;
	}
	public void setDocFee(Integer docFee) {
		this.docFee = docFee;
	}
	public String getDrugs() {
		return drugs;
	}
	public void setDrugs(String drugs) {
		this.drugs = drugs;
	}
	public Date getPrescriptionDate() {
		return prescriptionDate;
	}
	public void setPrescriptionDate(Date prescriptionDate) {
		this.prescriptionDate = prescriptionDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	

}
