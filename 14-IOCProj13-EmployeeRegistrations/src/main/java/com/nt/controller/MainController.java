package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtService;
import com.nt.vo.EmployeeVO;

public class MainController {
	
	private EmployeeMgmtService service;
	
	//construtor injection
	public MainController(EmployeeMgmtService service) {
		this.service = service;
	}

		public String processEmployee(EmployeeVO vo) throws Exception {
		EmployeeDTO dto=null;
		String result=null;
		System.out.println(vo);
		//convert VO object to DTO object
		dto=new EmployeeDTO();
		/*	dto.setEname(vo.getEname());
			dto.setJob(vo.getJob());
			dto.setEadd(vo.getEadd());
			dto.setBasicsal(Float.parseFloat(vo.getBasicsal()));
			dto.setDa(Float.parseFloat(vo.getDa()));
			dto.setHra(Float.parseFloat(vo.getHra()));
			dto.setPf(Float.parseFloat(vo.getPf()));
			dto.setIt(Float.parseFloat(vo.getIt()));
			//call service methods
			 * 
		*/
		dto.setEname(vo.getEname());
		dto.setEadd(vo.getEadd());
		dto.setJob(vo.getJob());
		dto.setBasicsal(Float.parseFloat(vo.getBasicsal()));
		dto.setDa(Float.parseFloat(vo.getDa()));
		dto.setHra(Float.parseFloat(vo.getHra()));
	    dto.setIt(Float.parseFloat(vo.getIt()));
	    dto.setPf(Float.parseFloat(vo.getPf()));
		result=service.calculateGross_Net_Salary(dto);
		return result;		
  }
}