package com.carenow.spring.datajpa.service.IT19218854;

import java.util.List;
import com.carenow.spring.datajpa.model.Order;

public interface OrderService {

    List<Order> findAll();

    Order save(Order order);

    Order findById(Long id);

    void delete(Long id);
}