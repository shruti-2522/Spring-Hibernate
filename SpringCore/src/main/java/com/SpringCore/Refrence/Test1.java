package com.SpringCore.Refrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/Refrence/Refconfig.xml");
		A a1=(A) context.getBean("aref");
		
		System.out.println(a1.getX());
		System.out.println(a1.getOb().getY());
		System.out.println(a1);
		
	}

}
