package com.imooc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {

	@RequestMapping("/hello")
	public Object hello() {
		return "hello springboot~~";
	}
	
}
