package org.capgemini.jdbc;

import java.util.List;

import org.capgemini.dao.EmployeeDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("jdbcBeans.xml");
		
		EmployeeDaoImpl employeeDao=(EmployeeDaoImpl) context.getBean("jdbcTemp");
		
		/*Employee emp=new Employee(123, "John", 12000);
		Employee emp1=new Employee(1, "Tom", 45000);
		Employee emp2=new Employee(2, "ram", 67000);
		
		employeeDao.createEmployee(emp);
		employeeDao.createEmployee(emp1);
		employeeDao.createEmployee(emp2);*/
		//employeeDao.deleteEmployee(emp.getEmployeeId());
		
		
		/*Employee emp2=new Employee(2, "Sasi", 5500.0);
		employeeDao.updateEmployee(emp2);*/
		
		/*Employee emp=employeeDao.searchEmployee(452);
		
		System.out.println(emp);*/
		
		List<Employee> employees=employeeDao.getAllEmployees();
		
		for(Employee emp:employees)
			System.out.println(emp);
		
	}

}
