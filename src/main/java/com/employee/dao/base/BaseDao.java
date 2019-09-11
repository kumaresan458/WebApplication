package com.employee.dao.base;

import java.util.Map;

import org.hibernate.Session;

import com.employee.bean.Employee;

public class BaseDao<T> {
	public T namedQuery(Session session, Class<T> c, String namedQuery, Map<Object, Object> params) {
		session.beginTransaction();
		Object o = session.getNamedQuery(namedQuery).setProperties(params).uniqueResult();
		System.out.println(o);
		System.out.println(params);
		if (o == null) {
			return null;
		}
		Employee e = (Employee) o;
		System.out.println(e.getEmail());
		if (c.isInstance(o)) {
			return c.cast(o);
		}
		return null;
	}
}
