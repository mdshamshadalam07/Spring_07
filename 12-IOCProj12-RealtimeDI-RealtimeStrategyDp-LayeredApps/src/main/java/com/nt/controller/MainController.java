package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.CustomerMgmtService;
import com.nt.vo.CustomerVO;

public class MainController {
	private CustomerMgmtService service;

	public MainController(CustomerMgmtService service) {
		System.out.println("MainController.MainController()");
		this.service = service;

	}

	public String processCustomer(CustomerVO vo) throws Exception {
		CustomerDTO dto = null;
		String result = null;
		dto=new CustomerDTO();
		dto.setCname(vo.getCname());
		dto.setCadd(vo.getCadd());
		dto.setPamt(Float.parseFloat(vo.getpAmt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		 result= service.calculateIntrestAmount(dto);
		return result;
	}
}
