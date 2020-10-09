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
 
import com.carenow.spring.datajpa.model.Order;
import com.carenow.spring.datajpa.service.IT19218854.OrderService;
 
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v2")
public class OrderController {
 
	@Autowired
	OrderService orderService;
	
	@GetMapping("/orders")
	public ResponseEntity<List<Order>> get() {
		List<Order> orders = orderService.findAll();
		return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
	}

	@PostMapping("/orders")
	public ResponseEntity<Order> save(@RequestBody Order order) {
		Order orderOne = orderService.save(order);
		return new ResponseEntity<Order>(orderOne, HttpStatus.OK);
	}

	@GetMapping("/orders/{id}")
	public ResponseEntity<Order> get(@PathVariable("id") Long id) {
		Order order = orderService.findById(id);
		return new ResponseEntity<Order>(order, HttpStatus.OK);
	}

	@DeleteMapping("/orders/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Long id) {
		orderService.delete(id);
		return new ResponseEntity<String>("order is deleted successfully.!", HttpStatus.OK);
	}
 
}
