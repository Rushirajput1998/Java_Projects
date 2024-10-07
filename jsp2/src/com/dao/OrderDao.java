package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.model.Inventory;
import com.model.Order;
import com.model.Product;

@Repository
public class OrderDao {
	@Autowired
	private HibernateTemplate ht;
	
	 public List<Order> getOrdersBySellerId(Long sid) {
	        Session session = ht.getSessionFactory().getCurrentSession();
	        String hql = "SELECT o FROM Order o WHERE o.sid = :sid";
	        return session.createQuery(hql, Order.class)
	                .setParameter("sid", sid)
	                .getResultList();
	    }
	 
	  public void saveOrder(Order order) {
	        Session session =ht.getSessionFactory().getCurrentSession();
	        session.save(order);
	    }
	  
	  public Inventory getInventoryByProduct(Product product) {
	        Session session = ht.getSessionFactory().getCurrentSession();

	        return session.createQuery("FROM Inventory WHERE product = :product", Inventory.class)
	                .setParameter("product", product)
	                .uniqueResult();
	    }

}
