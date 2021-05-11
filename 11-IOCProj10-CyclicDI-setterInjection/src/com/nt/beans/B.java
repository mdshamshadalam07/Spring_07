package com.nt.beans;

public class B {
private A a;

/*public B() {
	System.out.println("B:: o-param constuctor");
}

public void setA(A a) {
	System.out.println("B.setA()");
	this.a = a;
}*/

public B(A a) {
	 System.out.println("B:: 1-param constuctor");
	 this.a = a;
}

@Override
public String toString() {
	return "B [a=";
}


	

}
