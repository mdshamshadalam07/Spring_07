package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable {
	private Integer srNo;
	private Integer empNo;
	private String empName;
	private String job;
	private Float sal;
}
