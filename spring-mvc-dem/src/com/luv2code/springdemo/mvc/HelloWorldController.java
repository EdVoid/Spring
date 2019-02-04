package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HelloWorldController {
	
	// controller method to show the initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	// controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDuce(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form
		String theName = (request.getParameter("studentName"));
		
		// convert the name to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result ="Hi! "+theName;
		// add message to the model
		model.addAttribute("message", result);
		
		System.out.println("message to be printed:"+ result);
		return "helloworld";
	}
}
