package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hari {

	@GetMapping("/wish")
	public String wish() {
		 return "hello boss how areyou...........!";
	}
	
	@GetMapping("/greet")
	public String greet() {
		 return "hello boss good evening";
	}
}
