package com.nautilus.station.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nautilus.station.dao.Test_DAO;
import com.nautilus.station.service.Test_Service;

@Service
public class Test_ServiceInf implements Test_Service{
	@Autowired private Test_DAO dao;
	
	public int getCount(){
		return dao.getCount();
	}
}
