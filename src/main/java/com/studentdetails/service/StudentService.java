package com.studentdetails.service;

import java.util.List;

import com.studentdetails.entity.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public Student getStudent(Long studentId);
	
	
}
