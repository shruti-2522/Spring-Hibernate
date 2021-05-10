package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

//AUTOWIRING:
@Component("studentDao")
public class studentDaoImpl implements studentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {

		// Insert Query
		String query = "insert into student(id,name,city)values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());

		return r;
	}

	public int change(Student student) {

		// Update Query

		String query1 = "update student set name=?,city=? where id=?";
		int res = this.jdbcTemplate.update(query1, student.getName(), student.getCity(), student.getId());

		return res;
	}

	@Override
	public int delete(Student student) {
		// Delete Query

		String query2 = "delete from student where id=?";
		int res = this.jdbcTemplate.update(query2, student.getId());
		return res;
	}

	@Override
	public Student getStudent(int studentId) {
		// Select Single Data
		String query3 = "select * from student where id=?";

		// RowMapper is Inteface

		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query3, rowMapper, studentId);

		return student;
	}

	@Override
	public List<Student> getAllstudent() {
		// Select Multiple Data
		String query4 = "select * from student";
		List<Student> student = this.jdbcTemplate.query(query4, new RowMapperImpl());
		return student;
	}

}
