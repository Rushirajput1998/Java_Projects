package com.dao;


import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.model.Seller;

@Repository
public class SellerRegisterDao {
	@Autowired
	private HibernateTemplate ht;
	
	  public boolean isSellerExists(Long sid) {
		  String hql = "SELECT COUNT(*) FROM Seller s WHERE s.sid = :sid";
		    Long count = ht.execute(session -> {
		        return (Long) session.createQuery(hql)
		                            .setParameter("sid", sid)
		                            .getSingleResult();
		    });

		    return count > 0;
	  }
	  
	    public void registerSeller(Seller seller)
	    {
	        ht.save(seller);
	    }
	    
	   

	   
		public Seller findBySidAndPass(Long sid, String pass1) {
			
			 Session session = ht.getSessionFactory().getCurrentSession();
		        return session.createQuery("FROM Seller WHERE sid = :sid AND pass1 = :pass1", Seller.class)
		                      .setParameter("sid", sid)
		                      .setParameter("pass1", pass1)
		                      .uniqueResult();
		}
		
		public Seller getSellerById(Long sid)
		{
			Session session = ht.getSessionFactory().getCurrentSession();
		    return session.get(Seller.class, sid);
		}
		
		public List<Seller> getAllSellers() {
	        try (Session session = ht.getSessionFactory().getCurrentSession()) {
	            String query = "SELECT name, sid, address, phno FROM Seller";
	            return session.createQuery(query, Seller.class).list();
	        }
	    }

}
