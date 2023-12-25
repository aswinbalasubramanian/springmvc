package com.aswin.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aswin.spring.springmvc.dto.Employee;

@Controller
public class ListController {
	
	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Connor");
		employee.setSalary(10500);

		Employee employee1 = new Employee();
		employee1.setId(11);
		employee1.setName("Tyson M");
		employee1.setSalary(1500);

		Employee employee2 = new Employee();
		employee2.setId(1123);
		employee2.setName("Peter MaanKarate");
		employee2.setSalary(12500);

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		modelAndView.addObject("employees", employees);

		return modelAndView;
	}
}
