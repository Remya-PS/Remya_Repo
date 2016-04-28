package org.capgemini.service;

import java.util.List;

import org.capgemini.pojo.Employee;

public interface EmployeeService {
	public void saveEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public void deleteEmployee(Integer employeeId);
	public Employee searchEmployee(Integer employeeId);
}
