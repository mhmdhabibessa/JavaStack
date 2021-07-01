package com.example.mvc.controller;

import javax.validation.Valid;

import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.mvc.models.Category;
import com.example.mvc.models.Product;
import com.example.mvc.serveces.ProductServeces;
import com.example.mvc.serveces.categoryServeces;

@Controller
public class ProductController {
	private final ProductServeces productService;
	private final categoryServeces CategoryServeces;

	
	
	
	 public ProductController(ProductServeces productService, categoryServeces CategoryServeces) {
		
		this.productService = productService;
		this.CategoryServeces = CategoryServeces;
	}


	@RequestMapping("/product/new")
	    public String newproduct(@ModelAttribute("product") Product product) {
	        return "/newproduct.jsp";
	    }
	
	  	
	  @RequestMapping(value="/creatnew_product", method=RequestMethod.POST)
	  public String create(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		  if (result.hasErrors()) {
	            return "/newproduct.jsp";
	        }
	        else {
	        	productService.createProduct(product);
	            return "redirect:/product/new";
	        }
	   
	    
	  }
	 
	
	  
	  @RequestMapping("/product/{id}")
	    public String productID(@PathVariable("id")Long id ,@ModelAttribute("category") Category catogery, Model model) {
		  Product product =productService.getProduct(id);	
		model.addAttribute("product", id);
		model.addAttribute("allProductCategories", productService.getProductCategories(id));
		 model.addAttribute("catogery",productService.getCategoryNotContains(id));

		  model.addAttribute("product", product);
		  model.addAttribute("listCat", product.getCategories());
	        	return "/ShowProduct.jsp";
	    }
	  
		
	  @RequestMapping(value="/add/{id}", method=RequestMethod.POST)
	  public String create(@PathVariable("id")Long id , @Valid @ModelAttribute("category") Category category, BindingResult result ) {
		  if (result.hasErrors()) {
	            return "/ShowProduct.jsp";
	        }
	        else {
	  		  Product product =productService.findProduct(id);
	  		  product.getCategories().add(category);
	  		  productService.createProduct(product);
	            return "redirect:/product/"+id;
	        }
		   	
	    
	  }
	 
	  
	  
	  
	  
	 
}
