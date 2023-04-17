package com.demo.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
    private StudentService service;

    @GetMapping("/student")   
    public List<Students> getAllStudents() {
        return service.getall();
    }

}