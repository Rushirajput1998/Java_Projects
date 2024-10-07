package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.InventoryDao;
import com.model.Inventory;

@Service
@Transactional
public class InventoryService {

	@Autowired
	InventoryDao inventoryDao;
	
	 public void addInventory(Inventory inventory) {
	        inventoryDao.save(inventory);
	    }
	 
	 public void restockProduct(String userId, int productId, int quantity) {
	        inventoryDao.restockProduct(userId, productId, quantity);
	    }

}
