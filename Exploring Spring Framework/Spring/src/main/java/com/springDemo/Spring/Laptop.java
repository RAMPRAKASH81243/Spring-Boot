package com.springDemo.Spring;

public class Laptop implements Computer {
	public Laptop(){
		System.out.println("Laptop Object Created");
	}
	
	@Override
	public void compile() {
		System.out.println("compiling using Laptop");
	}
}
