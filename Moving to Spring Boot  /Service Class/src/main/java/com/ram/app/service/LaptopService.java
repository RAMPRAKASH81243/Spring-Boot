package com.ram.app.service;

import org.springframework.stereotype.Service;

import com.ram.app.model.Laptop;


@Service
public class LaptopService {
	
	
	
	public void addLaptop(Laptop lap) {	
		
		System.out.println("method called");
	}

	public boolean isGoodForProg(Laptop lap) {
		return true;
	}
}
