package com.employee.dao.impl;

import org.hibernate.Session;

import com.employee.bean.Employee;
import com.employee.dao.EmployeeDao;
import com.hibernate.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {


	public Employee login(String userName, String password) {
		Session session = HibernateUtil.getCurrentSession();
		session.save(null);
		return null;
	}

	public Employee register(Employee employee) {
		
		return null;
	}

}
