package com.axsos.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.mvc.models.language;
import com.axsos.mvc.repositories.languageRepository;
@Service
public class languageServeces {
 // adding the book repository as a dependency
	private final languageRepository languageRepository;
 
 public languageServeces(languageRepository languageRepository) {
     this.languageRepository = languageRepository;
 }
 // returns all the books
 public List<language> alllanguages() {
     return languageRepository.findAll();
 }
 // creates a book
 public language createlanguage(language lang) {
     return languageRepository.save(lang);
 }
 // retrieves a book
 public language findlanguages(Long id) {
     Optional<language> optionallanguage = languageRepository.findById(id);
     if(optionallanguage.isPresent()) {
         return optionallanguage.get();
     } else {
         return null;
     }
     
 }
 
 public language updatelanguage(Long id, String name, String creator,  Integer version) {
		
		Optional<language> language1=languageRepository.findById(id);
		if(language1.isPresent()) {
			language updatlanguage = language1.get();
			updatlanguage.setName(name);
			updatlanguage.setCreator(creator);
			updatlanguage.setVersion(version);
			return languageRepository.save(updatlanguage);
		}
		else {
			return null;
		}
		
	}
 public void deleteBook(Long id) {
		languageRepository.deleteById(id);
		
	}


}
