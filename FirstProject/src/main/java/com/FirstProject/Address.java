package com.FirstProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import java.util.Date;

@Entity
@Table (name="Student_data")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Address_Id")
	private int Addid;
	
	@Column(length=50,name="STREET")
	private String Street;
	
	@Column(length=100,name="CITY")
	private String City;
	
	//it used for column related attributr changing
	@Column(name="is_open")
	private boolean isOpen;
	
	//it used for don't create colum
	@Transient
	private double x;
	
	@Column(name="Added_Date")
	@Temporal(TemporalType.DATE)//it used to set date format without time
	private Date addeDate;
	
	//For large objects
	@Lob
	private byte[] image;

	public Address(int addid, String street, String city, boolean isOpen, double x, Date addeDate, byte[] image) {
		super();
		Addid = addid;
		Street = street;
		City = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addeDate = addeDate;
		this.image = image;
	}

	public int getAddid() {
		return Addid;
	}

	public void setAddid(int addid) {
		Addid = addid;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddeDate() {
		return addeDate;
	}

	public void setAddeDate(Date addeDate) {
		this.addeDate = addeDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
