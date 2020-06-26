package com.nt.test;

public class NewIntanceTest1 {
	
	public static void main (String args []) {
		Class c1=null;
		Object obj1=null;
		
		try {	
		//Load the Class
		c1=Class.forName(args[0]);
		
		// Instantiate the class
		obj1=c1.newInstance();
		System.out.println(obj1);
	  }
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
