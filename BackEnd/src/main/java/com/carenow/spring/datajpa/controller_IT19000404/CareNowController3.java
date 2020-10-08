package com.carenow.spring.datajpa.controller_IT19000404;

import org.springframework.data.domain.Sort;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carenow.spring.datajpa.model.*;
import com.carenow.spring.datajpa.repository_IT19073774.*;
import com.carenow.spring.datajpa.repository_IT19071480.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CareNowController3 {
	
////////////////////////////////////////////////////////////////////////////////
	
	@Autowired
	EmployeeServices employeeServices;
	
	@GetMapping(path = "/getReceptionist")
	List<Employee> getReceptionist() {
		return employeeServices.findByType("RECEPTIONIST");
	}
	
	@PostMapping(path = "/saveReceptionist")
	public Employee saveReceptionist(@RequestBody Employee receptionist) {
		return employeeServices.save(receptionist);
	}
	
	@PutMapping(path = "/updateReceptionist")
	public Employee updateReceptionist(@RequestBody Employee receptionist) {
		return employeeServices.save(receptionist);
	}
	
	@DeleteMapping("/deleteReceptionist/{id}")
	void deleteReceptionist(@PathVariable int id) {
		employeeServices.deleteById(id);
	}
	
	@GetMapping(path = "/sortReceptionist/{attribute}/{order}")
	List<Employee> sortReceptionist(@PathVariable String attribute, @PathVariable String order) {
		if (order.equals("ASC")) 
			return employeeServices.findByType("RECEPTIONIST",Sort.by(Sort.Direction.ASC,attribute));
		else if (order.equals("DESC")) 
			return employeeServices.findByType("RECEPTIONIST",Sort.by(Sort.Direction.DESC,attribute));
		else 
			return null;
			
	}
	
	@GetMapping(path = "/getCashier")
	List<Employee> getCashier() {
		return employeeServices.findByType("CASHIER");
	}
	
	@PostMapping(path = "/saveCashier")
	public Employee saveCashier(@RequestBody Employee cashier) {
		return employeeServices.save(cashier);
	}
	
	@PutMapping(path = "/updateCashier")
	public Employee updateCashier(@RequestBody Employee cashier) {
		return employeeServices.save(cashier);
	}
	
	@DeleteMapping("/deleteCashier/{id}")
	void deleteCashier(@PathVariable int id) {
		employeeServices.deleteById(id);
	}
	
	@GetMapping(path = "/sortCashier/{attribute}/{order}")
	List<Employee> sortCashier(@PathVariable String attribute, @PathVariable String order) {
		if (order.equals("ASC")) 
			return employeeServices.findByType("CASHIER",Sort.by(Sort.Direction.ASC,attribute));
		else if (order.equals("DESC")) 
			return employeeServices.findByType("CASHIER",Sort.by(Sort.Direction.DESC,attribute));
		else 
			return null;
			
	}

////////////////////////////////////////////////////////////////////////////////
}
