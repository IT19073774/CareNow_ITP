package com.carenow.spring.datajpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="tempdrugs")
public class DrugInsructions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="tpid")
	private Integer tpid;	
	
	@Column(name ="tdrugname")
	private String tdrugname;
	
	@Column(name ="tfrequencyselect")
	private String tfrequencyselect;

	@Column(name ="tfrequencyinput")
	private String tfrequencyinput;

	@Column(name ="trecordselect")
	private String trecordselect;
	
	@Column(name ="trecordinput")
	private String trecordinput;
	
	@Column(name ="tdurationinput")
	private String tdurationinput;
	



	//Getters and Setters 
	public Integer getTpid() {
		return tpid;
	}

	public void setTpid(Integer tpid) {
		this.tpid = tpid;
	}

	public String getTfrequencyselect() {
		return tfrequencyselect;
	}

	public void setTfrequencyselect(String tfrequencyselect) {
		this.tfrequencyselect = tfrequencyselect;
	}

	public String getTfrequencyinput() {
		return tfrequencyinput;
	}

	public void setTfrequencyinput(String tfrequencyinput) {
		this.tfrequencyinput = tfrequencyinput;
	}

	public String getTrecordselect() {
		return trecordselect;
	}

	public void setTrecordselect(String trecordselect) {
		this.trecordselect = trecordselect;
	}

	public String getTrecordinput() {
		return trecordinput;
	}

	public void setTrecordinput(String trecordinput) {
		this.trecordinput = trecordinput;
	}

	public String getTdrugname() {
		return tdrugname;
	}

	public void setTdrugname(String tdrugname) {
		this.tdrugname = tdrugname;
	}
	

	public String getTdurationinput() {
		return tdurationinput;
	}

	public void setTdurationinput(String tdurationinput) {
		this.tdurationinput = tdurationinput;
	}

	
}
