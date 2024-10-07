package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Order;
import com.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;

	@RequestMapping("/Orders")
	public String viewOrders(@ModelAttribute("Order") Order order, Model model) {
	    List<Order> orders = orderService.getOrdersBySellerId(order.getSid());
	    model.addAttribute("orders", orders);
	    
	    return "Orders";
	}

	@RequestMapping(value = "/PlaceOrder",method = RequestMethod.POST)
	public String placeOrder(@RequestParam("pid") int pid, @RequestParam("quantity") int quantity,
			HttpSession httpSession) {
		Long uid = (Long) httpSession.getAttribute("currentuser");
		orderService.placeOrder(pid, quantity, uid);
		return "redirect:/Orders"; // Redirect to orders page
	}
	
	
}
