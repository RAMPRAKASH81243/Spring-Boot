package com.ram.app;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	Laptop laptop;
	public void code() {
		laptop.compile();
	}
}
