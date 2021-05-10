package com.map;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class mapDemo {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// Creating question:
		Question q1 = new Question();
		q1.setQue_id(1);
		q1.setQuestion("What is Java?");

		// create answeer
		Answer a1 = new Answer();
		a1.setAnsId(5);
		a1.setAns("Java is Programming Language");
		a1.setQue1(q1);

		Answer a2 = new Answer();
		a2.setAnsId(2);
		a2.setAns("Java is most secure programming language");
		a2.setQue1(q1);
		;

		Answer a3 = new Answer();
		a3.setAnsId(3);
		a3.setAns("Java is Obeject orineted");
		a3.setQue1(q1);
		;

//		
//		List<Answer> list=new ArrayList<Answer>();
//		list.add(a1);
//		list.add(a2);
//		list.add(a3);
//		
//		q1.setAns(list);

//		Question q2 = new Question();
//		q2.setQue_id(2);
//		q2.setQuestion("What is Python?");

//		Answer a2 = new Answer();
//		a2.setAnsId(2);
//		a2.setAns("Python is Pllatform Independent");
//		a2.setQue1(q2);
//		

		Session session = factory.openSession();
		session.beginTransaction();
//
//		// FETCHING.....
//
	
//
//		session.save(q1);
//		session.save(a1);
//		session.save(a2);
//		session.save(a3);
//		
		Question q11 = (Question) session.get(Question.class, 1);
		System.out.println(q11.getQue_id());
		System.out.println(q11.getQuestion());
		
		//LAZY LOADING(IT IS DEFAULTLY CALLED)
//		System.out.println(q11.getAns().size());
		
//		
//		  for (Answer a : q11.getAns()) {
//			System.out.println(a.getAns());
//		}
	
		 
//		
//		
//		//FERTCHING DATA
//		Question newQ=(Question) session.get(Question.class,2);
//		System.out.println(newQ.getQuestion());

		session.getTransaction().commit();
		session.close();
		factory.close();

	}

}
