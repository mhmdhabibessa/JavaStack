package com.example.mvc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.mvc.models.DojoNinja;
import com.example.mvc.sevecies.DojoNinjasServeces;


@Controller
public class Dojocontroller {
	private final DojoNinjasServeces dojoService;

	public Dojocontroller(DojoNinjasServeces Service) {
		this.dojoService = Service;
	}
//	 @RequestMapping("/dojos")
//	    public String index1(Model model) {
//	        List<DojoNinja> DojoNinja = dojoService.allldojos();
//	        model.addAttribute("Dojo", DojoNinja);
//	        return "dojoshow.jsp";
//	    }
	  @RequestMapping("/dojo/new")
	    public String newdojo(@ModelAttribute("dojo") DojoNinja dojo) {
	        return "/dojonew.jsp";
	    }
	  @RequestMapping("/dojo/{id}")
	    public String dojoID(@PathVariable("id")Long id , Model model) {
	        model.addAttribute("dojo", dojoService.finddojos(id));
	        	return "/tabel.jsp";
	    }
	  	
	  @RequestMapping(value="/dojos", method=RequestMethod.POST)
	  public String create(@Valid @ModelAttribute("dojo") DojoNinja dojo, BindingResult result) {
		  if (result.hasErrors()) {
	            return "/dojonew.jsp";
	        }
	        else {
	        	dojoService.createdojo(dojo);
	            return "redirect:/dojos";
	        }
	   
	    
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


