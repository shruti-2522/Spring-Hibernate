package com.FirstCatche;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.FirstProject.StudentInfo;

public class FirstcatcheExample {
	
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s=factory.openSession();
		
		//By default enabled:
		StudentInfo s1=s.get(StudentInfo.class, 8);
		System.out.println(s1);
		
		System.out.println("...WORKING...");
		
		StudentInfo s2=s.get(StudentInfo.class, 8);
		System.out.println(s2);
		
		System.out.println(s.contains(s2));
		
		
		s.close();
		
		factory.close();
	}

}
