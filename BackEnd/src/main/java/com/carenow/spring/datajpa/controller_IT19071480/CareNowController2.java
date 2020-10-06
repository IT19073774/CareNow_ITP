package com.carenow.spring.datajpa.controller_IT19071480;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carenow.spring.datajpa.model.*;
import com.carenow.spring.datajpa.repository_IT19071480.*;
import com.carenow.spring.datajpa.repository_IT19073774.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CareNowController2 {
	
////////////////////////////////////////////////////////////////////////////////
	@Autowired
	DrugServices drugServices;
	
	@GetMapping(path = "/getDrug/{name}")
	Drug getDrug(@PathVariable String name) {
		return drugServices.findByDrugName(name);
	}	

////////////////////////////////////////////////////////////////////////////////
	
	@Autowired
	PrescriptionServices prescriptionServices;
	
	@GetMapping(path ="/getPrescriptions")
	public List<Prescription> getPrescriptions() {
		
		return prescriptionServices.findAll();
	}
	
	
	@GetMapping(path ="/getPrescription/{id}")
	public Optional<Prescription> getprescription(@PathVariable("id") int id) {
		return prescriptionServices.findById(id);
	}
	
	
////////////////////////////////////////////////////////////////////////////////
	
	@Autowired
	OnlineOrderServices onlineOrderServices;
	
	@GetMapping(path ="/getOrders")
	public List<OnlineOrder> getOrders() {
		return onlineOrderServices.findByStatus("pending");
	}
	
	@PutMapping(path ="/rejectOrderStatus")
	public OnlineOrder rejectOrder(@RequestBody OnlineOrder order) {
		return onlineOrderServices.save(order);
	}
	
	@PutMapping(path ="/acceptOrderStatus")
	public OnlineOrder acceptOrder(@RequestBody OnlineOrder order) {
		Optional<Patient> patient =  getPatient(Integer.parseInt(order.getPatientId()));
		Patient pat = patient.get();
		DeliveryRecord dr = new DeliveryRecord();
		dr.setDeliveryAddress(pat.getPatientAddress());
		dr.setPatientContact(pat.getPatientPhone1());
		dr.setPatientName(pat.getPatientName());
		dr.setStatus("PENDING");
		addDeliveryRecord(dr);
		return onlineOrderServices.save(order);
	}
	
////////////////////////////////////////////////////////////////////////////////
	
	@Autowired
	DeliveryRecordServices deliveryRecordServices;
	
	public DeliveryRecord addDeliveryRecord(@RequestBody DeliveryRecord delivery) {
		return deliveryRecordServices.save(delivery);
		
	}
	
///////////////////////////////////////////////////////////////////////////////
	
	@Autowired
	PatientServices patientServices;

	Optional<Patient> getPatient(int id) {
		return patientServices.findById(id);
	}
	
///////////////////////////////////////////////////////////////////////////////
	
	@Autowired
	EmployeeServices employeeServices;
	
	@GetMapping(path ="/getDeliverers")
	public List<Employee> getDeliverers() {
		return employeeServices.findByType("DELIVERER");
	}
	
	@DeleteMapping("/deleteDeliverer/{id}")
	void deleteDeliverer(@PathVariable int id) {
		Optional<Employee> employee = getEmployee(id);
		Employee emp = employee.get();
		deleteLogin(emp.getEmail());
		employeeServices.deleteById(id);
	}
	
	Optional<Employee> getEmployee(@PathVariable int id) {
		return employeeServices.findById(id);
	}

	@PostMapping(path = "/saveDeliverer")
	public Employee saveDeliverer(@RequestBody Employee deliverer) {
		return employeeService.save(deliverer);
	}
	
///////////////////////////////////////////////////////////////////////////////
	
	@Autowired
	LoginServices loginServices;
	
	void deleteLogin(String email) {
		loginServices.deleteByEmail(email);
	}

///////////////////////////////////////////////////////////////////////////////

	
}
