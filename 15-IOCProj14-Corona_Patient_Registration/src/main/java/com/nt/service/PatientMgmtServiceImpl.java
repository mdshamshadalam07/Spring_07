package com.nt.service;

import com.nt.bo.PatientBO;
import com.nt.dao.PatientDAO;
import com.nt.dto.PatientDTO;

public final class PatientMgmtServiceImpl implements PatientMgmtService {
	private PatientDAO dao;
	
	public PatientMgmtServiceImpl(PatientDAO dao) {
		System.out.println("PatientMgmtServiceImpl.PatientMgmtServiceImpl()");
		this.dao=dao;
	
	}

	@Override
	public String calculateBillAmount(PatientDTO dto) throws Exception {
	
		PatientBO bo =null;
		int count = 0;
	
		
		if (dto.getBillamount() >= 3000) {			
          bo = new PatientBO();
          bo.setPatname(dto.getPatname());
          bo.setPatadd(dto.getPatadd());
          bo.setAges(dto.getAges());
          bo.setHospitalname(dto.getHospitalname());
          bo.setBillamount(dto.getBillamount());
          count=dao.insert(bo);
		}
          if (count ==0)
        	  return "Patient Registration failed :: billAmount :: " + dto.getBillamount();
          else 
        	  return "Patient Registration Succeded :: billAmount :: " + dto.getBillamount();		
	}
}