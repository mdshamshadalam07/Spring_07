package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator generator=null;
		
		// Hold spring bean cfg file name and location
		// res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		
		//res=new FileSystemResource("C:\\Users\\Win10\\git\\Spring_07\\04-Spring-IOCProj3-ConstructorInjection\\src\\com\\nt\\cfgs\\applicationContext.xml\\");
		
		//res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		
		res=new ClassPathResource("applicationContext.xml");
		
		//create IOC container
		factory=new XmlBeanFactory(res);
		
		//get target bean class object
		generator=(WishMessageGenerator)factory.getBean("wmg");
		
		//invoke the b.method
		System.out.println(generator.generateWishMessage("Md Shamshad Alam"));
		
	}//main
}//class
