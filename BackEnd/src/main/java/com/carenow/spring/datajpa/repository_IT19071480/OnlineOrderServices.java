package com.carenow.spring.datajpa.repository_IT19071480;

import org.springframework.stereotype.Repository;

import com.carenow.spring.datajpa.model.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface OnlineOrderServices extends JpaRepository<OnlineOrder, Integer> {

	List<OnlineOrder> findByStatus(String string);
	

}
