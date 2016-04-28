package org.capgemini.pojo;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="emp_info")
public class Employee {
	
	@Id
	@Generated
	private int empId;
	@NotEmpty(message="*Please enter FirstName.")
	private String firstName;
	
	
	private String lastName;
	
	@Range(min=2000,max=200000,message="*Salary should be between 2000 and 2lak.")
	private double salary;
	
	@Min(value=25,message="*Please enter age greater than 25.")
	private int age;
	
	@DateTimeFormat(pattern="dd-MMM-yyyy",iso=ISO.DATE)
	@Past(message="* Please enter past Date.")
	private Date empDob;
	
	
	@Column(name="employeeDoj")
	@DateTimeFormat(pattern="dd-MMM-yyyy",iso=ISO.DATE)
	@Future(message="* Please enter future date.")
	private Date empDoj;
	
	@NotEmpty(message="*Please Enter Email.")
	@Email(message="*Please enter valid Email.")
	private String email;
	
	public Employee(){}
	
	public Employee(int empId, String firstName, String lastName, double salary, int age, Date empDob, Date empDoj) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.age = age;
		this.empDob = empDob;
		this.empDoj = empDoj;
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
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Employee(int empId, String firstName, String lastName, double salary, int age, Date empDob, Date empDoj,
			String email) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.age = age;
		this.empDob = empDob;
		this.empDoj = empDoj;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", age=" + age + ", empDob=" + empDob + ", empDoj=" + empDoj + ", email=" + email + "]";
	}

	
	

}
