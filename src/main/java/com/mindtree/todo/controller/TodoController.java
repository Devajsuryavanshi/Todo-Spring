package com.mindtree.todo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mindtree.todo.service.TodoService;

// /todo-> Handling
@Controller
@SessionAttributes("name")
public class TodoController {

	@Autowired
	TodoService todos;
	
	@RequestMapping(value="/todo", method=RequestMethod.GET) 
	public String todoPage(ModelMap model){
		String name = (String)model.get("name");
		model.put("todos",todos.retrieveTodos(name));
		return "todo";
	}
	
	@RequestMapping(value="/add-todo", method=RequestMethod.GET)
	public String addtodo() {
		return "addtodo";
	}
	
	@RequestMapping(value="/delete-todo", method=RequestMethod.GET)
	public String deletetodo(@RequestParam int id) {
		todos.deleteTodo(id);
		return "redirect:todo";
	}
	
	@RequestMapping(value="/add-todo", method=RequestMethod.POST)
	public String addtodo(@RequestParam String desc, ModelMap model){
		String message = "Task has been added to the list";
		model.put("message", message);
		String name = (String)model.get("name");
		todos.addTodo(name, desc, new Date(), false);
		return "addtodo";
	}
}
