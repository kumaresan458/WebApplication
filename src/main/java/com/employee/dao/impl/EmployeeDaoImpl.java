package com.employee.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;

import com.employee.bean.Employee;
import com.employee.dao.EmployeeDao;
import com.employee.dao.base.BaseDao;
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
		session.beginTransaction();
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

	public static void main(String[] args) {
		Session session = HibernateUtil.getCurrentSession();
		session.beginTransaction();
		Employee e = new Employee();
		e.setUserName("user");
		e.setPassword("12345");
		e.setMobile("888368181");
		e.setEmail("user@gmail.com");
		session.persist(e);
		e.setPassword("54321");
		session.getTransaction().commit();

	}

	public Employee findUser(String userName) {
		Employee emp = null;
		Session session = HibernateUtil.getCurrentSession();
		BaseDao<Employee> base = new BaseDao<Employee>();
		try {
			Map<Object, Object> params = new HashMap<Object, Object>();
			params.put("userName", userName);
			emp = base.namedQuery(session, Employee.class, "finduser", params);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

}
