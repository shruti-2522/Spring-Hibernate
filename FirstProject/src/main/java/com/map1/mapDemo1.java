package com.map1;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class mapDemo1 {
public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		//Create Employes:
		
		Emp e1=new Emp();
		Emp e2=new Emp();
		
		e1.setEmp_id(1);
		e1.setEmp_name("Vishkha Ahire");
		
		e2.setEmp_id(2);
		e2.setEmp_name("Hitesh Ahire");
		
		
		//Create Projects:
		Project p1=new Project();
		Project p2=new Project();
		
		p1.setPid(1);
		p1.setProj_name("Ansroid College Attendence System");
		
		p2.setPid(2);
		p2.setProj_name("Flash Flex Music Player");
		
		//Create List
		
		List<Emp> l1=new ArrayList<Emp>();
		List<Project> l2=new ArrayList<Project>();
		
		l1.add(e1);
		l1.add(e2);
		
		
		l2.add(p1);
		l2.add(p2);
		
		e1.setProjects(l2);
		p2.setEmp1(l1);
		
		Session s1=factory.openSession();
		s1.beginTransaction();
		
		s1.save(e1);
		s1.save(e2);
		s1.save(p1);
		s1.save(p2);
		s1.getTransaction().commit();
		s1.close();
		
		
		factory.close();
	}

}
