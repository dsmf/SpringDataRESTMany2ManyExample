package com.hellokoding.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hellokoding.jpa.model.Book;

@RepositoryRestResource(collectionResourceRel = "books", path = "books")
public interface BookRepository extends CrudRepository<Book, Long>{
}
