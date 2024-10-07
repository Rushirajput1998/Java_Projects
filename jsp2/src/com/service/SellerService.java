package com.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.SellerRegisterDao;
import com.model.Seller;

@Service
@Transactional
public class SellerService extends RuntimeException {

	
	
	

	@Autowired
    private SellerRegisterDao sellerRegisterDao;

    public boolean isSellerExists(Long sid) {
        return sellerRegisterDao.isSellerExists(sid);
    }

    public void registerSeller(Seller seller) {
    	String pass1 = seller.getPass1();
        String pass2 = seller.getPass2();
    	if (pass1 != null && pass1.equals(pass2))
    	{
    		sellerRegisterDao.registerSeller(seller);
        }
    	else
    	{
			 System.out.println("password do not match");
        }
    }
    
    public Seller findBySidAndPass(Long sid,String pass1)
    {
    	return sellerRegisterDao.findBySidAndPass(sid, pass1);
    }
    
    public Seller getSellerById(Long sid)
    {
    	return sellerRegisterDao.getSellerById(sid) ;
    }
    
    public List<Seller> getAllSellers(){
    	return  sellerRegisterDao.getAllSellers(); 
    }

}
