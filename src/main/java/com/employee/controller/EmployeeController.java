package com.employee.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.employee.bean.Employee;
import com.employee.dao.impl.EmployeeDaoImpl;

@Controller("/employee")
public class EmployeeController {
	EmployeeDaoImpl dao = EmployeeDaoImpl.getEmployeeImplInstance();

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
	public ModelAndView doRegister(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();
		Employee employee = new Employee();
		employee.setUserName(request.getParameter("username"));
		employee.setPassword(request.getParameter("password"));
		employee.setConfirmPassword(request.getParameter("cpassword"));
		employee.setEmail(request.getParameter("email"));
		employee.setMobile(request.getParameter("mobile"));
		dao.register(employee);
		modelView.setViewName("login");
		modelView.addObject("msg", "Successfully registered!!!");
		return modelView;
	}
}
