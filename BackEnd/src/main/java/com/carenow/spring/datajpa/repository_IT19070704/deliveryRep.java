package com.carenow.spring.datajpa.repository_IT19070704;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.carenow.spring.datajpa.model.DeliveryRecord;



@Repository
public interface deliveryRep extends JpaRepository<DeliveryRecord, Serializable>  {
	
	@Query(value="SELECT  * FROM  DeliveryRecord WHERE status='pending'", nativeQuery=true)
	List<DeliveryRecord>findRecords();
	
	
	
	@Modifying
	@Transactional
	@Query(value="Update DeliveryRecord  SET status='delivered' WHERE DeliveryRecord=?1",nativeQuery=true)
	int  updatestatusSuccess(int id);
	
	
	@Modifying
	@Transactional
	@Query(value="Update DeliveryRecord  SET status='cancelled' WHERE  DeliveryRecord=?1",nativeQuery=true)
	int  updatestatusError(int id);
	
	
	@Modifying
	@Transactional
	@Query(value="Update DeliveryRecord  SET acceptingst='Accepted' WHERE  DeliveryRecord=?1 AND delivererName=?2",nativeQuery=true)
	int  updatestatusDeliverer(int id ,String Name);

	

}
