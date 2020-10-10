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

import com.carenow.spring.datajpa.model.DrugInsructions;
import com.carenow.spring.datajpa.model.Drugsearch;
import com.carenow.spring.datajpa.model.PatientRecords;
import com.carenow.spring.datajpa.model.PrescriptionDetails;
import com.carenow.spring.datajpa.model.Reorder;
import com.carenow.spring.datajpa.repository_IT19056494.DrugInsructionsServices;
import com.carenow.spring.datajpa.repository_IT19056494.DrugSerachServices;
import com.carenow.spring.datajpa.repository_IT19056494.PatientRecordServices;
import com.carenow.spring.datajpa.repository_IT19056494.PrescriptionDetailsServices;
import com.carenow.spring.datajpa.repository_IT19056494.ReorderServices;

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
	PrescriptionDetailsServices presdetailsservice;
	
	@GetMapping(path ="/all-Pres")
	 List<PrescriptionDetails> allPres() {
		return presdetailsservice.findAll();
	}
	
	@PostMapping(path ="/add-Pres")
	ResponseEntity<PrescriptionDetails> savePres(@RequestBody PrescriptionDetails prdata) {
		PrescriptionDetails Pres_ = presdetailsservice.save(prdata);
		return new ResponseEntity<PrescriptionDetails>(Pres_, HttpStatus.OK);
	}
	
	@GetMapping(path ="/find_Pres/{id}")
	Optional<PrescriptionDetails> getPres(@PathVariable int id) {
		return presdetailsservice.findById(id);
	}
	
	@DeleteMapping(path ="/delete_Pres/{id}")
	 ResponseEntity<String> deletepres(@PathVariable("id") Integer id) {
		presdetailsservice.deleteById(id);
		return new ResponseEntity<String>("Pres deleted", HttpStatus.OK);
	}
	
	
///////////////////////////////// Reorder ///////////////////////////////////////////////	
	
	@Autowired
	ReorderServices reorderservice;
	
	@GetMapping(path ="/allReorders")
	 List<Reorder> allReorders() {
		return reorderservice.findAll();
	}
	
	@PostMapping(path ="/addReorders")
	ResponseEntity<Reorder> savereorder(@RequestBody Reorder prdata) {
		Reorder reorder_ = reorderservice.save(prdata);
		return new ResponseEntity<Reorder>(reorder_, HttpStatus.OK);
	}
	
///////////////////////////////// Drug Search ///////////////////////////////////////////////	
	
	
	@Autowired
	DrugSerachServices drugsearchservice;
	
	@GetMapping(path ="/all-DS")
	 List<Drugsearch> alldrugsearch() {
		return drugsearchservice.findAll();
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
	 ResponseEntity<String> deleteTD(@PathVariable("id") Integer id) {
		drugInsructionsservices.deleteById(id);
		return new ResponseEntity<String>("TD deleted", HttpStatus.OK);
	}
	
	@DeleteMapping("/clear_TD")
	 ResponseEntity<String> clearTD() {
	drugInsructionsservices.deleteAll();
	return new ResponseEntity<String>("Temp drug table cleared!", HttpStatus.OK);
	}
	
	
	
}