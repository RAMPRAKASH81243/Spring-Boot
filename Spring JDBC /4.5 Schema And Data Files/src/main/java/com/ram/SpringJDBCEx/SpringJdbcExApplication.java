package com.ram.SpringJDBCEx;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ram.SpringJDBCEx.model.Student;
import com.ram.SpringJDBCEx.service.StudentService;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringJdbcExApplication.class, args);
		
		Student s = context.getBean(Student.class);
		s.setRollNo(104);
		s.setName("Ram");
		s.setMarks(78);
		
		StudentService service = context.getBean(StudentService.class);
		
		service.addStudent(s);
		
		List<Student> students = service.getStudents();
		System.out.println(students);
		
	}
}
