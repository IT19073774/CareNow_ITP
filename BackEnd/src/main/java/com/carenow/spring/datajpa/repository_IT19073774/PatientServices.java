package com.carenow.spring.datajpa.repository_IT19073774;

import org.springframework.stereotype.Repository;

import com.carenow.spring.datajpa.model.*;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PatientServices extends JpaRepository<Patient, Integer> {

	List<Patient> findByFamilyDoctorId(String doc);
	
}
	

