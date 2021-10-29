package com.post_test1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MainController {
	
	

	@RequestMapping(value="/.do")
	public String mainTest() throws Exception {
		System.out.println("sevController.java - mainTest()");
		
		return "main";
	
	}
}
