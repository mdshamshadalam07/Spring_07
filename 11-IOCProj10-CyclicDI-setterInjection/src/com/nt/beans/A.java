package com.nt.beans;

public class A {
	private B b;

	/*public A() {
	 System.out.println("A:: o-param constuctor");
	}*/
	
	/*public void setB(B b) {
		System.out.println("A.setB()");
		this.b = b;
	}
	*/
       
	public A(B b) {
		 System.out.println("A:: 1-param constuctor");
		 this.b = b;
	}
	
	@Override
	public String toString() {
		return "A [b=";
	}
}
