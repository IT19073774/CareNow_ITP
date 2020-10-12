package com.carenow.spring.datajpa.controller_IT18226874;

import org.springframework.data.domain.Sort;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carenow.spring.datajpa.model.*;
import com.carenow.spring.datajpa.repository_IT19073774.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CareNowController4 {
	
////////////////////////////////////////////////////////////////////////////////
	
	@Autowired
	EmployeeServices employeeServices;
	
	@GetMapping(path = "/getStockManager")
	List<Employee> getStockManager() {
		return employeeServices.findByType("STOCK MANAGER");
	}
	
	@PostMapping(path = "/saveStockManager")
	public Employee saveStockManager(@RequestBody Employee stockManager) {
		return employeeServices.save(stockManager);
		}
		
	@PutMapping(path = "/updateStockManager")
	public Employee updateStockManager(@RequestBody Employee stockManager) {
		return employeeServices.save(stockManager);
	}
	
	@DeleteMapping("/deleteStockManager/{id}")
	void deleteStockManager(@PathVariable int id) {
		employeeServices.deleteById(id);
	}
	
	@GetMapping(path = "/sortStockManager/{attribute}/{order}")
	List<Employee> sortStockManager(@PathVariable String attribute, @PathVariable String order) {
		if (order.equals("ASC")) 
			return employeeServices.findByType("STOCK MANAGER",Sort.by(Sort.Direction.ASC,attribute));
		else if (order.equals("DESC")) 
			return employeeServices.findByType("STOCK MANAGER",Sort.by(Sort.Direction.DESC,attribute));
		else 
			return null;
			
	}
	
	@GetMapping(path = "/getPharmacist")
	List<Employee> getPharmacist() {
		return employeeServices.findByType("PHARMACIST");
	}
	
	@PostMapping(path = "/savePharmacist/{password}")
	public Employee savePharmacist(@RequestBody Employee pharmacist,@PathVariable String password) {
		
		//addLogin(pharmacist.getEmail(), password);
		return employeeServices.save(pharmacist);
	}
	
	@PutMapping(path = "/updatePharmacist")
	public Employee updatePharmacist(@RequestBody Employee pharmacist) {
		return employeeServices.save(pharmacist);
	}
	
	@DeleteMapping("/deletePharmacist/{id}")
	void deletePharmacist(@PathVariable int id) {
		employeeServices.deleteById(id);
	}
	
	@GetMapping(path = "/sortPharmacist/{attribute}/{order}")
	List<Employee> sortPharmacist(@PathVariable String attribute, @PathVariable String order) {
		if (order.equals("ASC")) 
			return employeeServices.findByType("PHARMACIST",Sort.by(Sort.Direction.ASC,attribute));
		else if (order.equals("DESC")) 
			return employeeServices.findByType("PHARMACIST",Sort.by(Sort.Direction.DESC,attribute));
		else 
			return null;
			
	}

////////////////////////////////////////////////////////////////////////////////
	
	LoginServices loginServices;

	Login addLogin(String email, String psw) {
		Login cred = new Login();
		cred.setEmail(email);
		cred.setPassword(psw);
		return loginServices.save(cred);
	}
	
}
