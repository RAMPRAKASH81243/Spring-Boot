package com.ram.app.repository;

import org.springframework.stereotype.Repository;

import com.ram.app.model.Laptop;

@Repository
public class LaptopRepository {
	public void save(Laptop lap) {
		System.out.println("Saved in Database..");
	}
}
