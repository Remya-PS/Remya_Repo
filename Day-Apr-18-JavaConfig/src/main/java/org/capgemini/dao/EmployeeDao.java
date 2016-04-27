package org.capgemini.dao;

import java.util.List;

import javax.sql.DataSource;

import org.capgemini.jdbc.Employee;

public interface EmployeeDao {
	
	public void setDataSource(DataSource dataSource);
	public void createEmployee(Employee employee);
	
	public void deleteEmployee(int empId);
	
	public void updateEmployee(Employee emp);
	
	public Employee searchEmployee(int empId);
	
	public List<Employee> getAllEmployees();

}
