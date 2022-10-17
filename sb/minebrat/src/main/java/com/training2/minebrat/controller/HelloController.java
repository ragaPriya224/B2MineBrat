package com.training2.minebrat.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHi() {
		return "hey buddy welcome";
	}
	@RequestMapping("/welcome")
	public List<String> sayWelcome() {
		return Arrays.asList("welcome aliens","welcome buddies");
	}
}