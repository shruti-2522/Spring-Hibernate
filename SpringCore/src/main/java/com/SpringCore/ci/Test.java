package com.SpringCore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new  ClassPathXmlApplicationContext("com/SpringCore/ci/ciconfig.xml");
	    Pesron p =(Pesron) context.getBean("person1");
	    System.out.println(p);
	    
	    Addition a=(Addition) context.getBean("add");
	   
	    System.out.println(a);
	   
	}

}
