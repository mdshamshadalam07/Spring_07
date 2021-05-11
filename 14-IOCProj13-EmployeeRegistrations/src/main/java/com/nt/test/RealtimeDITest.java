package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class RealtimeDITest {
	public static void main(String[] args) throws Exception {
		
	Scanner sc = null;
	String name = null, job = null,eadd= null, basicsal=null, da=null,hra=null,pf=null,it=null;;
	EmployeeVO vo = null;
	DefaultListableBeanFactory factory = null;
	XmlBeanDefinitionReader reader = null;
	MainController controller = null;
	String result = null;
	sc  = new Scanner(System.in);	
    System.out.println ("Enter the Employee  name: ");
    name = sc.next();
    System.out.println ("Enter the Employee  Job: ");
    job = sc.next();
    System.out.println ("Enter  Employee Address : ");
    eadd = sc.next();
     System.out.println ("Enter basic salary  : ");
     basicsal = sc.next();
    System.out.println ("Enter gross DA  : ");
    da = sc.next();
    System.out.println ("Enter net HRA: ");
    hra = sc.next();
    System.out.println ("Enter net IT: ");
    it = sc.next();
    System.out.println ("Enter net PF: ");
    pf = sc.next();
    
    vo = new EmployeeVO();
   vo.setEname(name);
   vo.setJob(job);
   vo.setEadd(eadd);
   vo.setBasicsal(basicsal);
   vo.setHra(hra);
   vo.setDa(da);
   vo.setIt(it);
   vo.setPf(pf);
    
    factory = new DefaultListableBeanFactory();
    reader = new XmlBeanDefinitionReader(factory);
    reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
    controller=factory.getBean("controller", MainController.class);
	result = controller.processEmployee(vo);
	System.out.println(result );	
  }
}	