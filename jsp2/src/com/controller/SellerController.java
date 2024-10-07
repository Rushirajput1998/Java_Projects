package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Seller;
import com.service.SellerService;

@Controller
public class SellerController {
	@Autowired
	 private SellerService sellerService;
	
	 @RequestMapping(path = "/SellerRegister", method = RequestMethod.POST)
	    public String registerSeller(@ModelAttribute Seller seller)
	 {
	        if (sellerService.isSellerExists(seller.getSid())) 
	        {
	            return "SellerRegisterError1"; // Redirect to error page
	        } else 
	        	{
	            String pass1 = seller.getPass1();
	            String pass2 = seller.getPass2();

	            if (pass1 != null && pass1.equals(pass2)) {
	                // Only proceed if pass1 is not null and pass1 equals pass2

	                Long sid = seller.getSid();
	                String name = seller.getName();
	                String address = seller.getAddress();
	                String phno = seller.getPhno();

	                sellerService.registerSeller(new Seller(name, phno, address, sid, pass1, pass2));
	                return "Login"; // Redirect to login page
	            } else {
	                return "SellerRegisterError2"; // Redirect to error page
	            }
	        }
	    }
	 
	 @RequestMapping("/SellerHomepage")
	    public String showSellerProfile(Model model, HttpSession session) {
	        Long guid = (Long) session.getAttribute("currentuser");
	        Seller seller = sellerService.getSellerById(guid);
	        model.addAttribute("seller", seller);
	        return "SellerHomepage"; // Return the view name
	    }
	 
		/*
		 * @RequestMapping("/all") public String showAllSellers(Model model) {
		 * List<Seller> sellers = sellerService.getAllSellers();
		 * model.addAttribute("sellers", sellers); return "allSellers"; // Return the
		 * view name }
		 */
	 
}
