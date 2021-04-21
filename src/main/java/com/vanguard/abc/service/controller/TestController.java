package com.vanguard.abc.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestController {

	TestController() {
	}

	@GetMapping("/test")
	String all() {
		return "Hello brb";
	}
}