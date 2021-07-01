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
import com.example.mvc.models.Ninja;
import com.example.mvc.sevecies.DojoNinjasServeces;
import com.example.mvc.sevecies.NinjasServeces;


@Controller
public class ninjacontrolar {
	private final NinjasServeces ninjaService;
	private final DojoNinjasServeces dojoService;

	
	 public ninjacontrolar(NinjasServeces ninjaService, DojoNinjasServeces dojoService) {
		super();
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}
	@RequestMapping("/ninjas")
	    public String index1(Model model) {
		 model.addAttribute("ninja",ninjaService.alllninjas());
		 return "ninjaindex.jsp";
	    }
	  @RequestMapping("/ninja/new")
	    public String newninja(@ModelAttribute("ninja") Ninja ninja,Model model) {
		  model.addAttribute("dojo",ninjaService.allldojos());
	        return "/ninjanew.jsp";
	    }
	
	  
	  @RequestMapping(value="/ninja", method=RequestMethod.POST)
	  public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result,Model model) {
		  if (result.hasErrors()) {
			  	model.addAttribute("dojo",ninjaService.allldojos()); 
	            return "/ninjanew.jsp";
	        }
	        else {
	        	ninjaService.createninja(ninja);
	            return "redirect:/ninja/new";
	        }
	    
	  }
	  @RequestMapping("/tabel/{id}")
	  public String shoall(@PathVariable("id") Long id,Model model) {
		  DojoNinja dojo = dojoService.finddojos(id);
		  model.addAttribute("dojo",dojo); 
			  	List<Ninja> ninja = dojo.getNinjas();
			  	model.addAttribute("ninja",ninja);
		return "tabel.jsp";
	  } 
	  }


	

