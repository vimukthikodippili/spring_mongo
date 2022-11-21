package com.example.spring_boot.api;

import com.example.spring_boot.model.Book;
import com.example.spring_boot.repo.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/message")
@CrossOrigin
public class BookController {
    @Autowired
    private BooksRepo booksRepo;
    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){
        booksRepo.save(book);
        return "add" + book.getId();

    }
    @GetMapping
    public List<Book> getBooks(){
        return booksRepo.findAll();

    }

}
