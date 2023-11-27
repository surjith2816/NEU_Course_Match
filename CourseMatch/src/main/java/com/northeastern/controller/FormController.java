package com.northeastern.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Controller is the class which handles the incoming API calls by backend processing(using Model and Service classes) and sends back responses to the frontend(JSP)


@Controller
public class FormController {

	// In our application Front end is basically HTML/CSS. front end will call the API using the following URL pattern like "/initialForm" in Controller
	
	@GetMapping("/initialForm")
	public String Initialform() {
		
		return "index";   // this actually returns index.jsp page as a response to the frontend(i.e. browser/client/webpage). 
		                   // think of index.jsp page like a normal html page for now. but it is effective for backend and frontend integration. normal html cannot do that.
	}
}
