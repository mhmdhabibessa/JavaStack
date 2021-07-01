package com.example.mvc.serveces;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mvc.models.Category;
import com.example.mvc.models.Product;
import com.example.mvc.Repositery.CategoryRepositery;

@Service
public class categoryServeces {
 // adding the book repository as a dependency
	private final CategoryRepositery categoryRepository;
 
 

public categoryServeces(CategoryRepositery categoryRepository) {

	this.categoryRepository = categoryRepository;
}




// returns all the books
 public List<Category> alllCategory() {
     return categoryRepository.findAll();
 }
 
 
 public Category createCategory(Category category) {
     return categoryRepository.save(category);
 }
 // retrieves a book
 public Category findcategory(Long id) {
     Optional<Category> Category = categoryRepository.findById(id);
     if(Category.isPresent()) {
         return Category.get();
     } else {
         return null;
     }
     
 }
 
// public DojoNinja updatedojos(Long id, String name, String creator,  Integer version) {
//		
//		Optional<DojoNinja> dojo=Dojo_ninjasRepository.findById(id);
//		if(dojo.isPresent()) {
//			DojoNinja updatdojos = dojo.get();
//			updatdojos.setName(name);;
//			updatdojos.set);
//			updatdojos.setVersion(version);
//			return Dojo_ninjasRepository.save(updatdojos);
//		}
//		else {
//			return null;
//		}
//		
//	}
// public void deleteBook(Long id) {
//		languageRepository.deleteById(id);
//		
//	}

 public List<Category> addProductyNotcontainging(Product product){
	 return categoryRepository.findByProductsNotContains(product);
	 
 }  
}
