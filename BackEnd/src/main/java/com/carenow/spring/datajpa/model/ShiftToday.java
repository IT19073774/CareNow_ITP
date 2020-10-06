package com.carenow.spring.datajpa.model;

public class ShiftToday {
	String shiftDay;
	String shiftSlotStart;
	String shiftSlotEnd;
	String doctorId;
	Integer employeeId;
	String firstName;
	String lastName;
	String contactNo;
	String Education;
	String Color;
	
	
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getEducation() {
		return Education;
	}
	public void setEducation(String education) {
		Education = education;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
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
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
}
