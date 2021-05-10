package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface studentDao {
	public int insert(Student student);

	public int change(Student student);

	public int delete(Student student);

	public Student getStudent(int i);

	public List<Student> getAllstudent();

}
