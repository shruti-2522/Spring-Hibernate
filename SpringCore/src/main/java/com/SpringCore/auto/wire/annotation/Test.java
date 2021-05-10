package com.SpringCore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/auto/wire/annotation/Autoconfig.xml");
		Emp e1=context.getBean("emp1",Emp.class);
		System.out.println(e1);

	}

}
