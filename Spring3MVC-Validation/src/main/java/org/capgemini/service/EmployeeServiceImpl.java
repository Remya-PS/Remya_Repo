package org.capgemini.service;

import java.util.List;

import org.capgemini.dao.EmployeeDao;
import org.capgemini.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;
	
	@Transactional
	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);
	}

	@Transactional
	public List<Employee> getAllEmployees() {
		
		return employeeDao.getAllEmployees();
	}

	@Transactional
	public void deleteEmployee(Integer employeeId) {
		employeeDao.deleteEmployee(employeeId);
	}

	@Transactional
	public Employee searchEmployee(Integer employeeId) {
		
		return employeeDao.searchEmployee(employeeId);
	}

}
