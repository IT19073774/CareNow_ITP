package com.carenow.spring.datajpa.repository_IT19073774;

import org.springframework.stereotype.Repository;

import com.carenow.spring.datajpa.model.*;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface AppointmentServices extends JpaRepository<Appointment, Integer> {

	List<Appointment> findByStartTimeLike(String string, Sort by);

	List<Appointment> findByPatientId(String patID, Sort by);

	List<Appointment> findByStartTimeGreaterThanEqualAndStartTimeLessThanEqual(String start, String end, Sort sort);


}
