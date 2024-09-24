package com.ram.SpringJDBCEx.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ram.SpringJDBCEx.model.Student;

@Repository
public class StudentRepository {

	private JdbcTemplate jdbc;
	
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public void save(Student s) {
		String sql ="insert into student (rollno, name, marks) values (?,?,?)";
		int rows =jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());
		System.out.println(rows + " effected");
		//System.out.println("Added");
		
	}

	public List<Student> findAll() {
		
		String sql = "select * from student";
		
		return jdbc.query(sql, (rs, rowNum) -> {
			
			Student s = new Student();
			s.setRollNo(rs.getInt("rollno"));
			s.setName(rs.getString("name"));
			s.setMarks(rs.getInt("marks"));
			
			return s;
	});
		
		//List<Student> students = new ArrayList<>();
		//return students;
	}
	
}
