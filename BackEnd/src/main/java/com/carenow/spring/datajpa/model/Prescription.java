package com.carenow.spring.datajpa.model;




import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prescription_table")
public class Prescription {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="prescription_id")
	private int prescription_id;
	
	@Column(name ="patient_id")
	private Integer patient_id;
	
	@Column(name ="doctor_id")
	private Integer doctor_id;
	
	@Column(name ="patient_name")
	private String patient_name;
	
	@Column(name ="patient_age")
	private Integer patient_age;
	
	@Column(name ="docFee")
	private Integer docFee;
	
	@Column(name ="drugs")
	private String drugs;
	
	@Column(name ="prescription_date")
	private Date prescription_date;
	
	@Column(name ="status")
	private String status;

	public int getPrescription_id() {
		return prescription_id;
	}

	public void setPrescription_id(int prescription_id) {
		this.prescription_id = prescription_id;
	}

	public Integer getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(Integer patient_id) {
		this.patient_id = patient_id;
	}

	public Integer getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(Integer doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public Integer getPatient_age() {
		return patient_age;
	}

	public void setPatient_age(Integer patient_age) {
		this.patient_age = patient_age;
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

	public Date getPrescription_date() {
		return prescription_date;
	}

	public void setPrescription_date(Date prescription_date) {
		this.prescription_date = prescription_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
