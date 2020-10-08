package com.carenow.spring.datajpa.repository_IT19073774;

import org.springframework.stereotype.Repository;

import com.carenow.spring.datajpa.model.*;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DoctorServices extends JpaRepository<Doctor, Integer> {


	Optional<Doctor> findByEmployeeId(String empid);
	
	
}
	

