package org.capgemini.jdbc;

public class Employee {
	
	private int employeeId;
	private String empName;
	private double salary;
	
	public Employee(){}
	
	public Employee(int employeeId, String empName, double salary) {
		super();
		this.employeeId = employeeId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	

}
