package com.example.bookcatalogue;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.repository.BookRepository;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.example.*")
@PropertySource(value="classpath:application.properties")
public class BookcatalogueApplication extends SpringBootServletInitializer{

	@Autowired
	DataSource dataSource;
	
	public static void main(String[] args) {
		SpringApplication.run(BookcatalogueApplication.class, args);
	}

}
