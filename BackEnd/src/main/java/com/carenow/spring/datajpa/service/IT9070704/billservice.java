package com.carenow.spring.datajpa.service.IT9070704;

import java.util.List;

import org.springframework.stereotype.Service;

import com.carenow.spring.datajpa.model.Drug;
import com.carenow.spring.datajpa.model.Prescription;
import com.carenow.spring.datajpa.model.bill;




@Service
public interface billservice {
	
	List<bill>findAll();
	public  void  deletebyId(int id );
    Drug drugc(String name);
	/*public Doctor  docch(int id);*/
	List<bill> findByDate(String date);
	int  updateBilpaymetsl(int id);
	int  updateBilprintsl(int id);
	public void  createbill();
	//public double total_price(int id);
	public  Prescription presdetails ( int id);
	
	
	

	
}
