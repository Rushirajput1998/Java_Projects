package com.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.model.Customer;
import com.model.Seller;

@Repository
public class CustomerDao {
	@Autowired
	
	private HibernateTemplate ht;
	
	
	public Customer findByUidAndPass(Long uid, String cpass1) {
		Session session = ht.getSessionFactory().getCurrentSession();
		return session.createQuery("FROM Customer WHERE uid = :uid AND cpass1 = :cpass1", Customer.class)
				.setParameter("uid", uid).setParameter("cpass1", cpass1)
				.uniqueResult();
	}
	
	public Customer getCustomerById(Long uid)
	{
		Session session = ht.getSessionFactory().getCurrentSession();
	    return session.get(Customer.class, uid);
	}
	
	 public void saveCustomer(Customer customer) {
	        Session session = ht.getSessionFactory().getCurrentSession();
	        session.save(customer);
	    }


}
