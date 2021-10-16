package com.mindtree.todo.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mindtree.todo.model.Todo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class UserCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	TodoRepositoryJpa repo;
	
	private static final Logger log = LoggerFactory.
			getLogger(UserCommandLineRunner.class);

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/* This was used to insert demo data when H2 database was used.
		repo.save(new Todo(1, "Anuj", "Learn Spring MVC", new Date(),
                false));
		repo.save(new Todo(2, "Anuj", "Learn Struts", new Date(), false));
		repo.save(new Todo(3, "Anuj", "Learn Hibernate", new Date(),
                false));
		*/
	}

}