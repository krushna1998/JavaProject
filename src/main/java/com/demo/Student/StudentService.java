package com.demo.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private StudentRepository repository;
	
	public StudentService(StudentRepository repository) {
		this.repository=repository;
	}
	
	//List<Student> list =new ArrayList<>();
	
	public List<Students> getall () {
		List<Students> st=repository.findAll();
		return st;
	}
	

}

