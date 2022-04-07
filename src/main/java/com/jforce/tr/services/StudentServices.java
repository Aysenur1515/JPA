package com.jforce.tr.services;

import java.util.List;

import com.jforce.tr.modal.Student;

public interface StudentServices {
	  List<Student> getList();
	  
	  Student getStudentById(Integer id);
	  
	  void deleteStudentById(Integer id);
	  
	  void addStudent(Student student);
	  void updateStudent (Student student);
}
