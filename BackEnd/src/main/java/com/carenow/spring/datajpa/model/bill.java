package com.carenow.spring.datajpa.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class bill {
	
	
	@Id
	@Column(name ="billid")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private  int  billid;
	@Column(name="tamount")
	private  double  tamount; 
	@Column(name="pdate" ,  columnDefinition="varchar(255) default '2020-06-07'")
	private  String  pdate;
	@Column(name="payments" , columnDefinition="varchar(255) default 'NO'")
	private  String  payments;
	@Column(name="printings" ,  columnDefinition="varchar(255) default 'NO'")
	private  String  printings;
	
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public double getTamount() {
		return tamount;
	}
	public void setTamount(double tamount) {
		this.tamount = tamount;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	public String getPayments() {
		return payments;
	}
	public void setPayments(String payments) {
		this.payments = payments;
	}
	public String getPrintings() {
		return printings;
	}
	public void setPrintings(String printings) {
		this.printings = printings;
	}
	
    
	}
