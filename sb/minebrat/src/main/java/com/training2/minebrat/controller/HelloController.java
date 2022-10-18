package com.training2.minebrat.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training2.minebrat.service.HelloService;

@RestController
public class HelloController {
	
	@Autowired
	HelloService obj;

	@RequestMapping("/hello")
	public String sayHi() {
		
//		HelloServiceImpl obj = new HelloServiceImpl(); //tight coupling 
		return obj.sayHi();
//		return "hey buddy welcome";
	}
	@RequestMapping("/welcome") // maps only to get method by default. 
	public List<String> sayWelcome() {
		return Arrays.asList("welcome aliens","welcome buddies");
	}
}