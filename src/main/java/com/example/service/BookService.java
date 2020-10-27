package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.VO.BookVO;
import com.example.entity.BookEntity;
import com.example.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	com.example.repository.BookRepository bookRepository;

	
	/*private final BookRepository bookRepository;
	 
	public BookService(BookRepository bookRepository) {
	    this.bookRepository = bookRepository;
	}*/
	public void saveBook(BookVO bookVO) {
		BookEntity bookEntity=new BookEntity();
		bookRepository.save(bookEntity.bookEntity(bookVO));
	}
	
	
	public List<BookVO> getBook( String name, String author, String isbn){
		List<BookEntity> booklist = null;
		if(!name.isEmpty()){
			 booklist=	bookRepository.getByName(name);
		}else if(!author.isEmpty()){
			 booklist=	bookRepository.getByAuthor(author);
		}else if(!isbn.isEmpty()){
			 booklist= bookRepository.getByISBN(isbn);
		}
		List<BookVO> bookVOs=new ArrayList<>();
		for (BookEntity bookEntity : booklist) {
			
			bookVOs.add(new BookVO().bookEntity(bookEntity));
		}
		return bookVOs;
	}


	


	public void deleteBook(String name, String isbn) {

		if(!name.isEmpty()){
			 	bookRepository.deleteByName(name);
		}else if(!isbn.isEmpty()){
			  bookRepository.deleteByISBN(isbn);
		}
	}

}
