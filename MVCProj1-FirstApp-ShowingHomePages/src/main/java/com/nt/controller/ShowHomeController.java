 package com.nt.controller;



import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ShowHomeController implements Controller {
public ShowHomeController() {
	System.out.println("ShowHomeController.ShowHomeController()");
	// TODO Auto-generated constructor stub
}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("ShowHomeController.handleRequest()");
		Date d =new Date();
		return new ModelAndView("home","sysDate",d);
	}
}
