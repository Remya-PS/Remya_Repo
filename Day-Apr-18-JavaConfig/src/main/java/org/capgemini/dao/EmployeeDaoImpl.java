package org.capgemini.dao;

import java.util.List;

import javax.sql.DataSource;

import org.capgemini.jdbc.Employee;
import org.capgemini.jdbc.EmployeeRow;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao{
	
	
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		jdbcTemplate=new JdbcTemplate(dataSource);
		
	}

	public void createEmployee(Employee employee) {
		
		String sql="insert into employees values(?,?,?)";
		jdbcTemplate.update(sql, new Object[]{employee.getEmployeeId(),employee.getEmpName(),
				employee.getSalary()});
		
	}

	public void deleteEmployee(int empId) {
		String sql="delete from employees where eid=?";
		
		jdbcTemplate.update(sql, empId);
		System.out.println("Deleted");
		
	}

	public void updateEmployee(Employee emp) {
		
		String sql="update employees set ename=?,salary=? where eid=?";
		jdbcTemplate.update(sql,new Object[]{emp.getEmpName(),emp.getSalary(),emp.getEmployeeId()});
		
		System.out.println("Updated");
		
	}

	public Employee searchEmployee(int empId) {
		
		String sql="select * from employees where eid=?";
		Employee emp=jdbcTemplate.queryForObject(sql,new Object[]{empId} , new EmployeeRow());
		
		return emp;
	}

	public List<Employee> getAllEmployees() {
		String sql="select * from employees";
		
		List<Employee> employees= jdbcTemplate.query(sql, new EmployeeRow());
		
		return employees;
	}
	
	
	
	

}














