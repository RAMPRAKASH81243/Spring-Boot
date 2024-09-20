package com.springDemo.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj =  context.getBean("alien",Alien.class);
        //obj.setAge(21);
        System.out.println(obj.getAge());
        obj.code();
        //Alien obj2 = (Alien) context.getBean("alien1");
        
        //System.out.println(obj2.age);
        
        //obj2.code();
        
        //Computer com = context.getBean(Computer.class);
        
        //Desktop obj3 = context.getBean(Desktop.class);
    }
}
