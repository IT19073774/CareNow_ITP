package com.carenow.spring.datajpa.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shifts")
public class Shift {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "shiftId")
	Integer shiftId;
	
	@Column(name = "shiftDay")
	String shiftDay;
	
	@Column(name = "shiftSlotStart")
	String shiftSlotStart;
	
	@Column(name = "shiftSlotEnd")
	String shiftSlotEnd;
	
	@Column(name = "boxId")
	String boxId;

	@Column(name = "doctorId")
	String doctorId;
	
	@Column(name = "boxColor")
	String boxColor;

	public Integer getShiftId() {
		return shiftId;
	}

	public void setShiftId(Integer shiftId) {
		this.shiftId = shiftId;
	}

	public String getShiftDay() {
		return shiftDay;
	}

	public void setShiftDay(String shiftDay) {
		this.shiftDay = shiftDay;
	}

	public String getShiftSlotStart() {
		return shiftSlotStart;
	}

	public void setShiftSlotStart(String shiftSlotStart) {
		this.shiftSlotStart = shiftSlotStart;
	}

	public String getShiftSlotEnd() {
		return shiftSlotEnd;
	}

	public void setShiftSlotEnd(String shiftSlotEnd) {
		this.shiftSlotEnd = shiftSlotEnd;
	}

	public String getBoxId() {
		return boxId;
	}

	public void setBoxId(String boxId) {
		this.boxId = boxId;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getBoxColor() {
		return boxColor;
	}

	public void setBoxColor(String boxColor) {
		this.boxColor = boxColor;
	}
	
	
}
