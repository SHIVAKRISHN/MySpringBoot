package com.shiva.springboot.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/hello")
	public String displayHello() {
		
		return "Hellow  I am spring boot!!!!";
	}
	

}
