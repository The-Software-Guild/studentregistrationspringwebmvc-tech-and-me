package com.softra.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.softra.dto.Student;
import com.softra.service.IService;

@Controller
@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	private IService service;
	
	
	@RequestMapping(value="/enrol.htm", method = RequestMethod.GET)
	public String enrol() {
		//Display the enrollment form
		return "enrolment-form";
	}
	
	@RequestMapping(value="/enrol.htm", method = RequestMethod.POST)
	public String submitEnrolment(@ModelAttribute("stu") Student stu, @RequestParam("id") Integer stuid, Model model) {
		//set id receive from form into stuid field of Student object.
		stu.setStuid(stuid);
		
		//Add the student object to the model so that this object attributes can be access by other page such as success page
		model.addAttribute("stu",stu);
		
		//Send student info to service layer -> dao -> Database
		service.saveEmployee(stu);
		
		System.out.println(stu);
		
		//Display the success page
		return "success";
	}
	
}
