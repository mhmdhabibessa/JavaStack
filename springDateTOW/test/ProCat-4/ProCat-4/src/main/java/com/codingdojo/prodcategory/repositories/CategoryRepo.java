package com.codingdojo.prodcategory.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.prodcategory.models.Category;
import com.codingdojo.prodcategory.models.Product;


@Repository
public interface CategoryRepo extends CrudRepository<Category, Long> {

	List<Category> findAll();
	
	List<Category> findByProductsNotContaining(Product p);
	
}
