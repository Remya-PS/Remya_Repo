package org.capgemini.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		//AbstractApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student student=context.getBean(Student.class);
		
		Course course=context.getBean(Course.class);
		
		Course course1=context.getBean(Course.class);
		
		course.setCourseId(444);
		
		System.out.println(course);
		System.out.println(course1);
		System.out.println(student);
		//context.registerShutdownHook();
	}

}
