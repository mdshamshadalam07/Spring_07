package com.nt.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class PatientDTO implements Serializable {
	private String patname;
	private String patadd;
	private float ages;
	private String hospitalname;
	private float billamount;

}
