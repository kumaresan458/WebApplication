package com.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping(value = "/doRegister", method = RequestMethod.POST)
	public ModelAndView doRegister() {
		
		return null;
	}

}
