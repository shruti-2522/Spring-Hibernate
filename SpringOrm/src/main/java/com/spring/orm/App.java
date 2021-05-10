package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.SpringOrm.entites.Student;
import com.spring.orm.SpringOrmDao.studentDao;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		studentDao studentdao = context.getBean("studentDao", studentDao.class);
		/*
		 * Student s = new Student(1, "Shruti Amrutkar", "Dhule"); int r =
		 * studentdao.insert(s); System.out.println("Data Inserted" + r);
		 */

		// Get Input Form user

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {
			System.out.println("PRESS 1 for add new student");
			System.out.println("PRESS 2 for display all student");
			System.out.println("PRESS 3 for get details of single student");
			System.out.println("PRESS 4 for delete student");
			System.out.println("PRESS 5 for update student");
			System.out.println("PRESS 6 for exit");

			try {

				int input = Integer.parseInt(br.readLine());
				/*
				 * if(input==1) { //ADD NEW STUDENT } else if(input==2) { //Display all student
				 * }
				 */

				switch (input) {
				case 1:
					// Add new student
					// Taking input form user
					System.out.println("Enter Student Id:");
					int studId = Integer.parseInt(br.readLine());

					System.out.println("Enter Student Name:");
					String studName = br.readLine();

					System.out.println("Enter Student City");
					String studCity = br.readLine();

					// Creating student object
					Student s = new Student();
					s.setId(studId);
					s.setName(studName);
					s.setCity(studCity);

					// saving student object to databse by calling insert of student dao
					int r = studentdao.insert(s);
					System.out.println("Student Added.." + r);
					System.out.println("************************************");
					System.out.println("");

					break;

				case 2:
					// Display all student
					
					System.out.println("**************************");
					List<Student> allStudents = studentdao.getAllStudents();
					for(Student st:allStudents)
					{
						System.out.println("Id :"+st.getId());
						System.out.println("Name :"+st.getName());
						System.out.println("City :"+st.getCity());
						System.out.println("_______________________________");
					}
					
					System.out.println("************************************");
					break;
				
				case 3:
					// Display single student data
					System.out.println("************************************");
					System.out.println("Enter Student Id:");
					int stud=Integer.parseInt(br.readLine());
					
					Student stud1=studentdao.getStudent(stud);
					System.out.println("Id :"+stud1.getId());
					System.out.println("Name :"+stud1.getName());
					System.out.println("City :"+stud1.getCity());
					System.out.println("_______________________________");
					
					System.out.println("************************************");
					break;

				case 4:
					// Delete student
					System.out.println("**************************");
					System.out.println("Enter Student Id");
					int id=Integer.parseInt(br.readLine());
					
				    studentdao.delStudent(id);
				    System.out.println("Student Deleted..");
				    System.out.println("**************************");
					
					
					break;

				case 5:
					// Update student
					System.out.println("***********************");
					System.out.println("Enter Student Id");
					int id1=Integer.parseInt(br.readLine());
					
					Student newstudent = studentdao.getStudent(id1);
					
					System.out.println("Update Student Name:");
					String name1=br.readLine();
					
					System.out.println("Update Student city");
					String city1=br.readLine();
					
					Student stud2=new Student();
					stud2.setId(id1);
					stud2.setName(name1);
					stud2.setCity(city1);
					
				    studentdao.updateStudent(stud2);
					System.out.println("Student Updated");
					System.out.println("______________________________");
					System.out.println("*******************");
					
					
					
					
					
					break;

				case 6:
					// exit
					go = false;
					break;

				}

			} catch (Exception e) {
				System.out.println("Invalid input try with another one..!!");
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Thank You for using my application");

	}
}
