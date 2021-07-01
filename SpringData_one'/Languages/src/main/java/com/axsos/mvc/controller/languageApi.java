package com.axsos.mvc.controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.axsos.mvc.models.language;
import com.axsos.mvc.services.languageServeces;

@Controller
public class languageApi {
	private final languageServeces langService;

	public languageApi(languageServeces langService) {
		this.langService = langService;
	}
//	 @RequestMapping("/languages")
//	    public String index(Model model) {
//	        List<language> language = languageServeces.alllanguages();
//	        model.addAttribute("language", language);
//	        return "/language/index.jsp";
//	    }
//	  @RequestMapping("/languages/new")
//	    public String newlanguage(@ModelAttribute("language") language language1) {
//	        return "/languges/index.jsp";
//	    }
//	    @RequestMapping(value="/language", method=RequestMethod.POST)
//	    public String create(@Valid @ModelAttribute("language") language language1, BindingResult result) {
//	        if (result.hasErrors()) {
//	            return "/language/new.jsp";
//	        }
//	        else {
//	        	languageServeces.createlanguage(language1);
//	            return "redirect:/language";
//	        }
//	    }
	    @RequestMapping(value="new/language", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("lang") language language1, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/languages/index.jsp";
	        } else {
	        	langService.createlanguage(language1);
	            return "redirect:/languages";
	        }
	    }

	    @RequestMapping("/language")
	    public String index(Model model) {
	    	List <language> lang = langService.alllanguages();
	    	model.addAttribute("language",lang);
	    	model.addAttribute("lang",new language());
	    	
	        return "/languages/index.jsp";
	    }
	    
}


	// other methods removed for brevity
//	@RequestMapping(value = "/languges", method = RequestMethod.PUT)
//	public language update(@PathVariable("id") Long id, @RequestParam(value = "name") String name,
//			@RequestParam(value = "creator") String creator, @RequestParam(value = "version") Integer version) {
//		language language = langService.updatelanguage(id, name, creator, version);
//		return language;
//	}
//
//
//	@RequestMapping(value ="/languages/new", method=RequestMethod.POST)
//	public language create(@RequestParam(value="name") String name, @RequestParam(value="creator") String creator,
//			@RequestParam(value="version") Integer version) {
//		language language = new language(name, creator, version);
//		return langService.createlanguage(language);
//	}
//
//	@RequestMapping(value = "/api/a", method = RequestMethod.DELETE)
//	public String destroy(@PathVariable("id") Long id) {
//		langService.deleteBook(id);
//		return null;
//	}
	
	// ... imports removed for brevity


