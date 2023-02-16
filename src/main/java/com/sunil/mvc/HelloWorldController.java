package com.sunil.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;



@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String displayHomePage() {
		return "main-menu";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/submitForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShout(HttpServletRequest request, Model model) {
		String theName = request.getParameter("studentName").toUpperCase();
		String result = " Yo !" +  theName;
		model.addAttribute("message",result);
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processThree(@RequestParam("studentName") String theName,  Model model) {
		theName= theName.toUpperCase();
		String result = " Hello  !" +  theName;
		model.addAttribute("message",result);
		return "helloworld";
	}
	

}
