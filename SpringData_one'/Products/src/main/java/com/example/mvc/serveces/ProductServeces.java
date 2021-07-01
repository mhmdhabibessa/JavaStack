package com.example.mvc.serveces;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mvc.Repositery.CategoryRepositery;
import com.example.mvc.Repositery.ProductRepositery;
import com.example.mvc.models.Category;
import com.example.mvc.models.Product;

@Service
public class ProductServeces {
 // adding the book repository as a dependency
	private final ProductRepositery productRepository;
	private final CategoryRepositery categoryRepository;

 
 public ProductServeces(ProductRepositery productRepository , CategoryRepositery categoryRepository) {
	this.productRepository = productRepository;
	this.categoryRepository = categoryRepository;
		
		
	}



// returns all the books
 public List<Product> alllProduct() {
     return productRepository.findAll();
 }
 public List<Category>allcategory(){
	 return categoryRepository.findAll();
 }
 
 
 public Product createProduct(Product product) {
	 System.out.println(product.getCategories());
     return productRepository.save(product);
 }
 // retrieves a book
 public Product findProduct(Long id) {
     Optional<Product> Product = productRepository.findById(id);
     if(Product.isPresent()) {
         return Product.get();
     } else {
         return null;
     }
     
 }
 public List<Product> addCategoryNotcontainging(Category category){
	 return productRepository.findByCategoriesNotContains(category);
	 
 }  
	public Product getProduct(Long id) {
		return productRepository.findById(id).orElse(null);
	}
public List<Category> getProductCategories(Long id){
		Product p = getProduct(id);
		return p.getCategories();
		 
	} 

public List<Category> getCategoryNotContains(Long id){
	Product p = getProduct(id);
	return categoryRepository.findByProductsNotContaining(p);
}





 

}
