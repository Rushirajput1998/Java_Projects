package com.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.model.Inventory;

@Repository
public class InventoryDao {
	@Autowired
	private HibernateTemplate ht;	
	
	public void save(Inventory inventory)
	{
		  Session session = ht.getSessionFactory().getCurrentSession();
	        session.save(inventory);
	}
	
	public void restockProduct(String userId, int productId, int quantity) {
		  Session session = ht.getSessionFactory().getCurrentSession();
	        String hql = "UPDATE Inventory i SET i.quantity = i.quantity + :quantity WHERE i.sid = :userId AND i.pid = :productId";
	        session.createQuery(hql)
	               .setParameter("quantity", quantity)
	               .setParameter("userId", userId)
	               .setParameter("productId", productId)
	               .executeUpdate();
    }

}
