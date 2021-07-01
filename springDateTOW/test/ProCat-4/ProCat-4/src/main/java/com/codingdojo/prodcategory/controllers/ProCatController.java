package com.codingdojo.prodcategory.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.prodcategory.models.Category;
import com.codingdojo.prodcategory.models.Product;
import com.codingdojo.prodcategory.services.ProCatService;

@Controller
public class ProCatController {
	final private ProCatService proService;
	public ProCatController(ProCatService proService) {
		this.proService = proService;
	}
	
	
	
	@RequestMapping("products/new")
	public String product(Model model) {
		model.addAttribute("allProducts",proService.getAllProdcuts());
		Product product = new Product();
		model.addAttribute("product", product);
		return "product.jsp";
	}
	
	
	@PostMapping("/add")
	public String createProduct(@ModelAttribute("product") Product product, BindingResult results) {
		if(results.hasErrors()) {
			return "product.jsp";
		}else {
			proService.creatProduct(product);
			return "redirect:products/new";
		}
		
	}
	
	
	@RequestMapping("/category")
	public String category(@ModelAttribute("category") Category category, Model model) {
		model.addAttribute("allCategories",proService.getAllCategories());
		return "Category.jsp";
	}
	
	
	@PostMapping("/category/create")
	public String category(@ModelAttribute("category") Category category, BindingResult results) {
		if(results.hasErrors()) {
			return "Category.jsp";
		}else {
			proService.creatCategory(category);
			return "redirect:/category";			
		}
		
	}
	
	
	@RequestMapping("/product/{id}")
	public String productShow(Model model, @PathVariable("id")Long id,@ModelAttribute("category") Category category) {
		System.out.println(proService.getProductCategories(id));
		model.addAttribute("thisProductId", id);
		model.addAttribute("allProductCategories", proService.getProductCategories(id));
		model.addAttribute("allNotProductCategories", proService.getCategoryNotContains(id));
		
		
		
		return "productD.jsp";
	}
	
	@PostMapping("/product/{id}")
	public String addRelation(@PathVariable("id")Long id,@RequestParam("cid")Long cid) {
		proService.addProductCategory(id, cid);
		
		return "redirect:/product/"+id;
	}
	
	
	@RequestMapping("/category/{id}")
	public String categoryShow(Model model, @PathVariable("id")Long id,@ModelAttribute("product") Product product) {
		
		model.addAttribute("allCategoryProducts", proService.getProductCategories(id));
		model.addAttribute("allNotCategoryProducts", proService.getProductNotContains(id));
		
		return "categoryD.jsp";
	}
	
	
}
