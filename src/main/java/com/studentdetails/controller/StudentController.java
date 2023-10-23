package com.studentdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.studentdetails.entity.Student;
import com.studentdetails.service.StudentService;

//@RestController

//@RequestMapping("/api")
@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping("/homepage")
//	@ResponseBody          // this annotation gives the response in json / html format
	public String home() {
		return "home";
	}
	@RequestMapping("/allstudents")
	@ResponseBody
	public List<Student> getAllStudents(){
		List<Student> stlist = studentService.getAllStudents();
		System.out.println(stlist);
		return stlist;
	}
	@RequestMapping("/student/{studentId}")
	@ResponseBody
	public Student getStudent(@PathVariable String studentId){
		Student st = studentService.getStudent(Long.parseLong(studentId));
		return st;
	}
}
