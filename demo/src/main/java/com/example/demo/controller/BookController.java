package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {


    @Autowired
    private BookService service;


    @PostMapping("/addBook")
    public void saveStudent(@RequestBody Book book){
        service.saveBook(book);

    }

    @GetMapping("/books")
    public List<Book> allBooks(){
        return service.getAll();
    }



}
