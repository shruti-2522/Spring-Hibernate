package com.SpringCore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

	//@Autowired
	private Address addr;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [addr=" + addr + "]";
	}
	@Autowired
	public Emp(Address addr) {
		super();
		System.out.println("Inside Constructor");
		this.addr = addr;
	}

	public Address getAddr() {
		return addr;
	}

	//@Autowired
	public void setAddr(Address addr) {
		System.out.println("Setting Values");
		this.addr = addr;
	}

}
