package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.A;
import com.nt.beans.B;

	public class CyclicDITest {

		public static void main(String[] args) {
			DefaultListableBeanFactory factory  = null; 
			XmlBeanDefinitionReader reader = null;
		
			 A a1 = null;
			 B b1 = null;
			 // create container
			 factory = new  DefaultListableBeanFactory();
		 //	 create reader 
			 reader  = new XmlBeanDefinitionReader(factory); 
		// load  bean definiton	 
			 reader.loadBeanDefinitions("com/nt/cfs/appliactionContext.xml");
			 
			 a1 = factory.getBean("a1",A.class);
             System.out.println(a1);
             
//             b1 = factory.getBean("b1",B.class);
//             System.out.println(b1);
			
		}
	}