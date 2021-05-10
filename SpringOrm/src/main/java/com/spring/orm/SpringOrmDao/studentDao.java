package com.spring.orm.SpringOrmDao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.SpringOrm.entites.Student;

public class studentDao {

	// Save Data
	@Transactional
	public int insert(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}

	// Get Single data(object)
	public Student getStudent(int id) {
		Student s1 = this.hibernateTemplate.get(Student.class, id);
		return s1;
	}

	// get all student(All Rows)
	public List<Student> getAllStudents() {
		List<Student> stud = this.hibernateTemplate.loadAll(Student.class);
		return stud;
	}

	// Deleting the data
	@Transactional
	public void delStudent(int id) {
		Student stud1 = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(stud1);

	}

	// Update student Data
	@Transactional
	public void updateStudent(Student stud) {
		this.hibernateTemplate.update(stud);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	private HibernateTemplate hibernateTemplate;

}
