package com.carenow.spring.datajpa.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="prescription")
public class PrescriptionDetails {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="presid")
	private Integer presid;
	
	@Column(name ="prespatientid")
	private Integer prespatientid;

	@Column(name ="presdate")
	private Date presdate;

	@Column(name ="presdrugs")
	private String presdrugs;
	
	@Column(name ="prespatientname")
	private String prespatientname;
	
	@Column(name ="prespatientage")
	private Integer prespatientage;
	
	@Column(name ="docfee")
	private Integer docfee;
	
	//getters and setters

	public Integer getPresid() {
		return presid;
	}

	public void setPresid(Integer presid) {
		this.presid = presid;
	}

	public Integer getPrespatientid() {
		return prespatientid;
	}

	public void setPrespatientid(Integer prespatientid) {
		this.prespatientid = prespatientid;
	}

	public Date getPresdate() {
		return presdate;
	}

	public void setPresdate(Date presdate) {
		this.presdate = presdate;
	}

	public String getPresdrugs() {
		return presdrugs;
	}

	public void setPresdrugs(String presdrugs) {
		this.presdrugs = presdrugs;
	}

	public String getPrespatientName() {
		return prespatientname;
	}

	public void setPrespatientName(String prespatientName) {
		this.prespatientname = prespatientName;
	}

	public Integer getPrespatientAge() {
		return prespatientage;
	}

	public void setPrespatientAge(Integer prespatientAge) {
		this.prespatientage = prespatientAge;
	}

	public Integer getDocfee() {
		return docfee;
	}

	public void setDocfee(Integer docfee) {
		this.docfee = docfee;
	}
	
	

}
