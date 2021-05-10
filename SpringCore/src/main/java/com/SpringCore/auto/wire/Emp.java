package com.SpringCore.auto.wire;

public class Emp {

	private Address addr;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [addr=" + addr + "]";
	}

	public Emp(Address addr) {
		super();
		System.out.println("Inside Constructor");
		this.addr = addr;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

}
