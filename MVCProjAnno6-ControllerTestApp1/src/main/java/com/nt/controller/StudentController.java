package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController { 	
	@RequestMapping("/register")  // GET
	public String saveStud() { 
		return "result2";
	}
	
	/*
	@RequestMapping(value="/register",method=RequestMethod.POST)  // POST
	public String saveData2() {
		return "result2";
	}*/
}
