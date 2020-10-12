package com.carenow.spring.datajpa.service.IT9070704;

import java.util.List;


import com.carenow.spring.datajpa.model.DeliveryRecord;

public interface deliveryservice {
	
	List<DeliveryRecord>findRecords();
	int  updatestatusSuccess(int id);
	int  updatestatusError(int id);
   int  updatestatusAccept(int id,String Name);
	

}
