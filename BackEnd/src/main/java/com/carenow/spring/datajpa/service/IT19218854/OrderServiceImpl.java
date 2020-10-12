package com.carenow.spring.datajpa.service.IT19218854;

import java.util.List;

import com.carenow.spring.datajpa.model.Order;
import com.carenow.spring.datajpa.repository_IT19218854.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order save(Order order) {
        orderRepository.save(order);
        return order;
    }

    @Override
    public Order findById(Long id) {
        if(orderRepository.findById(id).isPresent()){
			return orderRepository.findById(id).get();
		}
        return null;
    }

    @Override
    public void delete(Long id) {
        Order order = findById(id);
		orderRepository.delete(order);
    }
}
