package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.BookEntity;


public interface BookRepository extends CrudRepository<BookEntity, Integer>{
	
	List<BookEntity> getByISBN(final String val);
	List<BookEntity> getByAuthor(final String val);
	List<BookEntity> getByName(final String val);

	void deleteByISBN(final String val);
	
	void deleteByName(final String val);
}
