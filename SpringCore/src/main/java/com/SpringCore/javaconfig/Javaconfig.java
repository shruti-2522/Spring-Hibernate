package com.SpringCore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
//@ComponentScan(basePackages="com.Springcore.Javaconfig")
public class Javaconfig {
	
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	
	@Bean
	public Student getStudent()
	{
		//Creating student obect
		Student student=new Student(getSamosa());
		return student;
	}
	

}
