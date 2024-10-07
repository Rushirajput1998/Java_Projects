package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Customer;
import com.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
		@RequestMapping(path = "/Login" ,method = RequestMethod.POST)
	public String login(@RequestParam Long userid, @RequestParam String password, @RequestParam int utype, HttpSession session) {
        String redirectPage = loginService.authenticateUser(userid, password, utype);
        if (redirectPage != null) {
            session.setAttribute("currentuser", userid);
            return "redirect:" + redirectPage;
        } else {
            return "redirect:LoginError1";
        }
    }
		
		@RequestMapping("/LoginError1")
		public String showLoginError(){
			return "LoginError1";
		}
	}
