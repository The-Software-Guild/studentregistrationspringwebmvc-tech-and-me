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
	
	
	@RequestMapping(value="/enroll.htm", method = RequestMethod.GET)
	public String enroll() {
		//Display the enrollment form
		return "enrolment-form";
	}
	
	@RequestMapping(value="/enroll.htm", method = RequestMethod.POST)
	public String submitEnrolment(@ModelAttribute("stu") Student stu, Model model) {
		
		//Add the student object to the model so that this object attributes can be access by view
		model.addAttribute("stu",stu);
		
		//Send student info to service layer -> dao -> Database
		service.saveEmployee(stu);
		
		System.out.println(stu);
		
		//Display the success page
		return "success";
	}
	
}
