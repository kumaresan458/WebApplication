package com.hibernates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private HibernateUtil() {

	}

	private static SessionFactory buildSessionFactory() {
		try {
			if (sessionFactory == null) {
				System.out.println("New SessionFactory was created!!!!");
				return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			} else {
				return sessionFactory;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Session getCurrentSession() {
		if (sessionFactory != null) {
			if (sessionFactory.getCurrentSession() != null && sessionFactory.getCurrentSession().isOpen()) {
				return sessionFactory.getCurrentSession();
			} else {
				return sessionFactory.openSession();
			}
		} else {
			return sessionFactory.openSession();
		}
	}

	public static void closeSession(Session session) {
		try {

			if (session != null) {
				if (session.isOpen()) {
					session.close();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
