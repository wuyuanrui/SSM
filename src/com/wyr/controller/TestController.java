package com.wyr.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wyr.service.UserService;

@Controller
public class TestController {
	@Resource
	UserService UserService;
	
	@RequestMapping("/test")
	@ResponseBody
	public String test(@RequestBody String name){
		
		return name;
	}
	
	
}
