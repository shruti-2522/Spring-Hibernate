package com.SpringCore.Collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {

	private String name;
	private List<String> phone_nos;
	private Set<String> addresseas;
	private Map<String, String> courseas;
	private Properties prop1;

	public Emp(String name, List<String> phone_nos, Set<String> addresseas, Map<String, String> courseas,
			Properties prop1) {
		super();
		this.name = name;
		this.phone_nos = phone_nos;
		this.addresseas = addresseas;
		this.courseas = courseas;
		this.prop1 = prop1;
	}

	public Properties getProp1() {
		return prop1;
	}

	public void setProp1(Properties prop1) {
		this.prop1 = prop1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhone_nos() {
		return phone_nos;
	}

	public void setPhone_nos(List<String> phone_nos) {
		this.phone_nos = phone_nos;
	}

	public Set<String> getAddresseas() {
		return addresseas;
	}

	public void setAddresseas(Set<String> addresseas) {
		this.addresseas = addresseas;
	}

	public Map<String, String> getCourseas() {
		return courseas;
	}

	public void setCourseas(Map<String, String> courseas) {
		this.courseas = courseas;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

}
