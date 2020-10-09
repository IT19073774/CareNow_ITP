package com.carenow.spring.datajpa.service.IT9070704;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carenow.spring.datajpa.model.Drug;

import com.carenow.spring.datajpa.model.Prescription;
import com.carenow.spring.datajpa.model.bill;

import com.carenow.spring.datajpa.repository_IT19070704.billrepository;
import com.carenow.spring.datajpa.repository_IT19070704.drugrepo;
import com.carenow.spring.datajpa.repository_IT19070704.presrepository;




@Service
public class billserviceimpl implements billservice {


    
	@Autowired
	billrepository Billrepository;
	
	@Autowired
	presrepository Presrepositort;
	
	
	

	
	@Autowired
	drugrepo drug;
	
	
	double drugsum = 0.0; 
	double sum = 0.0;
	
	
	@Override
	public List<bill> findAll() {
	
		return  Billrepository.findAll();
	}
	
	
	
	@Override
	public void  deletebyId(int id) {
	
		 Billrepository.deleteById(id);
	}






	@Override

	 public Drug drugc(String Name) {
		// TODO Auto-generated method stub
		return drug.drugc(Name) ;
	}










	@Override
	public List<bill> findByDate(String date) {
		
	
		return 	Billrepository.findByDate(date);
	}



	@Override
	public int updateBilpaymetsl(int id) {
	
		return Billrepository.updateBilpaymetsl(id);
	}



	@Override
	public int updateBilprintsl(int id) {
		
		return Billrepository.updateBilprintsl(id);
	}


	@Override
	public  Prescription presdetails ( int id) {
	
		return   Presrepositort.presdetails(id);
	}




/*	@Override
	public double total_price(int id) {
	
			
		
				 /*d= Docrepo.docch(id);
			     dr= drug.drugc(id);
		     
			
			 for (final Drug dg : dr) {
				 
				 Prescription p= 	Presrepositort.drugdetails(id,dg.getDrugid());
				 drugsum += (((dg.getPrice()* p.getFrequancy())*p.getDuartion())*7);
				                                                      
				}
	
			    sum = d.getCharge()+drugsum;
			    
		return   sum;
				
	}*/
	

	@Override
		public void  createbill() {
	
			 	


      Billrepository.createbill();
				
	}













	








	
	

}
