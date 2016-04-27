package org.capgemini.demo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("myBeans.xml");
		
		CollectionDemo lst=(CollectionDemo) context.getBean("collDemo");
		
		Set<Address> names= lst.getNames();
		
		Map<Integer, String> maps= lst.getMaps();
		
		System.out.println(names);
		
		System.out.println(maps);
		
		
		
		
		
		
		
		Properties pros= lst.getProperties();
		
		System.out.println(pros);
		
		
		
		
	}

}
