package org.capgemini.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.capgemini.pojo.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@RequestMapping("/hello")
	public ModelAndView sayHello(){
		return new ModelAndView("hello","message","Hello World!");
	}
	
	@RequestMapping("/empForm")
	public String showEmployeeForm(Map<String, Object> maps){
		
		List<String> departments=new ArrayList<String>();
		departments.add("Sales");
		departments.add("Purchase");
		departments.add("HR");
		departments.add("Finance");
		departments.add("Marketing");
		
		maps.put("employee", new Employee());
		maps.put("departs", departments);
		
		return "employeeForm";
	}
	
	@RequestMapping(value="/showEmployee",method=RequestMethod.POST)
	public String showEmployeeDetails(@ModelAttribute("employee") Employee emp){
		System.out.println(emp);
		return "showEmp";
	}
	
	
	/*public List<String> getAllDepartments(){
		List<String> departments=new ArrayList<String>();
		departments.add("Sales");
		departments.add("Purchase");
		departments.add("HR");
		departments.add("Finance");
		departments.add("Marketing");
		return departments;
	}*/
	
	
	

}
