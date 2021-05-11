package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeMgmtService;

@Controller
public class EmployeeController {
	
	@Autowired
	private IEmployeeMgmtService service;

 // @RequestMapping("/welcome")	
	@GetMapping("/welcome")
	public String showHome() {
	  return "home";
	}
	
	// @RequestMapping("/list_Emps")	
		@GetMapping("/list_Emps")
		public String collectAllEmployees(Map<String, Object>map) {
			List<EmployeeDTO> listDTO=service.fetchAllEmps();
			map.put("listDTO", listDTO);
			return "show_emps";
			
		}
}
