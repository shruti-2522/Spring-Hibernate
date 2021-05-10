package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.spring.jdbc.dao.studentDao;
import com.spring.jdbc.dao.studentDaoImpl;

@Configuration
@ComponentScan(basePackages={"com.spring.jdbc.dao"})
public class jdbcConfig {

	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds1 = new DriverManagerDataSource();
		ds1.setDriverClassName("com.mysql.jdbc.Driver");
		ds1.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds1.setUsername("root");
		ds1.setPassword("");
		return ds1;

	}

	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate temp = new JdbcTemplate();
		temp.setDataSource(getDataSource());
		return temp;
	}
	/*
	 * @Bean("studentDao") public studentDao getStudentDao() { studentDaoImpl stud =
	 * new studentDaoImpl(); stud.setJdbcTemplate(getTemplate()); return stud; }
	 */
}
