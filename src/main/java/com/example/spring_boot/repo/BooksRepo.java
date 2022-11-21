package com.example.spring_boot.repo;

import com.example.spring_boot.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BooksRepo extends MongoRepository<Book,Integer> {
}
