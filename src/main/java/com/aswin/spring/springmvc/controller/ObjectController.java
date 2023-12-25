package com.aswin.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aswin.spring.springmvc.dto.Employee;
@Controller
public class ObjectController {
	@RequestMapping("/readObject")
	public ModelAndView sendObject()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Connor");
		employee.setSalary(10500);
		
		modelAndView.addObject("employee",employee);
		
		return modelAndView;
	}
}
