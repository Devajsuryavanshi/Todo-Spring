package com.mindtree.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mindtree.todo.service.LoginService;

// /login -> Handling
@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginMessage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String WelcomeMessage(@RequestParam String name, String password, ModelMap model) {
		if(service.authorize(name, password)) {
		    model.put("name", name);
		    return "welcome";
		}
		else {
			model.put("message", "Wrong Email or Password, Please try again!");
			return "login";
		}
	}
	
	@RequestMapping("/register")
	public String registerMessage() {
		return "register";
	}
	
	@RequestMapping("/welcome")
	public String welcomePage(ModelMap model) {
		model.put("name", (String)model.get("name"));
		return "welcome";
	}
	
	
}
