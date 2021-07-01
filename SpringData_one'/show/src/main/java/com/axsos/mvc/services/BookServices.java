package com.axsos.mvc.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.mvc.models.Book;
import com.axsos.mvc.repositories.BookRepository;

import java.util.List;
@Service
public class BookServices {
    // adding the book repository as a dependency
	private final BookRepository bookRepository;
    
    public BookServices(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		
		Optional<Book> book1=bookRepository.findById(id);
		if(book1.isPresent()) {
			Book updatBook = book1.get();
			updatBook.setTitle(title);
			updatBook.setDescription(desc);
			updatBook.setLanguage(lang);
			updatBook.setNumberOfPages(numOfPages);
			return bookRepository.save(updatBook);	
		}
		else {
			return null;
		}
		
	}
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
		
	}
	
	
}
