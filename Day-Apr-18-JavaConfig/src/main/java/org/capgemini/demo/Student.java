package org.capgemini.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	

	private int studentId;
	private String studName;
	private int age;
	
	
	private Course course;
	
	
	public Student(){}
	
	public Student(int studentId, String studName, int age) {
		super();
		this.studentId = studentId;
		this.studName = studName;
		this.age = age;
	}
	
	
	@Autowired
	public Student(int studentId, String studName, int age, Course course) {
		super();
		this.studentId = studentId;
		this.studName = studName;
		this.age = age;
		this.course = course;
	}

	public int getStudentId() {
		return studentId;
	}
	
/*	@Required*/
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studName=" + studName + ", age=" + age + ", course=" + course
				+ "]";
	}

	
	@PostConstruct
	public void bean_init_Method(){
		System.out.println("Bean Initialized");
	}
	
	@PreDestroy
	public void bean_destroy_Method(){
		System.out.println("Bean Destroyed");
	}
	
	
	
	
	
	
	
	
	
	
	

}
