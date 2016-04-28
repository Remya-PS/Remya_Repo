package org.capstore.controller;

import java.text.SimpleDateFormat;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.regexp.internal.recompile;

@Controller
public class ProductController {
	
	
	@RequestMapping("/product")
	public ModelAndView showProductForm(Map<String, Object>maps){
	
		SimpleDateFormat simpleDate=new SimpleDateFormat("dd-MMM-yyyy");
		
		
		
	  return new ModelAndView("product","msg","Hello!!!");		
	}
	
	
	
	

}
