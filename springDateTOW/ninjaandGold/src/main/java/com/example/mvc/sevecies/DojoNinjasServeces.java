package com.example.mvc.sevecies;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mvc.models.DojoNinja;
import com.example.mvc.models.Ninja;
import com.example.mvc.repositories.Dojo_ninjasRepository;

@Service
public class DojoNinjasServeces {
 // adding the book repository as a dependency
	private final Dojo_ninjasRepository Dojo_ninjasRepository;
 
 public DojoNinjasServeces(Dojo_ninjasRepository Dojo_ninjasRepository) {
     this.Dojo_ninjasRepository = Dojo_ninjasRepository;
 }
 // returns all the books
 public List<DojoNinja> allldojos() {
     return Dojo_ninjasRepository.findAll();
 }
 
 
 public DojoNinja createdojo(DojoNinja doj) {
     return Dojo_ninjasRepository.save(doj);
 }
 // retrieves a book
 public DojoNinja finddojos(Long id) {
     Optional<DojoNinja> dojos = Dojo_ninjasRepository.findById(id);
     if(dojos.isPresent()) {
         return dojos.get();
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


}
