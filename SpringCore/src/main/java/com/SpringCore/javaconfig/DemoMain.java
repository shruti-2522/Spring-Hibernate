package com.SpringCore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {
	public static void main(String args[])
	{
	    ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
		Student s=context.getBean("getStudent",Student.class);
		System.out.println(s);
	    s.show();
		}
	
	

}


