package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> theStudents = new ArrayList<>();
	
	@PostConstruct
	public void loadData() {
		
		Student student = new Student("muthukumar","my");
		Student student1 = new Student("sharath","my1");
		Student student2 = new Student("ballari","my2");
		
		theStudents.add(student);
		theStudents.add(student1);
		theStudents.add(student2);
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return theStudents;
	}
	
	@GetMapping("/student/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		if (studentId >= theStudents.size() || studentId < 0) {
			throw new StudentNotFoundException("Student Id Not Found of " + studentId);
		}
		
		return theStudents.get(studentId);
	}
}