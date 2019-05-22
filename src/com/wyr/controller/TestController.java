package com.wyr.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wyr.service.UserService;

@Controller
public class TestController {
	@Resource
	UserService UserService;
	
	@RequestMapping("/test")
	public String test(String name){
		UserService.add(name);
		System.out.println("ÄãºÃ");
		return "index";
	}
}
