package com.carenow.spring.datajpa.service.IT19218854;

import java.util.List;
import com.carenow.spring.datajpa.model.Supplier;

public interface SupplierService {

    List<Supplier> findAll();

    Supplier save(Supplier supplier);

    Supplier findById(Long id);

    void delete(Long id);
}
