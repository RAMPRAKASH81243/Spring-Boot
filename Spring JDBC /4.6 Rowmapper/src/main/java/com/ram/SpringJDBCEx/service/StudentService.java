package com.ram.SpringJDBCEx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.SpringJDBCEx.model.Student;
import com.ram.SpringJDBCEx.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository repo;
	
	public StudentRepository getRepo() {
		return repo;
	}

	@Autowired
	public void setRepo(StudentRepository repo) {
		this.repo = repo;
	}



	public void addStudent(Student s) {
		repo.save(s);
		//System.out.println("Added");
	}

	public List<Student> getStudents() {
		return repo.findAll();
	}
	
}
