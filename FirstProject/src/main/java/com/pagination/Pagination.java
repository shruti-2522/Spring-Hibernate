package com.pagination;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.FirstProject.StudentInfo;

public class Pagination {
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=factory.openSession();
		
		Query<StudentInfo> q1=s.createQuery("from StudentInfo",StudentInfo.class);
		
		
		//CREATE PAGINATION
		q1.setFirstResult(0);
		q1.setMaxResults(5);
		
		List<StudentInfo> list=q1.list();
		
		for(StudentInfo s1:list)
		{
			System.out.println(s1.getRoll_no()+" :"+s1.getName()+" : "+s1.getCity());
		}
		
		
		s.close();
		factory.close();
		
	}

}
