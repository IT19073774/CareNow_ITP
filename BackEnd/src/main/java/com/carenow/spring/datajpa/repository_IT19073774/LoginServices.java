package com.carenow.spring.datajpa.repository_IT19073774;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.carenow.spring.datajpa.model.*;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LoginServices extends JpaRepository<Login, Integer> {

	@Transactional
	void deleteByEmail(String email);


}
	

