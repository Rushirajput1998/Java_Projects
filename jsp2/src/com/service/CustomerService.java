package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CustomerDao;
import com.model.Customer;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	CustomerDao customerDao;
	
	public Customer getCustomerById(Long uid)
	{
		return customerDao.getCustomerById(uid);
	}

	 public void saveCustomer(Customer customer) {
		 
		 customerDao.saveCustomer(customer);
	 }
}
