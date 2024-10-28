package com.boutiq.command.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mdbspringboot.model.Book;


public interface BookRepository extends MongoRepository<Book, Integer> {

}
