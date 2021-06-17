package com.axsos.hello;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;	



	
	@Controller
	public class Display {
		
		
	    @RequestMapping("/")
	    public String index() {
	        return "index.jsp";
	        
	        
	    }
	    @SuppressWarnings("deprecation")
		@RequestMapping("/date")
	    public String Date(Model model) {
	        model.addAttribute("date", new java.util.Date());

	    	return "Date.jsp";
	    }
	    @RequestMapping("/time")
	    public String Time(Model model) {
	    	String pattern = "HHH:mm a";
	    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	    	String Time = simpleDateFormat.format(new Date());
	        model.addAttribute("time", Time);

	    	return "time.jsp"; 
	    }
	    
	    
	    
	    
	}
	


