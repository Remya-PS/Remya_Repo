package org.capgemini.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.capgemini.pojo.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/emp")
public class DemoController {
	
	@RequestMapping(value="/empForm",method=RequestMethod.GET,
			produces={"application/json"})
	public String empForm(Map<String, Object> map){
		
		map.put("msg","This is Employee Form");
		map.put("emp",  sendEmployee());
		return "employeeForm";
	}
	
	
	
	@RequestMapping(value="/empContent",method=RequestMethod.GET,
			produces={"application/json"})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Employee sendEmployee(){
		Employee employee=new Employee();
		employee.setEmpId(1001);
		employee.setFirstName("Tom");
		employee.setLastName("Jerry");
		employee.setSalary(23000);
		
		return employee;
	}
	
	
	/*public Employee sendEmployee(){
		Employee employee=new Employee();
		employee.setEmpId(1001);
		employee.setFirstName("Tom");
		employee.setLastName("Jerry");
		employee.setSalary(23000);
		
		return employee;
	}*/
	
	
	@RequestMapping(value="/departContent",method=RequestMethod.GET,
			produces={"application/json"})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<String> getAllDepartments(){
		List<String> departs=new ArrayList<>();
		
		departs.add("Sales");
		departs.add("Purchase");
		departs.add("Finance");
		departs.add("Marketing");
		departs.add("HR");
		return departs;
	}
	
	
	
}
