package com.example.mvc.sevecies;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.example.mvc.models.DojoNinja;
import com.example.mvc.models.Ninja;
import com.example.mvc.repositories.Dojo_ninjasRepository;
import com.example.mvc.repositories.ninjasRepository;

@Service
public class NinjasServeces {
 // adding the book repository as a dependency
	private final ninjasRepository ninjasRepository;
	private final Dojo_ninjasRepository Dojo_ninjasRepository;

 public NinjasServeces(ninjasRepository ninjasRepository, Dojo_ninjasRepository dojo_ninjasRepository) {
     this.ninjasRepository = ninjasRepository;
	this.Dojo_ninjasRepository = dojo_ninjasRepository;
 }
 // returns all the books
 public List<Ninja> alllninjas() {
     return ninjasRepository.findAll();
 }
 
 public List<DojoNinja> allldojos() {
     return Dojo_ninjasRepository.findAll();
 }
 
 
 public Ninja createninja(Ninja ninja) {
     return ninjasRepository.save(ninja);
 }
 // retrieves a book
 public Ninja finddojos(Long id) {
     Optional<Ninja> ninja = ninjasRepository.findById(id);
     if(ninja.isPresent()) {
         return ninja.get();
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
 
  
 // public DojoNinja updatedojos(Long id, String name, String creator,  Integer version) {
// 		
// 		Optional<DojoNinja> dojo=Dojo_ninjasRepository.findById(id);
// 		if(dojo.isPresent()) {
// 			DojoNinja updatdojos = dojo.get();
// 			updatdojos.setName(name);;
// 			updatdojos.set);
// 			updatdojos.setVersion(version);
// 			return Dojo_ninjasRepository.save(updatdojos);
// 		}
// 		else {
// 			return null;
// 		}
// 		
// 	}
 // public void deleteBook(Long id) {
// 		languageRepository.deleteById(id);
// 		
// 	}


 }





