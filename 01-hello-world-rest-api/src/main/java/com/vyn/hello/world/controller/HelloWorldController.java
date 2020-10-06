package com.vyn.hello.world.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vyn.hello.world.environment.InstanceInformationService;
import com.vyn.hello.world.model.HelloWorldMessage;

@RestController
public class HelloWorldController {
	
	@Autowired
	private InstanceInformationService service;

	@GetMapping(path = "/")
	public String imUpAndRunning() {
		return "{healthy:true}";
	}

	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World " + " V1 " + service.retrieveInstanceInfo();
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldMessage helloWorldBean() {
		return new HelloWorldMessage("Hello World");
	}

	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldMessage helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldMessage(String.format("Hello World, %s", name));
	}
}
