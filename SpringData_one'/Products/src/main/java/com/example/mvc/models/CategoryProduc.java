package com.example.mvc.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//...
	@Entity
	@Table(name="categories_products")
	public class CategoryProduc {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 @Column(updatable=false)
	 private Date createdAt;
	 private Date updatedAt;
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="product_id")
	 private Product product;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="category_id")
	 private Category category;
	 
	 public CategoryProduc() {
	     
	 }
 // ...
 // getters and setters removed for brevity
 // ...


	    // ...
	    // getters and setters removed for brevity
	    // ..
	
	


	}

