package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDao;
import com.model.Inventory;
import com.model.Product;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	InventoryService inventaryService;
	
	 public Product getProductByProductId(int pid)
	 {
		 return productDao.findByProductId(pid);
	 }
	 
	 public List<Product> findAllProducts()
	 {
		 return productDao.findAllProducts();
	 }
	 
	 public List<Product> findProductsByManufacturer(String pmfname)
	 {
		 return productDao.findProductsByManufacturer(pmfname);
	 }
	 
	 public void addProduct(Product product,int quantity,Long guid) {
	        productDao.save(product);
	        
			
			  Inventory inventory = new  Inventory(quantity, null, guid, quantity);
			 inventory.setPid(product.getPid());
			  inventory.setPname(product.getPname());
			  inventory.setSid(guid); // You need to get this from the session
			  inventory.setQuantity(quantity); 
			  inventaryService.addInventory(inventory);
			 
	    }
	 
	 public List<Product> getAllProducts() {
	        return productDao.getAllProducts();
	    }
	 
	 public List<Product> getProductsByQuantity(int quantity) {
	        return productDao.findProductsByQuantityGreaterThan(quantity);
	    }

}
