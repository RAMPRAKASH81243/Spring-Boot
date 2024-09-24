package com.ram.SpringJDBCEx.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ram.SpringJDBCEx.model.Student;

@Repository
public class StudentRepository {

	public void save(Student s) {
		System.out.println("Added");
		
	}

	public List<Student> findAll() {
		List<Student> students = new ArrayList();
		return students;
	}
	
}
