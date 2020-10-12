package com.carenow.spring.datajpa.repository_IT19070704;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.carenow.spring.datajpa.model.bill;





@Repository
public interface billrepository extends JpaRepository<bill, Serializable> {
	
	@Query(value ="SELECT *  FROM  bill WHERE  pdate =?1 AND payments= 'yes' ",nativeQuery = true)
	List<bill> findByDate( String  date);
	
	
	@Modifying
	@Transactional
	@Query(value ="UPDATE bill SET  payments= 'yes'  WHERE billid =?1",nativeQuery = true)
   int  updateBilpaymetsl(int id);
	
	
	@Modifying
	@Transactional
	@Query(value ="UPDATE bill SET  printings= 'yes'  WHERE billid =?1",nativeQuery = true)
   int  updateBilprintsl(int id);
	
	
	@Modifying
	@Query(value="INSERT INTO bill(tamount)  VALUES(0)",nativeQuery=true)
	 @Transactional
	public void  createbill( );
}






