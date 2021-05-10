package com.SpringCore.Collections;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/Collections/cconfig.xml");
		Emp e1=(Emp) context.getBean("emp1");
		
		System.out.println(e1.getName());
		System.out.println(e1.getPhone_nos());
		System.out.println(e1.getAddresseas());
		System.out.println(e1.getCourseas());
		System.out.println(e1.getProp1());
		System.out.println(e1.getPhone_nos().getClass().getName());		
	}
}
