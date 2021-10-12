package com.mindtree.todo.service;

//THIS CLASS IS'NT BEING USED AND IS JUST HERE TO SHOW HOW TO AUTHENtICATE MANUALLY.
import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean authorize(String name, String password) {
		
		return (name.equals("Anuj") && password.equals("123anuj321"));
		
	}

}
