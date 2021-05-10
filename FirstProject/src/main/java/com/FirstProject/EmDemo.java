package com.FirstProject;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		StudentInfo stud1=new StudentInfo();
		stud1.setRoll_no(8);
		stud1.setName("Vrushali Surywanshi");
		stud1.setCity("Malegaon");
		
		Certificate c1=new Certificate();
		c1.setCourse("Hibernate Course");
		c1.setDuration("10 days");
		
		StudentInfo stud2=new StudentInfo();
		stud2.setRoll_no(9);
		stud2.setName("Hitesh Ahire");
		stud2.setCity("Dabli");
		
		Certificate c2=new Certificate();
		c2.setCourse("Spring Course");
		c2.setDuration("15 days");
		
		StudentInfo stud3=new StudentInfo();
		stud3.setRoll_no(10);
		stud3.setName("Nikita Morankar");
		stud3.setCity("Pachora");
		
		Certificate c3=new Certificate();
		c3.setCourse("Java Course");
		c3.setDuration("50 days");
		

		StudentInfo stud4=new StudentInfo();
		stud4.setRoll_no(11);
		stud4.setName("Pradhunya Shewale");
		stud4.setCity("Malegaon");
		
		Certificate c4=new Certificate();
		c4.setCourse("Android Course");
		c4.setDuration("40 days");
		
		
		stud1.setCert(c1);
		stud2.setCert(c2);
		stud3.setCert(c3);
		stud4.setCert(c4);
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(stud1);
		session.save(stud2);
		session.save(stud3);
		session.save(stud4);
		session.getTransaction().commit();
		
		System.out.print("DONE....");
		
		//objects save
	
		session.close();
		factory.close();
		
	}

}
