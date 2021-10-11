package com.mindtree.todo.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean authorize(String name, String password) {
		
		return (name.equals("Anuj") && password.equals("123anuj321"));
		
	}

}
