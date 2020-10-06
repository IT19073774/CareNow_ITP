package com.carenow.spring.datajpa.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "patientId")
	Integer patientId;
	
	@Column(name = "patientName")
	String patientName;
	
	@Column(name = "patientDOB")
	String patientDOB;
	
	@Column(name = "patientGender")
	String patientGender;
	
	@Column(name = "patientAddress")
	String patientAddress;
	
	@Column(name = "patientPhone1")
	String patientPhone1;
	
	@Column(name = "patientPhone2")
	String patientPhone2;
	
	@Column(name = "patientOccupation")
	String patientOccupation;
	
	@Column(name = "patientEmail")
	String patientEmail;
	
	@Column(name = "patient_E_Name")
	String patient_E_Name;
	
	@Column(name = "patient_E_Phone")
	String patient_E_Phone;
	
	@Column(name = "patient_E_Relationship")
	String patient_E_Relationship;
	
	@Column(name = "patient_H_Illness")
	String patient_H_Illness;
	
	@Column(name = "patient_H_PastSurgery")
	String patient_H_PastSurgery;
	
	@Column(name = "patient_H_Allergies")
	String patient_H_Allergies;
	
	@Column(name = "patient_H_FamilyHistory")
	String patient_H_FamilyHistory;
	
	@Column(name = "patient_H_Extra")
	String patient_H_Extra;
	
	@Column(name = "familyDoctorId")
	String familyDoctorId;
	
	

	public String getFamilyDoctorId() {
		return familyDoctorId;
	}

	public void setFamilyDoctorId(String familyDoctorId) {
		this.familyDoctorId = familyDoctorId;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientDOB() {
		return patientDOB;
	}

	public void setPatientDOB(String patientDOB) {
		this.patientDOB = patientDOB;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getPatientPhone1() {
		return patientPhone1;
	}

	public void setPatientPhone1(String patientPhone1) {
		this.patientPhone1 = patientPhone1;
	}

	public String getPatientPhone2() {
		return patientPhone2;
	}

	public void setPatientPhone2(String patientPhone2) {
		this.patientPhone2 = patientPhone2;
	}

	public String getPatientOccupation() {
		return patientOccupation;
	}

	public void setPatientOccupation(String patientOccupation) {
		this.patientOccupation = patientOccupation;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public String getPatient_E_Name() {
		return patient_E_Name;
	}

	public void setPatient_E_Name(String patient_E_Name) {
		this.patient_E_Name = patient_E_Name;
	}

	public String getPatient_E_Phone() {
		return patient_E_Phone;
	}

	public void setPatient_E_Phone(String patient_E_Phone) {
		this.patient_E_Phone = patient_E_Phone;
	}

	public String getPatient_E_Relationship() {
		return patient_E_Relationship;
	}

	public void setPatient_E_Relationship(String patient_E_Relationship) {
		this.patient_E_Relationship = patient_E_Relationship;
	}

	public String getPatient_H_Illness() {
		return patient_H_Illness;
	}

	public void setPatient_H_Illness(String patient_H_Illness) {
		this.patient_H_Illness = patient_H_Illness;
	}

	public String getPatient_H_PastSurgery() {
		return patient_H_PastSurgery;
	}

	public void setPatient_H_PastSurgery(String patient_H_PastSurgery) {
		this.patient_H_PastSurgery = patient_H_PastSurgery;
	}

	public String getPatient_H_Allergies() {
		return patient_H_Allergies;
	}

	public void setPatient_H_Allergies(String patient_H_Allergies) {
		this.patient_H_Allergies = patient_H_Allergies;
	}

	public String getPatient_H_FamilyHistory() {
		return patient_H_FamilyHistory;
	}

	public void setPatient_H_FamilyHistory(String patient_H_FamilyHistory) {
		this.patient_H_FamilyHistory = patient_H_FamilyHistory;
	}

	public String getPatient_H_Extra() {
		return patient_H_Extra;
	}

	public void setPatient_H_Extra(String patient_H_Extra) {
		this.patient_H_Extra = patient_H_Extra;
	}
	
	
}
