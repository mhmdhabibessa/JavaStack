package com.axsos.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class code {

		@RequestMapping(value="/login", method=RequestMethod.POST)
		      public String login(@RequestParam(value="text") String text) {
		    	  if (text.equals("bushido")) {
		    		  return "secret_page.jsp";
		    	  }
		    	   
		    	  return"redirect:/erorr";
		}
	
	// ...

	@RequestMapping("/")
	public String home() {
		return "home.jsp";

	}

	@RequestMapping("/erorr")
	public String flashMessages(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "you must try !");
		return "redirect:/";
	}

//	    int c = 0;
//		@RequestMapping("/your_server/counter")
//	    public String index(HttpSession session) {
//			session.setAttribute("count", int c);
//			c+=1;
//			
////			model.addAttribute("count",count);
//	    	return "counter.jsp";
//	    }

}
