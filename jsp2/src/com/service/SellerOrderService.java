package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SellerOrderDao;
import com.model.Order;

@Service
@Transactional
public class SellerOrderService {
	@Autowired
	 SellerOrderDao sellerOrderDao;
	
	 public List<Order> getSellerOrders(Long uid) {
	        return sellerOrderDao.getSellerOrders(uid);
	    }

}
