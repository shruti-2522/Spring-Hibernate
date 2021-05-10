package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;
	private String Proj_name;
	
	@ManyToMany(mappedBy = "projects")
	private List<Emp> emp1;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String proj_name, List<Emp> emp1) {
		super();
		this.pid = pid;
		Proj_name = proj_name;
		this.emp1 = emp1;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProj_name() {
		return Proj_name;
	}

	public void setProj_name(String proj_name) {
		Proj_name = proj_name;
	}

	public List<Emp> getEmp1() {
		return emp1;
	}

	public void setEmp1(List<Emp> emp1) {
		this.emp1 = emp1;
	}

}
