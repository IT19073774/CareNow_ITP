package com.carenow.spring.datajpa.repository_IT19218854;

import com.carenow.spring.datajpa.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository <Order, Long> {
    
}
