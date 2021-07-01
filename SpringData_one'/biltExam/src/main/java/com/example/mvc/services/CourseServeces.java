package com.example.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mvc.models.Course;
import com.example.mvc.models.User;
import com.example.mvc.repositories.CourseRepository;
@Service
public class CourseServeces {
 // adding the book repository as a dependency
	private final CourseRepository courseRepository;

 
 public CourseServeces(CourseRepository courseRepository) {
	this.courseRepository = courseRepository;
	
		
		
	}

 


 public List<Course> findAllcourses(){
		return courseRepository.findAll();
	}
	
 public Course createCourse(Course myCourse) {
		return courseRepository.save(myCourse);
	}
 
 public Course createcourse(Course course) {
     return courseRepository.save(course);
 }

 
 public Course findCourseById(Long id) {
		Optional<Course> myCourse = courseRepository.findById(id);
		if(myCourse.isPresent()) {
			return myCourse.get();
		}else {
			return null;
		}
	}
 
// public List<Product> addCategoryNotcontainging(Category category){
//	 return productRepository.findByCategoriesNotContains(category);
//	 
// }  
//	public Product getProduct(Long id) {
//		return productRepository.findById(id).orElse(null);
//	}
//public List<Category> getProductCategories(Long id){
//		Product p = getProduct(id);
//		return p.getCategories();
//		 
//	} 

 public void deleteCourse(Course course) {
	 courseRepository.delete(course);
	}
 
 public void updateCourse(Course myCourse) {
	 courseRepository.save(myCourse);
	}




 

}
