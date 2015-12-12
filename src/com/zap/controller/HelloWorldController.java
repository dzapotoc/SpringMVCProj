package com.zap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	String hello = "Hello World!";
	
	
	@RequestMapping("/test/{name}")
	@ResponseBody
	public String showMessage(@PathVariable("name") String name) {
		return "Hello " + name + "!";
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public String showMessage() {
		return hello;
	}
}
