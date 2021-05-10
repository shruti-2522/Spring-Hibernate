package com.mappingXML;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		
		Person p1=new Person(1,"Shruti","Dhule","7499549303");
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		s.save(p1);
		
	
		
		
		tx.commit();
		s.close();
		
		factory.close();
		
	}

}
