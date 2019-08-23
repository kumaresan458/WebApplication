package com.employee.dao;

import com.employee.bean.Employee;

public interface EmployeeDao {
	public Employee login(String userName, String password);
	
}
