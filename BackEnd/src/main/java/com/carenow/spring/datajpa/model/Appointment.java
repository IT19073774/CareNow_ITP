package com.carenow.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "appointments")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AppointmentId")
	Integer AppointmentId;
	
	@Column(name = "Subject")
	String Subject;
	
	@Column(name = "Description")
	String Description;

	@Column(name = "startTime")
	String startTime;
	
	@Column(name = "endTime")
	String endTime;
	
	@Column(name = "StatusId")
	String StatusId;
	
	@Column(name = "patientId")
	String patientId;
	
	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public Integer getAppointmentId() {
		return AppointmentId;
	}

	public void setAppointmentId(Integer appointmentId) {
		AppointmentId = appointmentId;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String StartTime) {
		startTime = StartTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String EndTime) {
		endTime = EndTime;
	}

	public String getStatusId() {
		return StatusId;
	}

	public void setStatusId(String statusId) {
		StatusId = statusId;
	}
	
	
	
}
