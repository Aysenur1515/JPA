package com.jforce.tr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.tr.modal.Student;
import com.jforce.tr.services.StudentServices;

@RestController
public class StudentController {
	
	@Autowired
	StudentServices studentServices;
	
	@RequestMapping(path = "/getStudentList" , method = RequestMethod.GET)
	public List<Student> getListStudents(){
		return studentServices.getList();
	}
	
	@RequestMapping(path = "/getStudentById/{id}", method =RequestMethod.GET)
	public Student getStudent(@PathVariable("id") Integer id) {
		return studentServices.getStudentById(id);
		
		
		
	}
	
	@RequestMapping(path = "deleteStudentById/{id}" , method = RequestMethod.DELETE)
	public String deleteStudent(@PathVariable("id") Integer id) {
		studentServices.deleteStudentById(id);
		System.out.println("silindi..");
		return "silindi";
	}
	
	@RequestMapping(path = "addStudent" , method = RequestMethod.PUT )
	public void addStudent(@RequestBody Student student) {
		studentServices.addStudent(student);
	
	}
	@RequestMapping(path = "updateStudent" , method = RequestMethod.PUT)
	public void updateStudent(@RequestBody Student student) {
		studentServices.updateStudent(student);
		
	}
}
