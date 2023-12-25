package com.aswin.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("name", "Kabib N");
		modelAndView.addObject("id", "UFC01");
		modelAndView.addObject("Salary", 10000 );
		return modelAndView;
	}
}
