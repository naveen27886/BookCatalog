package com.example.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.VO.BookVO;

@Entity
@Table(name="BOOK")
public class BookEntity implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
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
	
	public BookEntity bookEntity(BookVO bookVO){
		
		BookEntity bookEntity=new BookEntity();
		bookEntity.setAuthor(bookVO.getAuthor());
		bookEntity.setIsbn(bookVO.getIsbn());
		bookEntity.setName(bookVO.getName());
		
		return bookEntity;
		
	}

}
