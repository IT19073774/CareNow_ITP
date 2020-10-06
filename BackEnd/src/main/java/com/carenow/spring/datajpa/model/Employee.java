package com.carenow.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EmployeeId")
	Integer EmployeeId;
	
	@Column(name = "FirstName")
	String FirstName;
	
	@Column(name = "LastName")
	String LastName;
	
	@Column(name = "NIC")
	String NIC;
	
	@Column(name = "ContactNo")
	String ContactNo;
	
	@Column(name = "Address")
	String Address;
	
	@Column(name = "Gender")
	String Gender;
	
	@Column(name = "DOB")
	String DOB;
	
	@Column(name = "Email")
	String Email;

	@Column(name = "HiredDate")
	String HiredDate;
	
	@Column(name = "Type")
	String type;

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		EmployeeId = employeeId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getNIC() {
		return NIC;
	}

	public void setNIC(String nIC) {
		NIC = nIC;
	}

	public String getContactNo() {
		return ContactNo;
	}

	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getHiredDate() {
		return HiredDate;
	}

	public void setHiredDate(String hiredDate) {
		HiredDate = hiredDate;
	}

	
}
