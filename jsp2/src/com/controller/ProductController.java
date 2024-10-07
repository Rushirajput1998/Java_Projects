package com.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Product;
import com.service.ProductService;

@Controller
public class ProductController {
	
	 @Autowired
	    private ProductService productService;
	 
	 @RequestMapping("/AddProduct")
	 public String addProduct()
	 {
		 return "AddProduct";
	 }
	 
		/*
		 * @RequestMapping("/AddInventory") public String addInventory() { return
		 * "AddInventory"; }
		 */
	 
	 @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	    public String addProduct(@RequestParam("pid") int pid,@RequestParam("pname") String pname,
	    		@RequestParam("pmfname") String pmfname,@RequestParam("pmfdate") String pmfdate,
	    		@RequestParam("pexdate") String pexdate,@RequestParam("pprice") int pprice,
	    		@RequestParam("quantity") int quantity, HttpSession session,Model model) {
			 Product product = new Product(); 
			
			 product.setPid(pid);
			 product.setPname(pname); 
			 product.setPmfname(pmfname);
			 product.setPmfdate(pmfdate); 
			 product.setPexdate(pexdate);
			 product.setPprice(pprice);
			 
	        
	        // Parse the date strings into LocalDate objects
	        LocalDate pmfDate = LocalDate.parse(product.getPmfdate());
	        LocalDate pexDate = LocalDate.parse(product.getPexdate());
	        
	        // Get the current user's ID from the session
	        Long guid = (Long) session.getAttribute("currentuser");

	        	
	        productService.addProduct(product, quantity,guid);
	        model.addAttribute("pid", pid);
	        model.addAttribute("pname", pname);
	        model.addAttribute("pmfname", pmfname);
	        model.addAttribute("pmfdate", pmfdate);
	        model.addAttribute("pexdate", pexdate);
	        model.addAttribute("quantity", quantity);

	        return "AddInventory"; // Redirect to the AddInventory page
	    }
}
