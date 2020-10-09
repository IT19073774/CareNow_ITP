package com.carenow.spring.datajpa.controller_IT19218854;
import java.util.List;

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
 
import com.carenow.spring.datajpa.model.Supplier;
import com.carenow.spring.datajpa.service.IT19218854.SupplierService;
 
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v2")
public class SupplierController {
 
	@Autowired
	SupplierService supplierService;
	
	@GetMapping("/suppliers")
	public ResponseEntity<List<Supplier>> get() {
		List<Supplier> suppliers = supplierService.findAll();
		return new ResponseEntity<List<Supplier>>(suppliers, HttpStatus.OK);
	}

	@PostMapping("/suppliers")
	public ResponseEntity<Supplier> save(@RequestBody Supplier supplier) {
		Supplier supplierOne = supplierService.save(supplier);
		return new ResponseEntity<Supplier>(supplierOne, HttpStatus.OK);
	}

	@GetMapping("/suppliers/{id}")
	public ResponseEntity<Supplier> get(@PathVariable("id") Long id) {
		Supplier supplier = supplierService.findById(id);
		return new ResponseEntity<Supplier>(supplier, HttpStatus.OK);
	}

	@DeleteMapping("/suppliers/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Long id) {
		supplierService.delete(id);
		return new ResponseEntity<String>("supplier is deleted successfully.!", HttpStatus.OK);
	}
}