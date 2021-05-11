package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {
	
	// @RequestMapping(value="/")
	@RequestMapping
	public String showhome() { 
		return "home";
	}
	
	@RequestMapping(value="/register")  // GET
	public String saveData1() { 
		return "result1";
	}
	
	/*
	@RequestMapping(value="/register",method=RequestMethod.POST)  // POST
	public String saveData2() {
		return "result2";
	}*/
}
