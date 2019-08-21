package com.employee.dao.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.bean.Employee;
import com.employee.dao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private DataSource dataSource;

	public Employee login(String userName, String password) {

		return null;
	}

}
