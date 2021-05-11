package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;


import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealtimeDITest {
	public static void main(String[] args) {
		
	Scanner sc = null;
	String name = null, cadd= null, pamt=null, rate = null, time = null;
	CustomerVO vo = null;
	DefaultListableBeanFactory factory = null;
	XmlBeanDefinitionReader reader = null;
	MainController controller = null;
	String result = null;
	sc  = new Scanner(System.in);	
    System.out.println ("Enter the Customer  name: ");
    name = sc.next();
    System.out.println ("Enter Customer Address : ");
    cadd = sc.next();
     System.out.println ("Enter Principle Amount : ");
    pamt = sc.next();
    System.out.println ("Enter rate Intrest : ");
    rate = sc.next();
    System.out.println ("Enter time : ");
    time = sc.next();
    
    vo = new CustomerVO();
    vo.setCname(name);
    vo.setCadd(cadd);
    vo.setpAmt(pamt);
    vo.setRate(rate);
    vo.setTime(time);
    
    factory = new DefaultListableBeanFactory();
    reader = new XmlBeanDefinitionReader(factory);
    reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	controller = factory.getBean("controller",MainController.class);
	System.out.println("CCCCCC:::::"+controller);
	
	try {
		 result = controller.processCustomer(vo);
		 System.out.println(result );
	}
	 catch (Exception e) {
		 System.out.println("Internal problem");
		 e.printStackTrace();
		
	}
  }
}	