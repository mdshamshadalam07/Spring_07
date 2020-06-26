package com.nt.comp;

public class Test {
	
	static {
		System.out.println("Test:: Static Block");
	}
	
	public Test() {
		System.out.println("Test:: 0-Param constructor");
	}
	
	@Override
	public String toString() {
		return "Test[]";
	}
}
