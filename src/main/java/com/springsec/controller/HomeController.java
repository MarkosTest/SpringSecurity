package com.springsec.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value="hola", method= RequestMethod.GET)
	public String helloWorld(){
		return "Hi there!";
	}
	
	@RequestMapping(value="admin", method= RequestMethod.GET)
	public String adminPage(){
		return "Hi ADMIN!";
	}
	
}
