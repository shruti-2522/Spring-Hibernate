package com.SpringCore.LifeCycle;

public class Samosa {

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	private int price;

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		
		System.out.println("Setting An price..");
		this.price = price;
	}

	public void init() {
		System.out.println("Inside Init Method..");
	}
	
	public void destroy()
	{
	System.out.println("Inside Destroy Method");	
	}
}
