package org.capgemini.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		Student student=(Student) context.getBean("stud");
		System.out.println(student);
	
		
		context.registerShutdownHook();
	}

}
