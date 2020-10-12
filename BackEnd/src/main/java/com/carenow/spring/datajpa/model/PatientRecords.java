package com.carenow.spring.datajpa.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="patientrecord")
public class PatientRecords {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="patientrecordID")
	 Integer patientrecordID;

	@Column(name ="patientID")
	 Integer patientID;

	@Column(name ="patientrecorddate")
	 Date patientrecorddate;

	@Column(name ="patientrecordsubjective")
	 String patientrecordsubjective;

	@Column(name ="patientrecordobjective")
	 String patientrecordobjective;

	@Column(name ="patientrecordassessment")
	 String patientrecordassessment;

	@Column(name ="patientrecordplan")
	 String patientrecordplan;

	@Column(name ="patientrecordessential")
	 String patientrecordessential;

	@Column(name ="patientrecordextra")
	 String patientrecordextra;

	public Integer getPatientRecordID() {
		return patientrecordID;
	}

	public void setPatientRecordID(Integer patientRecordID) {
		this.patientrecordID = patientRecordID;
	}

	public Integer getPatientID() {
		return patientID;
	}

	public void setPatientID(Integer patientID) {
		this.patientID = patientID;
	}

	public Date getPatientrecorddate() {
		return patientrecorddate;
	}

	public void setPatientrecorddate(Date patientrecorddate) {
		this.patientrecorddate = patientrecorddate;
	}

	public String getPatientrecordsubjective() {
		return patientrecordsubjective;
	}

	public void setPatientrecordsubjective(String patientrecordsubjective) {
		this.patientrecordsubjective = patientrecordsubjective;
	}

	public String getPatientrecordobjective() {
		return patientrecordobjective;
	}

	public void setPatientrecordobjective(String patientrecordobjective) {
		this.patientrecordobjective = patientrecordobjective;
	}

	public String getPatientrecordassessment() {
		return patientrecordassessment;
	}

	public void setPatientrecordassessment(String patientrecordassessment) {
		this.patientrecordassessment = patientrecordassessment;
	}

	public String getPatientrecordplan() {
		return patientrecordplan;
	}

	public void setPatientrecordplan(String patientrecordplan) {
		this.patientrecordplan = patientrecordplan;
	}

	public String getPatientrecordessential() {
		return patientrecordessential;
	}

	public void setPatientrecordessential(String patientrecordessential) {
		this.patientrecordessential = patientrecordessential;
	}

	public String getPatientrecordextra() {
		return patientrecordextra;
	}

	public void setPatientrecordextra(String patientrecordextra) {
		this.patientrecordextra = patientrecordextra;
	}




}