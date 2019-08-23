package com.test.hibernate;

import org.hibernate.Session;

import com.employee.bean.Employee;
import com.hibernate.HibernateUtil;

public class HibernateTest {
	public static void main(String[] args) {
		try {
			
			Employee employee = new Employee();
			employee.setUserName("emp1");
			employee.setPassword("12345");
			employee.setEmail("");
			employee.setMobile("");
			Session session = HibernateUtil.getCurrentSession();
			session.beginTransaction();
			session.save(employee);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
