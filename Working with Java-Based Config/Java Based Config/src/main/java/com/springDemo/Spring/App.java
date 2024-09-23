package com.springDemo.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.AppConfig;

public class App {
    public static void main(String[] args) 
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);	
    	
    	Desktop dt = context.getBean(Desktop.class);
    	dt.compile();
    	
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring.xml"); Alien obj =
		 * context.getBean("alien",Alien.class); obj.setAge(21);
		 * System.out.println(obj.getAge()); obj.code(); Alien obj2 = (Alien)
		 * context.getBean("alien1");
		 * 
		 * System.out.println(obj2.getAge());
		 * 
		 * obj2.code();
		 * 
		 * Computer com = context.getBean(Computer.class);
		 * 
		 * Desktop obj3 = context.getBean(Desktop.class);
		 */
    }
}
