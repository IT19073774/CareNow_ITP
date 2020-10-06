package com.carenow.spring.datajpa.repository_IT19073774;

import org.springframework.stereotype.Repository;

import com.carenow.spring.datajpa.model.*;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ShiftServices extends JpaRepository<Shift, Integer> {
	
	List<Shift> findByShiftDay(String day,Sort sort);

	List<Shift> findByDoctorId(String doc, Sort by);
}
	

