package com.nt.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable{
	private String cname;
	private String cadd;
	private float pamt; 
	private float time;
	private float rate;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public float getPamt() {
		return pamt;
	}
	public void setPamt(float pamt) {
		this.pamt = pamt;
	}
	public float getTime() {
		return time;
		
	}
	public void setTime(float time) {
		this.time = time;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	

}
