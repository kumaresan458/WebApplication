package com.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/employee")
public class EmployeeController {

	@RequestMapping("/")
	public String getIndex() {
		return "index";
	}

	@RequestMapping("/home")
	public String getHome() {
		return "index";
	}

	@RequestMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String getRegister() {
		return "register";
	}
	
}
