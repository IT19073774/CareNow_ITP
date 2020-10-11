package com.carenow.spring.datajpa.controller_IT19056494;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carenow.spring.datajpa.model.*;
import com.carenow.spring.datajpa.repository_IT19056494.*;
import com.carenow.spring.datajpa.repository_IT19071480.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class CareNowController5 {
	
///////////////////////////////// PatientRecord ///////////////////////////////////////////////	
	@Autowired
	 PatientRecordServices prservices;
	
	@GetMapping(path ="/all-PR")
	 List<PatientRecords> allPR() {
		return prservices.findAll();
	}
	
	@PostMapping(path ="/add-PR")
	ResponseEntity<PatientRecords> savePR(@RequestBody PatientRecords prdata) {
		PatientRecords PR_ = prservices.save(prdata);
		return new ResponseEntity<PatientRecords>(PR_, HttpStatus.OK);
	}
	
	@DeleteMapping(path ="/delete_PR/{id}")
	 ResponseEntity<String> delete(@PathVariable("id") Integer id) {
		prservices.deleteById(id);
		return new ResponseEntity<String>("PR deleted", HttpStatus.OK);
	}
	
	@GetMapping(path ="/find_PR/{id}")
	Optional<PatientRecords> getPR(@PathVariable int id) {
		return prservices.findById(id);
	}
	
///////////////////////////////// Prescription Details ///////////////////////////////////////////////	

	@Autowired
	PrescriptionServices prescriptionServices;
	
	@GetMapping(path ="/all-Pres")
	 List<Prescription> allPres() {
		return prescriptionServices.findAll();
	}
	
	@PostMapping(path ="/add-Pres")
	ResponseEntity<Prescription> savePres(@RequestBody Prescription prdata) {
		Prescription Pres_ = prescriptionServices.save(prdata);
		return new ResponseEntity<Prescription>(Pres_, HttpStatus.OK);
	}
	
	@GetMapping(path ="/find_Pres/{id}")
	Optional<Prescription> getPres(@PathVariable int id) {
		return prescriptionServices.findById(id);
	}
	
	@DeleteMapping(path ="/delete_Pres/{id}")
	 ResponseEntity<String> deletepres(@PathVariable("id") Integer id) {
		prescriptionServices.deleteById(id);
		return new ResponseEntity<String>("Pres deleted", HttpStatus.OK);
	}
	
	
///////////////////////////////// Reorder ///////////////////////////////////////////////	
	
	@Autowired
	OnlineOrderServices onlineOrderServices;
	
	@GetMapping(path ="/allReorders")
	 List<OnlineOrder> allReorders() {
		return onlineOrderServices.findAll();
	}
	
	@PostMapping(path ="/addReorders")
	ResponseEntity<OnlineOrder> savereorder(@RequestBody OnlineOrder prdata) {
		OnlineOrder reorder_ = onlineOrderServices.save(prdata);
		return new ResponseEntity<OnlineOrder>(reorder_, HttpStatus.OK);
	}
	
///////////////////////////////// Drug Search ///////////////////////////////////////////////	
	
	
	@Autowired
	DrugServices drugServices;
	
	@GetMapping(path ="/all-DS")
	 List<Drug> alldrugsearch() {
		return drugServices.findAll();
	}
	
///////////////////////////////// Drug Instructions ///////////////////////////////////////////////		
	
	@Autowired
	DrugInsructionsServices drugInsructionsservices;
	
	@GetMapping(path ="/all-TD")
	 List<DrugInsructions> allTDs() {
		return drugInsructionsservices.findAll();
	}
	
	@PostMapping(path ="/add-TD")
	ResponseEntity<DrugInsructions> saveTD(@RequestBody DrugInsructions prdata) {
		DrugInsructions TD_ = drugInsructionsservices.save(prdata);
		return new ResponseEntity<DrugInsructions>(TD_, HttpStatus.OK);
	}
	
	@GetMapping(path ="/find_TD/{id}")
	Optional<DrugInsructions> getTD(@PathVariable int id) {
		return drugInsructionsservices.findById(id);
	}
	
	
	@DeleteMapping(path ="/delete_TD/{id}")
	void deleteTD(@PathVariable int id) {
		drugInsructionsservices.deleteById(id);
	}
	
	
	@DeleteMapping("/clear_TD")
	 ResponseEntity<String> clearTD() {
	drugInsructionsservices.deleteAll();
	return new ResponseEntity<String>("Temp drug table cleared!", HttpStatus.OK);
	}
	
	
	
}
