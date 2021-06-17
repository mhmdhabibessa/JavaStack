package com.axsos.hello;


import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;	



	
	@Controller
	public class counter {
		
		
	    @RequestMapping("/your_server")
	    public String home() {
	        return "index.jsp";
	        
	        
	    }
	    
	    int c = 0;
		@RequestMapping("/your_server/counter")
	    public String index(HttpSession session) {
			System.out.println("im hereeeee"+c);
			session.setAttribute("count",c);
			c+=1;
			
//			model.addAttribute("count",count);
	    	return "counter.jsp";
	    }
		
		 
	   
	    
	}
	


