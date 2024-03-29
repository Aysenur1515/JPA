package com.jforce.tr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jforce.tr.modal.Student;
import com.jforce.tr.repository.StudentRepository;

@Service
public class StudentServicesImpl implements StudentServices {
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getList() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {
		return studentRepository.findById(id).get();
	}

	
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);
		
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		studentRepository.save(student);
		
	}

	
	
}
