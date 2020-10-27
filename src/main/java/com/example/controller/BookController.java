package com.example.controller;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.VO.BookVO;
import com.example.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping(path = "/saveBookDetails", consumes = MediaType.APPLICATION_JSON)
	public ResponseEntity saveBook(@RequestBody  BookVO bookVO){
		try{
		bookService.saveBook(bookVO);
		return (ResponseEntity) ResponseEntity.status(HttpStatus.OK);
		}catch (Exception e) {
			return (ResponseEntity) ResponseEntity.status(HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping(path = "/getBookDetails", consumes = MediaType.APPLICATION_JSON)
	public List<BookVO> getBook(@RequestParam String name,@RequestParam String author,@RequestParam String isbn){
		
			return bookService.getBook(name, author, isbn);
			
	}
	
	@DeleteMapping(path = "/deleteBookDetails", consumes = MediaType.APPLICATION_JSON)
	public ResponseEntity deleteBook(@RequestParam String name,@RequestParam String isbn){
		
		try{
			bookService.deleteBook(name,  isbn);
			return (ResponseEntity) ResponseEntity.status(HttpStatus.OK);
			}catch (Exception e) {
				return (ResponseEntity) ResponseEntity.status(HttpStatus.BAD_REQUEST);
			}
			
			
	}
	
}
