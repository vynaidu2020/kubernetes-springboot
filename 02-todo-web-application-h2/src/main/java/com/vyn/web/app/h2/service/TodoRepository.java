package com.vyn.web.app.h2.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vyn.web.app.h2.model.Todo;


public interface TodoRepository extends JpaRepository<Todo, Integer> {
	List<Todo> findByUser(String user);
}