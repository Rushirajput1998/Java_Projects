package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class homeController {

	@RequestMapping("/home")
	public String handler() {

		return "home";
	}
	

	@RequestMapping("/SellerRegister1")
	public String sellerRegister() {

		return "SellerRegister";
	}
	
	@RequestMapping("/Register1")
	public String customerRegister() {

		return "Register";
	}

	@RequestMapping("/Login1")
	public String showLogin() {
		return "Login";
	}
	
	@RequestMapping("/logout")
	public String handler2() {
		return "home";
	}

}
