package com.nt.controller;

import com.nt.dto.PatientDTO;
import com.nt.service.PatientMgmtService;
import com.nt.vo.PatientVO;

public class MainController {
	private PatientMgmtService service;
	
	public MainController(PatientMgmtService service) {
		 System.out.println("MainController.MainController()");
	     this.service=service;
	}

	public String processPatient (PatientVO vo) throws Exception {
		PatientDTO dto = null;
		String result = null;
		
		dto= new PatientDTO();
		dto.setPatname(vo.getPatname());
		dto.setPatadd(vo.getPatadd());
		dto.setAges(Float.parseFloat(vo.getAges()));
		dto.setHospitalname(vo.getHospitalname());
		dto.setBillamount(Float.parseFloat(vo.getBillamount()));
		result = service.calculateBillAmount(dto);
		return result;
	}
}
