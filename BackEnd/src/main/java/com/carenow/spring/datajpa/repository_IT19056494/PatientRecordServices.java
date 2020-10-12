package com.carenow.spring.datajpa.repository_IT19056494;


import org.springframework.data.jpa.repository.JpaRepository;

import com.carenow.spring.datajpa.model.PatientRecords;

public interface PatientRecordServices extends JpaRepository <PatientRecords , Integer> {


}
