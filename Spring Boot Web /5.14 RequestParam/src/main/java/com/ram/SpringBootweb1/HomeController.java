package com.ram.SpringBootweb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("home method called");
		return "index.jsp";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1")int a, @RequestParam("num2")int b, HttpSession session) {
		
		int result= (a+b)*2;
		session.setAttribute("result", result);
		return "result.jsp";
	}
}
