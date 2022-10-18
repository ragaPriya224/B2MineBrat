package com.training2.minebrat.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements  HelloService{

	@Override
	public String sayHi() {
		return "hey aliens welcome";
	}
	
}
