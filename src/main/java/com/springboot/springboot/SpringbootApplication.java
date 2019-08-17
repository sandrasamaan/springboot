package com.springboot.springboot;

import com.model.Author;
import com.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);


		Author author = new Author();
		Book book = new Book();




	}
}
