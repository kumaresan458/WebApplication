package com.test.hibernate;

import org.hibernate.Session;

import com.employee.bean.Employee;
import com.hibernate.HibernateUtil;

public class HibernateTest {
	public static void main(String[] args) {
		try {

			Employee employee = new Employee();
			employee.setUserName("emp3");
			employee.setPassword("12345");
			employee.setEmail("emp1@gmail.com");
			employee.setMobile("8923893289");
			Session session = HibernateUtil.getCurrentSession();
			session.beginTransaction();
			Object obj = session.save(employee);
			session.getTransaction().commit();
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e);
		}
	}
}
