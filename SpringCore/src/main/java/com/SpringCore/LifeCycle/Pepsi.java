package com.SpringCore.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {

	private int pprice;

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [pprice=" + pprice + "]";
	}

	public void afterPropertiesSet() throws Exception {
		//init method
		System.out.println("Taking Pepsi:Init method");
		
	}

	public void destroy() throws Exception {
		// Destroy Method
		
		System.out.println("Pepsi is buy...");
	}

}
