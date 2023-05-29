package com.softra.dao;

import java.util.List;

import com.softra.dto.Student;

public interface IDao {
	void saveStudent(Student stu);
	void modifyStudent(Student stu);
	public List<Student> getAllStudents();
	public Student getStudentById(int stuid);
	public String getStudentNameById(int stuid);
	
}
