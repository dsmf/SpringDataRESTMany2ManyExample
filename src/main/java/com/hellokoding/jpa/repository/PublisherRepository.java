package com.hellokoding.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hellokoding.jpa.model.Publisher;

@RepositoryRestResource(collectionResourceRel = "publishers", path = "publishers")
public interface PublisherRepository extends CrudRepository<Publisher, Long>{
}
