 package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAO;
import com.nt.dto.CustomerDTO;

public  class CustomerMgmtServiceImpl implements CustomerMgmtService {
	private CustomerDAO dao;
	
	public CustomerMgmtServiceImpl(CustomerDAO dao) {
		System.out.println("CustomerMgmtServiceImpl.CustomerMgmtServiceImpl()");
		this.dao = dao;
	}
	public CustomerMgmtServiceImpl() {
		System.out.println("CustomerMgmtServiceImpl.CustomerMgmtServiceImpl()");
	}
	@Override
	public String calculateIntrestAmount(CustomerDTO dto) throws Exception {
		float intrsAmt = 0.0f;
		CustomerBO bo = null;
		int count =0;
		bo=new CustomerBO();
		intrsAmt = (dto.getPamt()*dto.getRate()*dto.getTime())/100.0f;
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setPamt(dto.getPamt());
		bo.setIntrsamt(intrsAmt);
		
		count =dao.insert(bo);
		if(count==0)
			return "Customer Registration failed :: Amt :: "+dto.getPamt()+"intrest ::"+intrsAmt;
		else 
			return "Customer Registration Succeded :: Amt :: "+dto.getPamt()+"intrest ::"+intrsAmt;
	}

}
