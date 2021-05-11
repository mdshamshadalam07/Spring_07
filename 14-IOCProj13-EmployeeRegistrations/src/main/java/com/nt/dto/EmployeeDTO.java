package com.nt.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class EmployeeDTO implements Serializable {
	
	private String ename;
	private String job;
	private String eadd;
	private Float basicsal;
	private Float da;
	private Float hra;
	private Float pf;
	private Float it;
	
}