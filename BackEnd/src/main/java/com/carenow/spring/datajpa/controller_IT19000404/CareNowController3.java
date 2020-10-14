package com.carenow.spring.datajpa.controller_IT19000404;

import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

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

public class CareNowController3 {
	
////////////////////////////////////////////////////////////////////////////////
	
	@Autowired
	EmployeeServices employeeServices;
	
	@GetMapping(path = "/getReceptionist")
	List<Employee> getReceptionist() {
		return employeeServices.findByType("RECEPTIONIST");
	}
	
	@PostMapping(path = "/saveReceptionist/{password}")
	public Employee saveReceptionist(@RequestBody Employee receptionist, @PathVariable String password) {
		return employeeServices.save(receptionist);
	}

	
	@PostMapping(path = "/updateReceptionist")
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
	
////////////////////////////////////////////////////////////////////////////////
	
	@GetMapping(path = "/getCashier")
	List<Employee> getCashier() {
		return employeeServices.findByType("CASHIER");
	}
	
	@PostMapping(path = "/saveCashier/{password}")
	public Employee saveCashier(@RequestBody Employee cashier, @PathVariable String password) {
		return employeeServices.save(cashier);
	}
	
	
	@PostMapping(path = "/updateCashier")
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

	List<Employee> getDoctorEmp() {
		return employeeServices.findByType("DOCTOR");
	}
	

	public Employee saveDoctorEmp(Employee doctor) {
		return employeeServices.save(doctor);
	}

	void deleteDoctorEmp(int id) {
		employeeServices.deleteById(id);
	}

////////////////////////////////////////////////////////////////////////////////
	
	@Autowired
	DoctorServices doctorServices;

	Optional<Doctor> getDoctor(int id) {
		return doctorServices.findById(id);
	}
	
	public Doctor saveDoctor(Doctor doctor) {
		return doctorServices.save(doctor);
	}
	
	public void deleteDoctor(String empid) {
		Optional<Doctor> doc = doctorServices.findByEmployeeId(empid);
		Doctor doctor = doc.get();
		doctorServices.deleteById(doctor.getDoctorId());
		
	}
	
	
////////////////////////////////////////////////////////////////////////////////	
	
	@GetMapping(path = "/getDoctor")
	List<EmployeeDoctor> getOnlyDoctor() {
		List<EmployeeDoctor> doctors =  new ArrayList<EmployeeDoctor>();
		List<Employee> employeeDoctors = getDoctorEmp();
		
		for (int i=0; i < employeeDoctors.size(); i++) {
			
			Optional<Doctor> doctor = getDoctor(employeeDoctors.get(i).getEmployeeId());
			Doctor doc = doctor.get();
			
			EmployeeDoctor empdoc = new EmployeeDoctor();
			empdoc.setEmployeeId(employeeDoctors.get(i).getEmployeeId());
			empdoc.setFirstName(employeeDoctors.get(i).getFirstName());
			empdoc.setLastName(employeeDoctors.get(i).getLastName());
			empdoc.setContactNo(employeeDoctors.get(i).getContactNo());
			empdoc.setAddress(employeeDoctors.get(i).getAddress());
			empdoc.setGender(employeeDoctors.get(i).getGender());
			empdoc.setDob(employeeDoctors.get(i).getDob());
			empdoc.setEmail(employeeDoctors.get(i).getEmail());
			empdoc.setHiredDate(employeeDoctors.get(i).getHiredDate());
			empdoc.setNic(employeeDoctors.get(i).getNic());
			empdoc.setType(employeeDoctors.get(i).getType());
			empdoc.setEducation(doc.getEducation());
			
			doctors.add(empdoc);
		}
		
		
		return doctors;
	}
	
	@PostMapping(path = "/saveDoctor/{education}/{password}")
	public void saveOnlyDoctor(@RequestBody Employee doc,@PathVariable String education, @PathVariable String password) {
		
		Employee addedDoc = saveDoctorEmp(doc);
		
		Doctor doconly = new Doctor();
		doconly.setEmployeeId(addedDoc.getEmployeeId().toString());
		doconly.setEducation(education);
		doconly.setColor(generateRGB());
		saveDoctor(doconly);
	}
	
	
	
	@DeleteMapping("/deleteDoctor/{id}")
	void deleteOnlyDoctor(@PathVariable int id) {
		deleteDoctorEmp(id);
		deleteDoctor(String.valueOf(id));
	}
	
	public String generateRGB() {
		int R, G, B;
		Random r = new Random();
		int low = 0;
		int high = 256;
		R = r.nextInt(high-low) + low;
		G = r.nextInt(high-low) + low;
		B = r.nextInt(high-low) + low;
		
		return "rgb(" + R + "," + G + "," + B  + ")";
	}
}
