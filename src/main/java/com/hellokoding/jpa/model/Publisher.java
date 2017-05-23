package com.hellokoding.jpa.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	
	@ManyToMany(mappedBy = "publishers", fetch = FetchType.LAZY)
	private Set<Book> books;

	public Publisher() {

	}

	public Publisher(String name) {
		this.name = name;
	}

	public Publisher(String name, Set<Book> books) {
		this.name = name;
		this.books = books;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
}
