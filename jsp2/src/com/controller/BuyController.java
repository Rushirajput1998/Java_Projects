package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Product;
import com.service.ProductService;

@Controller
public class BuyController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/Buy")
	 public String showProducts( Model model, HttpSession session) {
	        Long uid = (Long) session.getAttribute("currentuser");
	        List<Product> products = productService.getAllProducts();
			 List<Product> products1 = productService.getProductsByQuantity(10); 
	        model.addAttribute("products", products);
	        return "Buy"; // View name
	    }

}
