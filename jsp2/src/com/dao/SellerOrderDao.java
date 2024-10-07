package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.model.Order;

@Repository
public class SellerOrderDao {
	
	@Autowired
	private HibernateTemplate ht;
	
	  public List<Order> getSellerOrders(Long uid) {
	        Session session = ht.getSessionFactory().getCurrentSession();
	        String hql = "SELECT so FROM Order so WHERE so.uid = :uid";
	        return session.createQuery(hql, Order.class)
	                .setParameter("uid", uid)
	                .getResultList();
	    }

}
