package com.carenow.spring.datajpa.controller_IT19070704;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.carenow.spring.datajpa.model.Appointment;
import com.carenow.spring.datajpa.model.bill;
import com.carenow.spring.datajpa.service.IT9070704.billservice;





@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class billcontroller {
	

	@Autowired
	billservice  Billservice;
	
	

	
	
	
	
	/*@GetMapping("/bill")
	public ResponseEntity< List<bill>>  get(){
		
		List<bill> Bill =Billservice.findAll();
		return new  ResponseEntity< List<bill>>(Bill,HttpStatus.OK);
		}*/
	
	@GetMapping(path = "/getbill")
	List<bill> getbill() {
		return Billservice.findAll();
	}
	
	
	@RequestMapping(value = "deletebill/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteStudent(@PathVariable int id) {
		Billservice.deletebyId(id);
		return "bill has been deleted successfully";
	}
	
	

	
	@GetMapping(value = "search/{date}")
		public List<bill> findByDate(@PathVariable(value="date") 
		@DateTimeFormat(pattern = "yyyy-MM-dd")String date) {
	  return Billservice.findByDate(date);
	}
		
	@RequestMapping(value ="updatepay/{id}",method= RequestMethod.POST )	
	@ResponseBody
	public int  updatebill(@PathVariable(value="id") int id){
				Billservice.updateBilpaymetsl(id);
		return 001;
		
	}
	
	
	@RequestMapping(value ="updateprint/{id}",method= RequestMethod.POST )	
	@ResponseBody
	public int  updateprntbill(@PathVariable(value="id") int id){
				Billservice.updateBilprintsl(id);
		return 11;
		
	}
	
	

	
	@RequestMapping(value = "create/{id}",method= { RequestMethod.GET})
	@ResponseBody
	public List<Object> createbill(@PathVariable(value="id")  int id) {
		
		
		
		List<Object> list = new ArrayList<Object>();
		list.add(Billservice.presdetails(id));
		


       return list ;
}
	
	@RequestMapping(value = "create/{id}",method= { RequestMethod.POST})
	@ResponseBody
	public List<Object> createbillPOST(@PathVariable(value="id")  int id) {
		

		List<Object> list = new ArrayList<Object>();
		Billservice.createbill( );
		return list;
	
	}

		
	
}
