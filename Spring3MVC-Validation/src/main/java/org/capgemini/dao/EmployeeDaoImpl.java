package org.capgemini.dao;

import java.util.List;

import org.capgemini.pojo.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveEmployee(Employee employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		Employee emp=(Employee) sessionFactory.getCurrentSession().get(Employee.class, employeeId);
		if(emp!=null)
			sessionFactory.getCurrentSession().delete(emp);
	}

	@Override
	public Employee searchEmployee(Integer employeeId) {
		Employee emp=(Employee) sessionFactory.getCurrentSession().get(Employee.class, employeeId);
		return emp;
	}
	
}
