package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Entity(name = "Book")
@Table(name="book")
// here I have to implement some code for DypeDef(type definition)//
public class Book  {

    @Id
    @GeneratedValue
    private Long id;
    @NaturalId
    private String isbn;

    @Column(columnDefinition = "JSON")
    private  BookRecord properties;

    public Book() {
    }

    public Book(String isbn, BookRecord properties) {
        this.isbn = isbn;
        this.properties = properties;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BookRecord getProperties() {
        return properties;
    }

    public void setProperties(BookRecord properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", properties=" + properties +
                '}';
    }
}
