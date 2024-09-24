package com.ram.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.app.model.Laptop;
import com.ram.app.repository.LaptopRepository;

@Service
public class LaptopService {
	
	@Autowired
	private LaptopRepository repo;
	
	public void addLaptop(Laptop lap) {	
		repo.save(lap);
		System.out.println("method called");
	}

	public boolean isGoodForProg(Laptop lap) {
		return true;
	}
}
