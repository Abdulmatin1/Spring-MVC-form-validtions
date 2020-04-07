package com.form.validation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomController {
	
	@RequestMapping("/")
	public String showWelcomScreen() {
		
		
		return "welcome";
	}
	
	
	
	

}
