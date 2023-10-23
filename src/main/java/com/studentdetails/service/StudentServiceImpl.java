package com.studentdetails.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.studentdetails.entity.Student;
@Service
public class StudentServiceImpl implements StudentService {

	List<Student> list;
	
	
	public StudentServiceImpl() {
		list = new ArrayList<>();
		list.add(new Student(101,"ravi","ME"));
		list.add(new Student(102,"hira","cs"));
		list.add(new Student(103,"raja","ee"));

	}


	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Student getStudent(Long studentId) {
		// TODO Auto-generated method stub
		Student s= null;
		for(Student s1 :list) {
			if(s1.getId()== studentId) {
				s= s1;
				break;
			}
		}
		return s;
	}

}
