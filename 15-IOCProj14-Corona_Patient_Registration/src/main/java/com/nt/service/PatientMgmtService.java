package com.nt.service;

import com.nt.dto.PatientDTO;

public interface PatientMgmtService {
	public String calculateBillAmount(PatientDTO dto) throws Exception; 		
}