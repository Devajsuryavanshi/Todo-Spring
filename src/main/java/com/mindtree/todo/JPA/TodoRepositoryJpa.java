package com.mindtree.todo.JPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.todo.model.Todo;

@Repository
public interface TodoRepositoryJpa extends JpaRepository<Todo,Integer> {
	
	//Retrieve todo by username
	List<Todo> findByUsername(String username);
	
	//Retrieve by Id
	Todo findById(int id);
	
	//update Todo
	//Delete Todo
	//Addtodo -> Use save method
	

}
