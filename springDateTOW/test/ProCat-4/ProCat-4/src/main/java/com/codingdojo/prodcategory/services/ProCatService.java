package com.codingdojo.prodcategory.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.prodcategory.models.Category;
import com.codingdojo.prodcategory.models.Product;
import com.codingdojo.prodcategory.repositories.CategoryRepo;
import com.codingdojo.prodcategory.repositories.ProductRepo;

@Service
public class ProCatService {
	final private CategoryRepo catRepo;
	final private ProductRepo proRepo;
	public ProCatService(CategoryRepo catRepo, ProductRepo proRepo) {
		this.catRepo = catRepo;
		this.proRepo = proRepo;
	}
	
	
	public List<Product> getProdcuts(){
		return proRepo.findAll();
	}
	
	public List<Category> getCategories(){
		return catRepo.findAll();
	}
	
	
	public Product creatProduct(Product p) {
		proRepo.save(p);
		return p;
	}
	
	public Category creatCategory(Category c) {
		catRepo.save(c);
		return c;
	}
	
	
	public Product addProductCategory(Long pid,Long cid) {
		Product thisProduct = getProduct(pid);
		Category thisCategory = getCategory(cid);
		
		List<Category> newList = thisProduct.getCategories();
		
		newList.add(thisCategory);
		thisProduct.setCategories(newList);
		return proRepo.save(thisProduct);
	}
	
	public List<Category> getCategoryNotContains(Long id){
		Product p = getProduct(id);
		return catRepo.findByProductsNotContaining(p);
	}
	
	public List<Product> getProductNotContains(Long id){
		Category c = getCategory(id);
		return proRepo.findByCategoriesNotContaining(c);
	}
	
	public List<Category> getProductCategories(Long id){
		Product p = getProduct(id);
		return p.getCategories();
	}
	
	
	public List<Category> getAllCategories(){
		return catRepo.findAll();
	}
	
	public List<Product> getAllProdcuts(){
		return proRepo.findAll();
	}
	
	public Product getProduct(Long id) {
		return proRepo.findById(id).orElse(null);
	}
	
	public Category getCategory(Long id) {
		return catRepo.findById(id).orElse(null);
	}
	
	
	
}
