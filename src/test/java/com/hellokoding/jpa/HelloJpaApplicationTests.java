package com.hellokoding.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.hellokoding.jpa.model.Book;
import com.hellokoding.jpa.repository.BookRepository;
import com.hellokoding.jpa.repository.PublisherRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HelloJpaApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class HelloJpaApplicationTests {

	
	@Autowired
	private BookRepository bookRepo;
	
	@Autowired
	private PublisherRepository publisherRepo;
	
	
	@Test
	@Transactional // fixes org.hibernate.LazyInitializationException when accessing book.getPublishers().
	public void test() {
		
		Book book = bookRepo.findAll().iterator().next();
		System.out.println(book.getName());
		book.getPublishers().stream().forEach(p -> System.out.println(p.getName()));

	}

}
