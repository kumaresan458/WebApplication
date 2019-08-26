package com.employee.dao.impl;

import org.hibernate.Session;

import com.employee.bean.Employee;
import com.employee.dao.EmployeeDao;
import com.hibernate.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	private static EmployeeDaoImpl employeeDaoImpl = null;

	private EmployeeDaoImpl() {

	}

	public static EmployeeDaoImpl getEmployeeImplInstance() {

		if (employeeDaoImpl == null) {
			employeeDaoImpl = new EmployeeDaoImpl();
		}

		return employeeDaoImpl;
	}

	public Employee login(String userName, String password) {
		Session session = HibernateUtil.getCurrentSession();
		session.save(null);
		return null;
	}

	public Employee register(Employee employee) {
		Session session = HibernateUtil.getCurrentSession();
		session.beginTransaction();
		session.persist(employee);
		session.getTransaction().commit();
		return employee;
	}

}
