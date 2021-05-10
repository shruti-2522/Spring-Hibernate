package com.SpringCore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/spel/selconfig.xml");
		Demo d1 = context.getBean("demo", Demo.class);

		System.out.println(d1);

//		SpelExpressionParser temp = new SpelExpressionParser();
//
//		org.springframework.expression.Expression ex = temp.parseExpression("22+55");
//		System.out.println(ex.getValue());

	}

}
