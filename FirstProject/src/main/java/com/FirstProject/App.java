package com.FirstProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import java.io.FileInputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Project Started..!");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		// SessionFactory factory=new Configuration().configure().buildSessionFactory();

		StudentInfo s1 = new StudentInfo();
		s1.setRoll_no(8);
		s1.setName("DIVYA PATIL");
		s1.setCity("Dhule");
		System.out.println(s1);

		// Address
		Address ad = new Address();
		ad.setStreet("Gangapur Road");
		ad.setCity("Nashik");
		ad.setOpen(true);
		ad.setAddeDate(new Date());
		ad.setX(1234.56);
		
		//Reading Image
		FileInputStream img=new FileInputStream("src/main/java/Friends.jpg");
		byte[] data=new byte[img.available()];
		img.read(data);
		ad.setImage(data);
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(s1);
		session.save(ad);
		session.getTransaction().commit();
		session.close();
		System.out.print("DONE....");
	}
}
