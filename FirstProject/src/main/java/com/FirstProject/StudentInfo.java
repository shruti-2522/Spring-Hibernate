package com.FirstProject;

import javax.persistence.Entity;
import javax.persistence.Id;

//is used for marking any class as entity
@Entity
public class StudentInfo {
	
	//this notation used for set the primary key
	
	@Id
	private int roll_no;
	private String name;
	private String city;
	private Certificate cert;
	
	public Certificate getCert() {
		return cert;
	}


	public void setCert(Certificate cert) {
		this.cert = cert;
	}


	//Constructor
	public StudentInfo(int roll_no, String name, String city) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.city = city;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.roll_no+" : "+this.name+" : "+this.city;
		
	}


	public int getRoll_no() {
		return roll_no;
	}


	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
