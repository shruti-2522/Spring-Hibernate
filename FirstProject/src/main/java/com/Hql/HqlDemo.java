package com.Hql;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.FirstProject.StudentInfo;

public class HqlDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();

		// HQL SYNTAX:

		// String query="from StudentInfo where city='Malegaon'";

		// Dynamic :
		//String query = "from StudentInfo where city=:x";
		
		//Alise
		String query = "from StudentInfo as s1 where s1.city=:x and s1.name=:n";
		
		Query q1 = s.createQuery(query);
		
		q1.setParameter("x", "Pachora");
		q1.setParameter("n", "Nikita Morankar");

		// Single-unique and
		// Multiple-list

		List<StudentInfo> list = q1.getResultList();
		for (StudentInfo stud : list) {
			System.out.println(stud.getName() + ":" + stud.getCert().getCourse());
		}
		
		
		System.out.println("-----DELETE QUERY-----");
		
		org.hibernate.Transaction tx=s.beginTransaction();
//        Query q2=s.createQuery("delete from StudentInfo as s2 where s2.city=:x");
//        q2.setParameter("x", "Pachora");
//        
//       
//        int r=q2.executeUpdate();
//        System.out.println("Deleted");
//        System.out.println(r);
		
		System.out.println("------UPDATE QUERY-----");
		Query q2=s.createQuery("update StudentInfo set city=:c where name=:n");
		q2.setParameter("c", "Tehre");
		q2.setParameter("n", "Pradhunya Shewale");
		
		int r=q2.executeUpdate();
	
		System.out.println(r+" Data Updated");
		
		
		//HOW TO EXCEUCTE JOIN QUERY
		Query q3=s.createQuery("select q.Question,q.QuestionId,a.Answer from Question as q INNER JOIN q.ans as a");
		List<Object []> list1=q3.getResultList();
		
		for(Object[] arr:list1)
		{
		System.out.println(Arrays.toString(arr));	
		}
		
		
        tx.commit();

		s.close();

		factory.close();

	}
}