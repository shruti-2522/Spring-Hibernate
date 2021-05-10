import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.bytecode.enhance.spi.interceptor.SessionAssociableInterceptor;
import org.hibernate.cfg.Configuration;

import com.FirstProject.Certificate;
import com.FirstProject.StudentInfo;

public class StateDemo {
	public static void main(String[] args) {
		
		//Practical Of Hibernate Staates:
		//1.Transient
		//2.Persistant
		//3.Detached
		//4.Removed
		
		System.out.println("Object States..");
		
		
		//Create Session Factory:
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//Creating Student
		 StudentInfo s1=new StudentInfo();
		 s1.setRoll_no(11);
		 s1.setName("Vrushali Suryawanshi");
		 s1.setCity("Dhule");
		 s1.setCert(new Certificate("PHP frameworks","2 months"));
		//Students are in Transient State
		 
		 Session s=factory.openSession();
		 s.beginTransaction();
		 s.save(s1);
		 //Students Are in persistent state-session,databse
		 s1.setName("Vrush Surywanshi");
		 s.getTransaction().commit();
		 
		 s.close();
		 s1.setName("Pradhunya Shewale");
		 
		 //Student Detached State:
		 System.out.println(s1);
		 
		
		factory.close();
	}

}
