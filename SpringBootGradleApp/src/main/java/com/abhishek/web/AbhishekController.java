package com.abhishek.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbhishekController {
	@GetMapping("/")
	public String getInfo() {
		return "Gradle Demo App";
	}
}
