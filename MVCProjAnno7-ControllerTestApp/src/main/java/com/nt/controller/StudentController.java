package com.nt.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController { 	
	
	@Autowired
	private ServletContext sc;
	
	@Autowired
	private ServletConfig cg;
	
	/*@Autowired
	private HttpSession ses;
	
	@Autowired
	private HttpServletRequest req;
	*/
	
	@RequestMapping("/save")  // GET
	public String saveEmp() { 
		System.out.println("Saving Employee....");
		return "redirect:showEmps";
	}
	
	@RequestMapping("/delete")  // GET
	public String deleteEmp() { 
		System.out.println("delete Employee....");
		return "redirect:showEmps";
	}
	
	@RequestMapping("/showEmps")  // GET
	public String listEmp(HttpSession ses, HttpServletRequest req ) { 
		System.out.println("displaying Employees....");
		System.out.println("web app name : " + sc.getContextPath());
		System.out.println("web app path : " + sc.getRealPath("/"));
		System.out.println("DS logical name : " + cg.getServletName());
		System.out.println("Session Id : + " + ses.getId());
		System.out.println("req uri : " + req.getRequestURI());
		return "show";
	}
}
