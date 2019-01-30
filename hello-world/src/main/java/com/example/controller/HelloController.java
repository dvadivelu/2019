package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/greeting")
	public String sayHello() {
		//This code needs to be installed in the cluster
		return "Hello World";
	}

}