package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements EmployeeMgmtService {
	
	private EmployeeDAO dao;
	
	public EmployeeMgmtServiceImpl(EmployeeDAO dao) {
	this.dao = dao;
	}
	
	@Override
	public String calculateGross_Net_Salary(EmployeeDTO dto) throws Exception {
	float gross_sal=0.0f;
	float net_sal=0.0f;
	EmployeeBO bo=null;
	int count=0;
	
	//calculate gross_sal
			gross_sal=dto.getBasicsal()+(dto.getDa()/100)+(dto.getHra()/100);
			net_sal=gross_sal-(dto.getPf()/100)-(dto.getIt()/100);
	//prepare EmployeeBO object having persistable data
	bo=new EmployeeBO();
	bo.setEname(dto.getEname());
	bo.setJob(dto.getJob());
	bo.setEadd(dto.getEadd());	
	bo.setBasicsal(dto.getBasicsal());
	bo.setGross_sal(gross_sal);
	bo.setNet_sal(net_sal);
	
	//use dao
	count=dao.insert(bo);
	
	//process result
	if (count==0) {	
	return "Employee registration failed :\n:Basic sal :: "+dto.getBasicsal()+"\nGross sal::"+gross_sal+" \nNet sal::"+net_sal;
	}
	else{
      	return "Employee  registration succeded :\n:Basic sal:: "+dto.getBasicsal()+" \nGross sal::"+gross_sal+" \nNet sal::"+net_sal;
	}
  }
}
