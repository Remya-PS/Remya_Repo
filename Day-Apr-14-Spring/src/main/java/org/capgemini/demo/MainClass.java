package org.capgemini.demo;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		//ApplicationContext context=new FileSystemXmlApplicationContext("D:\\Users\\vidavid\\Desktop\\Beans.xml");
		
		//XmlBeanFactory context=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		
		Employee emp=(Employee)context.getBean("emp");
		
		emp.setEmpName("Jack");
		
		Employee emp1=(Employee)context.getBean("emp");
		
		System.out.println(emp);
		System.out.println(emp1);
		
		
		
		
		
	}

}
