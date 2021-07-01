package com.example.mvc.controller;


import javax.validation.Valid;

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
public class CategoryController {
	private final categoryServeces CategoryServeces;
	private final ProductServeces productService;

	
	
	
	 public CategoryController(categoryServeces CategoryServeces,ProductServeces productService) {
		
		this.CategoryServeces = CategoryServeces;
		this.productService = productService;

	}


	@RequestMapping("/category/new")
	    public String newprod(@ModelAttribute("category") Category category) {
	        return "/category.jsp";
	    }
	
	  	
	@RequestMapping("/category/{id}")
    public String categoryID(@PathVariable("id")Long id ,@ModelAttribute("product") Product product, Model model) {
	  Category category =CategoryServeces.findcategory(id);	
	  model.addAttribute("product",productService.addCategoryNotcontainging(category));
	  model.addAttribute("category", category);
	  model.addAttribute("category", id);
	  model.addAttribute("listCat", category.getProducts());
        	return "/ShowCategory.jsp";
    }
	
  
	
  @RequestMapping(value="/addCategory/{id}", method=RequestMethod.POST)
  public String create(@PathVariable("id")Long id , @Valid @ModelAttribute("product") Product product, BindingResult result ) {
	  if (result.hasErrors()) {
            return "/ShowCategory.jsp";
        }
        else {
  		  Category category =CategoryServeces.findcategory(id);
  		  product.getCategories().add(category);
  		CategoryServeces.createCategory(category);
            return "redirect:/product/"+id;
        }
}
}
