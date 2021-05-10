package com.SpringCore.LifeCycle;

import javax.annotation.PostConstruct;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("Intializing....");
	}
	
	@PostConstruct
	public void end()
	{
		System.out.println("Ending....");
	}

}
