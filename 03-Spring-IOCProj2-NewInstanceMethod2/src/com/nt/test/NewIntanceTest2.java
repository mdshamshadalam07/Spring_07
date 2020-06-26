package com.nt.test;

import java.lang.reflect.Constructor;

public class NewIntanceTest2 {
	
	public static void main (String args []) {
		Class c1=null;
		Object obj1=null;
		Constructor cons[]=null;
		
		try {	
		//Load the Class
		c1=Class.forName(args[0]);
		
		// get All constructor of the loadded class
		  cons=c1.getDeclaredConstructors();
		  
		// Create the Object
		  obj1=cons[0].newInstance(10,20);
		   	
		// Instantiate the class
		System.out.println(obj1);
		
		System.out.println("-------------------------------------");
	}// try
		
		catch (InstantiationException ie) {
			ie.printStackTrace();
		}
		catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
   }
}