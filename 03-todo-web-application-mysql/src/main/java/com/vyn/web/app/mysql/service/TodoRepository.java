package com.vyn.web.app.mysql.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vyn.web.app.mysql.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer>{
	List<Todo> findByUser(String user);
	
	//service.retrieveTodos(name)

	//service.deleteTodo(id);
	//service.retrieveTodo(id)
	//service.updateTodo(todo)
	//service.addTodo(getLoggedInUserName(model), todo.getDesc(), todo.getTargetDate(),false);
}
