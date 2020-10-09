package com.carenow.spring.datajpa.service.IT19218854;

import java.util.List;

import com.carenow.spring.datajpa.model.Supplier;
import com.carenow.spring.datajpa.repository_IT19218854.SupplierRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    SupplierRepository supplierRepository;

    @Override
    public List<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier save(Supplier supplier) {
        supplierRepository.save(supplier);
        return supplier;
    }

    @Override
    public Supplier findById(Long id) {
        if(supplierRepository.findById(id).isPresent()){
			return supplierRepository.findById(id).get();
		}
        return null;
    }

    @Override
    public void delete(Long id) {
        Supplier supplier = findById(id);
		supplierRepository.delete(supplier);
    }
    
}
