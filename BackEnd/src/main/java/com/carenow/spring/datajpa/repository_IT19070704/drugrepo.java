package com.carenow.spring.datajpa.repository_IT19070704;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.carenow.spring.datajpa.model.Drug;



public interface drugrepo extends JpaRepository <Drug, Serializable> {
	
	@Query(value="SELECT * FROM  Drug   WHERE  drugName=?1  ",nativeQuery=true)
	 Drug drugc(String Name);

}
