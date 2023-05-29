package com.softra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.softra.dao.IDao;
import com.softra.dto.Student;

public class StudentService implements IService {

	@Autowired
	private IDao dao;

	public void saveEmployee(Student stu) {
		dao.saveStudent(stu);

	}

	public void modifyEmployees(Student stu) {
		// TODO Auto-generated method stub

	}

}
