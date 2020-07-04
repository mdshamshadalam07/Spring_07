package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	//bean property
	private  Date  date;
	
	static {
		System.out.println("WishMessageGenerator.static block");
		System.out.println();
	}

	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator:: 1 -param constructor");
		System.out.println();
		this.date = date;		
	}

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate(-)");	
		this.date = date;
		System.out.println();
	}

	public  String  generateWishMessage(String user) {
		
		 System.out.println("WishMessageGenerator.generateWishMessage() date=="+date);
	     System.out.println();
	     
		 int hour=0;
		 
		//get current hour of the day
		 hour=date.getHours();
		 
		 //generate wish message (b.logic)
		 if(hour<12)
			 return "Good Morning::"+user;
		 
		 else if(hour<16)
			 return "Good Afternoon::"+user;
		 
		 else if(hour<20)
			 return "Good Evening ::"+user;
		 
		 else
			 return "Good Night ::"+user;		
	}
}
