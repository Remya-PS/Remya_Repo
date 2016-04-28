package org.capgemini.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.capgemini.pojo.Employee;
import org.capgemini.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	private Employee searchEmployee=null;

	@RequestMapping("/empForm")
	public String showEmpForm(Map<String, Object> maps){
		SimpleDateFormat myFormat=new SimpleDateFormat("dd-MMM-yyyy");
		List<Employee> employees= employeeService.getAllEmployees();
		maps.put("emps",employees);
		maps.put("empSearch",searchEmployee);
		maps.put("emp",new Employee());
		
		if(searchEmployee!=null){
		maps.put("emp", searchEmployee);
		Date empDob=searchEmployee.getEmpDob();
		Date empDoj=searchEmployee.getEmpDoj();
			if(empDob!=null)
			{		
					String dob=myFormat.format(empDob);
					maps.put("edob", dob);
			}
			if(empDoj!=null){
				String doj=myFormat.format(empDoj);
				maps.put("edoj", doj);
			}
			
		}
		 return "employee";
	}
	
	
	@RequestMapping(value={"/showEmployee","/updateEmployee"},method=RequestMethod.POST)
	public String showEmpDetails(Map<String, Object> map,
			@Valid @ModelAttribute("emp") Employee emp, BindingResult result){
		List<Employee> employees= employeeService.getAllEmployees();
		map.put("emps",employees);
		map.put("empSearch",searchEmployee);
		if(result.hasErrors()){
			//System.out.println("Search Object:" + searchEmployee);
			//System.out.println(result);
			return "employee";
		}
		else{
			searchEmployee=null;
			employeeService.saveEmployee(emp);
			return "redirect:/empForm";
		}
	}
	
	
	
	@RequestMapping("/deleteEmployee/{empId}")
	public String deleteEmployee(@PathVariable("empId") Integer empId){
		employeeService.deleteEmployee(empId);
		return "redirect:/empForm";
	}
	
	@RequestMapping("/updateEmployee/{empId}")
	public String  updateEmployee(@PathVariable("empId") Integer empId){
		Employee emp=employeeService.searchEmployee(empId);
		searchEmployee=emp;
		 //System.out.println(emp);
		return"redirect:/empForm";
	}
	
	
	

	
}