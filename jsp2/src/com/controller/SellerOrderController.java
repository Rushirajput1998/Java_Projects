package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Order;
import com.service.SellerOrderService;

@Controller
public class SellerOrderController {
	
	@Autowired
	private SellerOrderService sellerOrderService;
	
	@RequestMapping("/SellerOrders")
	  public String viewSellerOrders(HttpSession session, Model model) {
		Long userId = (Long) session.getAttribute("currentuser");
	        List<Order> sellerOrders = sellerOrderService.getSellerOrders(userId);
	        model.addAttribute("sellerOrders", sellerOrders);
	        return "SellerOrders"; // Return the view name (JSP page)
	    }

}
