package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Customer;
import com.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;

	
//	  @RequestMapping("/Register") 
//	  public String showRegisterForm(Model model) {
//	  model.addAttribute("customer", new Customer());
//	  return "Register"; // JSP view name
//	  }
	 
	@RequestMapping("/Homepage") 
	public String showCustomerProfile(Model model,HttpSession session) { 
		Long guid = (Long) session.getAttribute("currentuser");
		Customer customer =customerService.getCustomerById(guid);
		model.addAttribute("customer", customer); 
	  return "Homepage"; // Return the view name 
	  }

	@RequestMapping(path = "/Register", method = RequestMethod.POST)
	public String registerCustomer(@ModelAttribute("Customer") Customer customer) {
		Customer existingCustomer = customerService.getCustomerById(customer.getUid());
		if (existingCustomer != null) {
			return "redirect:RegisterError1";
		}

		if (customer.getCpass1()!=null && customer.getCpass1().equals(customer.getCpass2())) {

			customer.setUid(customer.getUid());
			customer.setCfname(customer.getCfname());
			customer.setClname(customer.getClname());
			customer.setCemail(customer.getCemail());
			customer.setCphno(customer.getCphno());
			customer.setCaddress(customer.getCaddress());
			customer.setCpass1(customer.getCpass1());
			customer.setCpass2(customer.getCpass2());

			customerService.saveCustomer(customer);
			return "Login";
		} else {
			return "RegisterError2";
		}
	}

}
