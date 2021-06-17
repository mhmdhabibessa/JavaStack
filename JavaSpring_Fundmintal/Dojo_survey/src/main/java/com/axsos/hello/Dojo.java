package com.axsos.hello;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller

public class Dojo {
      @RequestMapping(value="/login", method=RequestMethod.POST)
      public String login(HttpSession session,  @RequestParam(value="fname") String fname,
    		  @RequestParam(value="select_name") String select_name,
    		  @RequestParam(value="lang") String lang,
    		  @RequestParam(value="text_area") String text_area){
    	  		session.setAttribute("select_name", select_name);
    	  		session.setAttribute("lang", lang);
    	  		session.setAttribute("text_area", text_area);
    	  		session.setAttribute("fname", fname);
      	return "redirect:/welcom"; }
      
      
      
      
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";

	}
	@RequestMapping("/welcom")
	public String welcom() {
		return "welcom.jsp";

	}

}
