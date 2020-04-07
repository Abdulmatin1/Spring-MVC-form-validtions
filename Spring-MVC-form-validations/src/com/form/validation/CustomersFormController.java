package com.form.validation;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myCustomer")
public class CustomersFormController {
	
	@RequestMapping("/form")
	public String showCustomersForm(Model myModel) {
		
		myModel.addAttribute("customer", new Customers());
	
		return"CustomersForm";
	}
	
	
	
	@InitBinder
	
	public void InitBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor obj = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, obj);
		
	}
	
	
	@RequestMapping("/processForm")
	public String processConfirmationForm( @Valid @ModelAttribute("customer") Customers theCustomers, BindingResult theBindingResult ) {
		
		if(theBindingResult.hasErrors()) {
			
			return "CustomersForm";
			
			
		}else {
		
		return "formConfirmation";
		
		
		
		}
	}
	
	
	
	
	
	
	

}
