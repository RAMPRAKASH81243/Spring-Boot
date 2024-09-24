package com.ram.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ram.app.model.Alien;
import com.ram.app.model.Laptop;
import com.ram.app.service.LaptopService;

@SpringBootApplication
public class SpringBootFristApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringBootFristApplication.class, args);
		
		LaptopService service = context.getBean(LaptopService.class);
		
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
	}

}
