package org.capgemini.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {
	
	@Bean
	@Scope(value="prototype")
	public Course getCourse(){
		return new Course(100, "MCA");
	}
	
	@Bean
	public Student getStudent(){
	return new Student(1, "Tom Jerry", 12,getCourse());
	}

}
