package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
	private int Emp_id;
	private String Emp_name;

	@ManyToMany
	private List<Project> projects;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int emp_id, String emp_name, List<Project> projects) {
		super();
		Emp_id = emp_id;
		Emp_name = emp_name;
		this.projects = projects;
	}

	public int getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}
