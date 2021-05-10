package com.cascade;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class CascadeExample {
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s=factory.openSession();
		
		Question q1=new Question();
		q1.setQue_id(15);
		q1.setQuestion("What is Progarmming...");
		
		
		Answer a1=new Answer(21,"First Answer");
		Answer a2=new Answer(22,"Seocnd");
		Answer a3=new Answer(23,"Third answeer");
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		
		q1.setAns(list);
		s.beginTransaction();
		s.save(q1);
		
		
		s.getTransaction().commit();;
		
		
		
		
		s.close();
		factory.close();
	}

}
