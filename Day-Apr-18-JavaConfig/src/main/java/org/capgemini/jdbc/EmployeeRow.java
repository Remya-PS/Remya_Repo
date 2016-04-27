package org.capgemini.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRow implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int count) throws SQLException {
		
		Employee employee=new Employee();
		employee.setEmployeeId(rs.getInt(1));
		employee.setEmpName(rs.getString(2));
		employee.setSalary(rs.getDouble(3));
		
		return employee;
	}

}
