package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.studentDao;
import com.spring.jdbc.entities.Student;

public class App {

	public static void main(String[] args) {

		// Spring JDBC("Using annotation and Java")
		ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfig.class);
		JdbcTemplate temp = context.getBean("jdbcTemplate", JdbcTemplate.class);

		/*
		 * //Insert Query String
		 * query="insert into student(id,name,city) values(?,?,?)";
		 * 
		 * //Fire Query: int r=temp.update(query,4,"Pradhunya Shewale","Tehre");
		 * System.out.println("Number Of Record Inserted.."+ r);
		 */
		
		 studentDao studentDao = context.getBean("studentDao", studentDao.class);
		 /* 
		 * // INSERT
		 * 
		 * Student student = new Student(); student.setId(1);
		 * student.setName("Shruti Amrutkar"); student.setCity("Wadne");
		 * 
		 * int result = studentDao.insert(student);
		 * System.out.println("Data Inserted..." + result);
		 */

		// UPDATE
		/*
		 * Student student = new Student(); student.setId(1);
		 * student.setName("Pratik Amrutkar"); student.setCity("Wadne");
		 * 
		 * int res = studentDao.change(student); System.out.println("Data Updated.." +
		 * res);
		 */

		/*
		 * Student student = new Student(); student.setId(1); int res =
		 * studentDao.delete(student); System.out.println("Data Deleted.." + res);
		 */

		/*
		 * Student student=studentDao.getStudent(2); System.out.println(student);
		 */

		List<Student> students = studentDao.getAllstudent();
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
