package com.SpringCore.javaconfig;

public class Student {
	
	public void show()
	{
      this.samosa.display();
		System.out.println("Student is study");
		

	}
	
	private Samosa samosa;

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	

}
