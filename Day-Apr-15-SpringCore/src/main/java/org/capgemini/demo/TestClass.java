package org.capgemini.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		Customer customer=(Customer) context.getBean("cust");
		
		System.out.println(customer);
		
		context.registerShutdownHook();
		
	}

}
