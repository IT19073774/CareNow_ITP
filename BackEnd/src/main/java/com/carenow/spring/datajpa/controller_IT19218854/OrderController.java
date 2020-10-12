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
	public List<Order> get() {
		List<Order> orders = orderService.findAll();
		return orders;
	}

	@PostMapping("/orders")
	public Order save(@RequestBody Order order) {
		Order orderOne = orderService.save(order);
		return orderOne;
	}

	@GetMapping("/orders/{id}")
	public Order get(@PathVariable("id") Long id) {
		Order order = orderService.findById(id);
		return order;
	}

	@DeleteMapping("/orders/{id}")
	public void delete(@PathVariable("id") Long id) {
		orderService.delete(id);
	}
 
}
