package com.softra.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.softra.dto.Student;

public class StudentDAO implements IDao {
	
	@Autowired
	private JdbcTemplate template;

	public void saveStudent(Student stu) {
		String sql = "INSERT INTO student VALUES(?,?,?)";
		template.update(sql,stu.getStuid(),stu.getFname(),stu.getLname());
	}

	public void modifyStudent(Student stu) {
		// TODO Auto-generated method stub

	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public Student getStudentById(int stuid) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getStudentNameById(int stuid) {
		// TODO Auto-generated method stub
		return null;
	}

}
