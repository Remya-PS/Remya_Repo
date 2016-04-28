package org.capgemini.dao;

import java.util.List;

import org.capgemini.pojo.Employee;

public interface EmployeeDao {

	public void saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public void deleteEmployee(Integer employeeId);
	
	public Employee searchEmployee(Integer employeeId);
}
