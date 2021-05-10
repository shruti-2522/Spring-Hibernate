package com.secondCatche;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
import org.hibernate.cfg.Configuration;

import com.FirstProject.StudentInfo;

public class SecincatcheExampple {

	public static void main(String[] args) {
	

		SessionFactory factory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s1 = factory.openSession();
		//First
		StudentInfo stud1=s1.get(StudentInfo.class, 9);
		System.out.println(stud1);

		s1.close();

		Session s2 = factory.openSession();
		
		//second
		StudentInfo stud2=s2.get(StudentInfo.class, 9);
		System.out.println(stud2);

		s2.close();

	}

}
