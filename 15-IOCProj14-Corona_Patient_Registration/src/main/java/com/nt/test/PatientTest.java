package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.PatientVO;

public class PatientTest {
	public static void main(String[] args) {
		Scanner sc = null;
		String name = null, patadd=null, patages = null, pathospitalname=null, patbillamount=null;
		PatientVO vo = null;
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		MainController controller = null;
		String result = null;
		
		sc =  new Scanner(System.in);
		System.out.println("Enter Patient name");
		name= sc.nextLine();
		
		System.out.println("Enter Patient Address");
		patadd= sc.nextLine();
		
		System.out.println("Enter Patient Ages");
		patages= sc.nextLine();
		
		System.out.println("Enter Hospital name");
		pathospitalname= sc.nextLine();
		
		System.out.println("Enter Bill Amount");
		patbillamount= sc.next();
		
		vo= new PatientVO();
		vo.setPatname(name);
		vo.setPatadd(patadd);
		vo.setAges(patages);
		vo.setHospitalname(pathospitalname);
		vo.setBillamount(patbillamount);
	    
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	    controller=factory.getBean("patcontroller", MainController.class);
	    try {
		result = controller.processPatient(vo);
		System.out.println(result );	
	}
	    catch (Exception e) {
			System.out.println("Internal Problem");
			e.printStackTrace();
	    }
	 }
}
