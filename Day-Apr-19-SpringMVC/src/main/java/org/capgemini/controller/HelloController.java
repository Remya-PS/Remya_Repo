package org.capgemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView sayHello(){
		String message="Hello World! Welcome To Spring3 MVC";
		
		//1->View page Name
		//2-->Model object name
		//3-->Model Object
		
		return new ModelAndView("helloPage","msg",message);
		
		///WEB-INF/pages/helloPage.jsp
		
	}
	
}
