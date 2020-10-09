package com.carenow.spring.datajpa.repository_IT19070704;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.carenow.spring.datajpa.model.Prescription;



public interface presrepository extends JpaRepository<Prescription, Serializable>  {
	

	@Query(value="SELECT * FROM  Prescription WHERE  prescriptionId=?1 ",nativeQuery=true)
	public  Prescription presdetails ( int id);
}
