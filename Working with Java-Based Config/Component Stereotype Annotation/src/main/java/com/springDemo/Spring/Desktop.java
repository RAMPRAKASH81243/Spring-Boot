package com.springDemo.Spring;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
	public Desktop() {
		System.out.println("Desktop Object Created..");
	}
	@Override
	public void compile() {
		System.out.println("compiling using Desktop");
	}
}
