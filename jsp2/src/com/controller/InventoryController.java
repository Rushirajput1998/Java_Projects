package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.InventoryService;

@Controller
public class InventoryController {
	
	@Autowired
	InventoryService inventoryService;
	
	@RequestMapping("/AddInventory")
	public String restockInventory(@RequestParam("pid") int prodId, @RequestParam("restock") int quantity, HttpSession session) {
        String guid = (String) session.getAttribute("currentuser");
        
        inventoryService.restockProduct(guid, prodId, quantity);
        
        return "redirect:/AddInventory"; // Redirect to the AddInventory page
    }

}
