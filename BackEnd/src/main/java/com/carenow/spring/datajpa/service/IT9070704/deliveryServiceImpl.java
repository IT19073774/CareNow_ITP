package com.carenow.spring.datajpa.service.IT9070704;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carenow.spring.datajpa.model.DeliveryRecord;
import com.carenow.spring.datajpa.repository_IT19070704.deliveryRep;



@Service
public class deliveryServiceImpl implements deliveryservice {
	
	@Autowired
	deliveryRep deliverrepo;

	

	@Override
	public List<DeliveryRecord> findRecords() {
		// TODO Auto-generated method stub
		return deliverrepo.findAll();
	}

	@Override
	public int updatestatusError(int id) {
		// TODO Auto-generated method stub
		return deliverrepo.updatestatusError(id);
	}

	@Override
	public int updatestatusSuccess(int id) {
		// TODO Auto-generated method stub
		return deliverrepo.updatestatusSuccess(id) ;
	}

	@Override
	public int updatestatusAccept(int id,String Name) {
		// TODO Auto-generated method stub
		return deliverrepo.updatestatusDeliverer(id,Name);
	}

}
