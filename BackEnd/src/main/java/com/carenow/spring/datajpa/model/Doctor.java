package com.carenow.spring.datajpa.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DoctorId")
	Integer DoctorId;
	
	@Column(name = "EmployeeId")
	String EmployeeId;
	
	@Column(name = "Education")
	String Education;
	
	@Column(name = "Color")
	String Color;

	
	
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public Integer getDoctorId() {
		return DoctorId;
	}

	public void setDoctorId(Integer doctorId) {
		DoctorId = doctorId;
	}

	public String getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}

	public String getEducation() {
		return Education;
	}

	public void setEducation(String education) {
		Education = education;
	}

}
