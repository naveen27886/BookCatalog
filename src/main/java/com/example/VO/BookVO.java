package com.example.VO;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.example.entity.BookEntity;

@Component
public class BookVO implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String author;
	private String isbn;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
public BookVO bookEntity(BookEntity bookEntity){
		
	BookVO bookVO=new BookVO();
	bookVO.setAuthor(bookEntity.getAuthor());
	bookVO.setIsbn(bookEntity.getIsbn());
	bookVO.setName(bookEntity.getName());
		
		return bookVO;
		
	}
}
