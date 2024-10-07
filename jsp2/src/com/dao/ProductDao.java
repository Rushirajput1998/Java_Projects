package com.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.model.Product;

@Repository
public class ProductDao {

	@Autowired
	private HibernateTemplate ht;
	
	 public Product findByProductId(int pid) {
		 Session session = ht.getSessionFactory().getCurrentSession();
	        return session.get(Product.class, pid);
	    }
	 
	 public List<Product> findAllProducts() {
	        Session session = ht.getSessionFactory().getCurrentSession();
	        Query query = session.createQuery("FROM Product", Product.class);
	        return query.getResultList();
	    }
	 
	 public List<Product> findProductsByManufacturer(String pmfname) {
	        Session session =ht.getSessionFactory().getCurrentSession();
	        Query query = session.createQuery(
	            "FROM Product WHERE pmfname = :pmfname",
	            Product.class
	        );
	        query.setParameter("pmfname", pmfname);
	        return query.getResultList();
	    }
	 
	 public void save(Product product) {
	        Session session = ht.getSessionFactory().getCurrentSession();
	        session.save(product);
	    }
	 
	 public List<Product> getAllProducts() {
	        return ht.getSessionFactory().getCurrentSession().createQuery("FROM Product", Product.class).list();
	    }
	 
	 public List<Product> findProductsByQuantityGreaterThan(int quantity) {
	        Session session = ht.getSessionFactory().getCurrentSession();
	        String hql = "SELECT p FROM Product p WHERE p.inventory.quantity > :quantity";
	        TypedQuery<Product> query = session.createQuery(hql, Product.class);
	        query.setParameter("quantity", quantity);
	        return query.getResultList();
	    }

}
