package com.abhishek.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@GetMapping("/greet")
	public String greet() {
		return "Hello Abhishek, Welcome to Gradle Project";
	}
}
