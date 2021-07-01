package com.example.mvc.Repositery;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.mvc.models.Category;
import com.example.mvc.models.Product;
// ...
@Repository
public interface ProductRepositery extends CrudRepository<Product, Long>{
    // this method retrieves all the languages from the database
    List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);

    
    // this method finds languages with descriptions containing the search string
//    List<DojoNinja> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
//    Long countByTitleContaining(String search);
    // this method deletes a language that starts with a specific title
//    Long deleteByTitleStartingWith(String search);

}
