package com.carenow.spring.datajpa.repository_IT19071480;

import org.springframework.stereotype.Repository;

import com.carenow.spring.datajpa.model.*;

import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface DeliveryRecordServices extends JpaRepository<DeliveryRecord, Integer> {
	

}
