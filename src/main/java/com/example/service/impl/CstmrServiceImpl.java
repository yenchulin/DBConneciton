package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CstmrDao;
import com.example.model.Cstmr;
import com.example.service.CstmrService;

@Service
public class CstmrServiceImpl implements CstmrService{

	@Autowired
	CstmrDao customerDao;
	
	@Override
	public void insert(Cstmr cus) {
		customerDao.insert(cus);
		System.out.println("Insert Success");
		
	}

}
