package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;



    public List<Book> getAll() {

        return bookRepository.findAll();
    }


    public Book getBookById(Long id) {
        return bookRepository.findById(id).get();
    }


    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }


    public Book saveBook(Book book) {

        return bookRepository.save(book);
    }


    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

}
