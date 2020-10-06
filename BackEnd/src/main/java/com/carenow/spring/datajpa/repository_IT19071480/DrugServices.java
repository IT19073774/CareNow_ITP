package com.carenow.spring.datajpa.repository_IT19071480;

import org.springframework.stereotype.Repository;

import com.carenow.spring.datajpa.model.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface DrugServices extends JpaRepository<Drug, Integer> {

	Drug findByDrugName(String name);
	
}
