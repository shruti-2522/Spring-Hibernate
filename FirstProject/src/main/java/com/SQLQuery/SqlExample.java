package com.SQLQuery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.FirstProject.StudentInfo;

public class SqlExample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();

		Session s = factory.openSession();

		// SQL QUERIES:
		String q = "Select * from StudentInfo";
		NativeQuery n1 = s.createSQLQuery(q);

		List<Object[]> list = n1.list();

		for (Object[] s1 : list) {
			System.out.println(s1[4] + ":" + s1[3]);

		}

		s.close();
		factory.close();
	}

}
