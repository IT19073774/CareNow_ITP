package com.carenow.spring.datajpa.repository_IT19218854;

import com.carenow.spring.datajpa.model.Supplier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository <Supplier, Long> {
    
}
