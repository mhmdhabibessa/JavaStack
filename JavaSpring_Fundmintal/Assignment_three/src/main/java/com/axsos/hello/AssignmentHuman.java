package com.axsos.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
	
	
	@RestController
	public class AssignmentHuman {
		
		
	    @RequestMapping("/your_server")
	    public String index() {
	        return "<h1>Hello Human </h1> <br> <h4> Welcome to springboat </h4> ";
	        
	        
	    }
	    @RequestMapping("/your_server/")
	    public String index(@RequestParam(value="name") String searchQuery) {
	        return "Hello: " + searchQuery;
	    }
	    
	}


