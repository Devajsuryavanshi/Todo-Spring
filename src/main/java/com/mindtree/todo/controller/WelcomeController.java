package com.mindtree.todo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

// /login -> Handling
@Controller
@SessionAttributes("name")
public class WelcomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String WelcomeMessage(ModelMap model) {
		model.put("name", getLoggedInUserName());
		return "welcome";
	}
	
	@RequestMapping("/register")
	public String registerMessage() {
		return "register";
	}
	
	private String getLoggedInUserName() {
	Object principal = SecurityContextHolder.getContext()
			.getAuthentication().getPrincipal();
	if(principal instanceof UserDetails) {
		return ((UserDetails)principal).getUsername();
	}
	else {
		return principal.toString();
	}
	}
	
	@RequestMapping("/welcome")
	public String welcomePage(ModelMap model) {
		model.put("name", (String)model.get("name"));
		return "welcome";
	}
	
	
}
