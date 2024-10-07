package com.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.OrderDao;
import com.model.Inventory;
import com.model.Order;
import com.model.Product;

@Service
@Transactional
public class OrderService {
	@Autowired
	OrderDao orderDao;
	
	@Autowired
	private ProductService productService;
	
	
	
	public List<Order> getOrdersBySellerId(Long sid) {
        return orderDao.getOrdersBySellerId(sid);
       }
	
	public void placeOrder(int pid, int quantity, Long uid) {
       

        Product product = productService.getProductByProductId(pid);
        Inventory inventory = orderDao.getInventoryByProduct(product);

        // Calculate price
        int price = quantity * product.getPprice();

        // Create and save order
        Order order = new Order();
        order.setProduct(product);
        order.setSid(inventory.getSid()); // Set the sid
        order.setUid(uid);
        order.setQuantity(quantity);
        order.setPrice(price);
        order.setOrderDateTime(order.getOrderDateTime());	
        

        orderDao.saveOrder(order);
        
    }

}
