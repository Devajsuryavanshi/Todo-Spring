package com.mindtree.todo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mindtree.todo.model.Todo;
import com.mindtree.todo.service.TodoService;

// /todo-> Handling
@Controller
@SessionAttributes("name")
public class TodoController {

	@Autowired
	TodoService todos;
	
	@InitBinder
	protected void InitBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format,false));
	}
	
	@RequestMapping(value="/todo", method=RequestMethod.GET) 
	public String todoPage(ModelMap model){
		String name = (String)model.get("name");
		model.put("todos",todos.retrieveTodos(name));
		return "todo";
	}
	
	@RequestMapping(value="/add-todo", method=RequestMethod.GET)
	public String addtodo(ModelMap model) {
		model.addAttribute("todo", new Todo(0, (String)model.get("name"), "", new Date(), false));
		return "addtodo";
	}
	
	@RequestMapping(value="/delete-todo", method=RequestMethod.GET)
	public String deletetodo(@RequestParam int id) {
		todos.deleteTodo(id);
		return "redirect:todo";
	}
	
	@RequestMapping(value="/update-todo", method=RequestMethod.GET)
	public String updatetodoPage(@RequestParam int id, ModelMap model) {
		Todo todo = todos.getTodoById(id);
		model.put("todo", todo);
		return "addtodo";
	}
	
	@RequestMapping(value="/update-todo", method=RequestMethod.POST)
	public String updatetodo(@Valid @ModelAttribute("todo") Todo todo, BindingResult res, ModelMap model) {
		if(res.hasErrors()) {
			return "addtodo";
		}
		else {
			todo.setUser((String)model.get("name"));
			String message = "Task has been updated Succefully.";
			model.put("message", message);
			todos.updateTodo(todo);
			return "addtodo";
		}
	}
	
	@RequestMapping(value="/add-todo", method=RequestMethod.POST)
	public String addtodo(@Valid @ModelAttribute("todo") Todo todo, BindingResult res, ModelMap model){
		if(res.hasErrors()) {
			return "addtodo";
		}
		else {
		String message = "Task has been added to the list";
		model.put("message", message);
		String name = (String)model.get("name");
		todos.addTodo(name, todo.getDesc(), todo.getTargetDate(), false);
		return "addtodo";
	}
	}
}
