package com.poop.todo.testmvc.model;

import org.springframework.test.util.ReflectionTestUtils;

import com.poop.todo.model.Todo;

public class TodoBuilder {
	private Todo model;
	
	public TodoBuilder(){
		model = new Todo();
	}
	
	public TodoBuilder id(Long id){
		ReflectionTestUtils.setField(model, "id", id);
		return this;
	}
}
