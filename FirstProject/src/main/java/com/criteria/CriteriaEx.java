package com.criteria;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.FirstProject.StudentInfo;

public class CriteriaEx {
	public static void main(String[] args) {

		Session s = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory().openSession();
		org.hibernate.Criteria c = s.createCriteria(StudentInfo.class);
		// c.add(Restrictions.eq("cert.course","Android Course"));
		// c.add(Restrictions.gt("roll_no",9));
		c.add(Restrictions.like("cert.course", "Android%"));

		List<StudentInfo> l1 = c.list();

		for (StudentInfo s1 : l1) {
			System.out.println(s1);
		}

		s.close();
	}

}
