package com.codingdojo.prodcategory.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.prodcategory.models.Category;
import com.codingdojo.prodcategory.models.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long>{
	List<Product> findAll();
	List<Product> findByCategoriesNotContaining(Category c);
}
