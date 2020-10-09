package com.carenow.spring.datajpa.controller_IT19070704;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.carenow.spring.datajpa.model.DeliveryRecord;
import com.carenow.spring.datajpa.service.IT9070704.deliveryservice;



@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController

public class deliverycontroller {
	

@Autowired
	deliveryservice  delservice;
	

	@GetMapping("/records")
	public ResponseEntity< List<DeliveryRecord>>  get(){
		
		List<DeliveryRecord> delivery =delservice.findRecords();
		return new  ResponseEntity< List<DeliveryRecord>>(delivery,HttpStatus.OK);
		}
	
	
	
	@RequestMapping(value ="updaterecordSuccess/{id}",method= RequestMethod.POST )	
	@ResponseBody
	public int  updatedeliverySUCCESS(@PathVariable(value="id") int id){
		delservice.updatestatusSuccess(id);
		return 202;
		
	}
	
	
	@RequestMapping(value ="updaterecordERROR/{id}",method= RequestMethod.POST )	
	@ResponseBody
	public int  updatedeliveryERROR(@PathVariable(value="id") int id){
		delservice.updatestatusError(id);
		return 232;
		
	}
	
	@RequestMapping(value ="updaterecordAccept/{id}/{name}",method= RequestMethod.POST )	
	@ResponseBody
	public int  updatedeliveryACCEPT(@PathVariable(value="id") int id,@PathVariable(value="name") String name){
		delservice.updatestatusAccept(id,name);
		return 333;
		
	}


}
