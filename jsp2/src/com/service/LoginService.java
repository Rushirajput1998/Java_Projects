package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CustomerDao;
import com.model.Customer;
import com.model.Seller;

@Service
@Transactional
public class LoginService {

	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private SellerService sellerService;
	
	 public String authenticateUser(Long uid, String pass, int userType) {
	        if (userType == 1) {
	            Customer customer = customerDao.findByUidAndPass(uid, pass);
	            if (customer != null) {
	                return "Homepage";
	            }
	        } else if (userType == 2) {
	            Seller seller = sellerService.findBySidAndPass(uid, pass);
	            if (seller != null) {
	                return "SellerHomepage";
	            }
	        }
	        return null;
	    }
	
	
}
