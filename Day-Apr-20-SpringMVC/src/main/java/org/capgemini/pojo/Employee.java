package org.capgemini.pojo;

import java.util.Date;

public class Employee {
	
	private int empId;
	private String firstName;
	private String lastName;
	private String emailId;
	private double salary;
	private int age;
	private Date empDob;
	private Date empDoj;
	private String empPassword;
	private String department;
	
	public Employee(){}
	public Employee(int empId, String firstName, String lastName, String emailId, double salary, int age, Date empDob,
			Date empDoj, String empPassword, String department) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.salary = salary;
		this.age = age;
		this.empDob = empDob;
		this.empDoj = empDoj;
		this.empPassword = empPassword;
		this.department = department;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getEmpDob() {
		return empDob;
	}
	public void setEmpDob(Date empDob) {
		this.empDob = empDob;
	}
	public Date getEmpDoj() {
		return empDoj;
	}
	public void setEmpDoj(Date empDoj) {
		this.empDoj = empDoj;
	}
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", salary=" + salary + ", age=" + age + ", empDob=" + empDob + ", empDoj=" + empDoj
				+ ", empPassword=" + empPassword + ", department=" + department + "]";
	}
	
	
	

}
