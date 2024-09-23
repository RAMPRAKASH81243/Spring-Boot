package com.springDemo.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//import java.beans.ConstructorProperties;

@Component
public class Alien {
	
	@Value("21")
	private int age;
	
	//@Qualifier("com2")
	private Computer com;
	
	public Alien() {
		System.out.println(" Alien Object Created");
	}
	
//	@ConstructorProperties({"age","lap"})
//	public Alien(int age, Computer lap) {
//		this.age = age;
//		this.com = lap;
//	}


	public int getAge() {return age;}
	
	public void setAge(int age) {
		//System.out.println("setter called");
		this.age = age;
	}
	
	
	public Computer getCom() {
		return com;
	}
	@Autowired
	@Qualifier("laptop")
	public void setCom(Computer com) {
		this.com = com;
	}

	public void code() {
		System.out.println("Coding");
		com.compile();
	}
}
