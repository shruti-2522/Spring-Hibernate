package com.SpringCore.Standdalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/Standdalone/collections/aloneconfig.xml");
		Pesron p1=context.getBean("person1",Pesron.class);
		System.out.println(p1);
		System.out.println(p1.getFreinds().getClass().getName());
		System.out.println(".....................");
		System.out.println(p1.getFees());
	    System.out.println(p1.getFees().getClass().getName());
	    System.out.println("................");
	    System.out.println(p1.getProp1());
	}

}
