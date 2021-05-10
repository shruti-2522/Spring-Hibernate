package com.FirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
	public static void main(String[] args) {

		// get,load

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		// get student data through ID

		// load
		StudentInfo stud1 = (StudentInfo) session.load(StudentInfo.class, 8);
		StudentInfo stud3 = (StudentInfo) session.load(StudentInfo.class, 8);

		System.out.println(stud1);

		// get method
//	  StudentInfo stud=(StudentInfo)session.get(StudentInfo.class,8);
//	  System.out.println(stud);
//	  
//	  StudentInfo stud2=(StudentInfo)session.get(StudentInfo.class,8);
//	  System.out.println(stud2);

//	  Address ad1=(Address)session.get(Address.class, 1);
//	  System.out.println(ad1.getStreet()+" : "+ad1.getCity());
		session.close();
		factory.close();

	}

}
