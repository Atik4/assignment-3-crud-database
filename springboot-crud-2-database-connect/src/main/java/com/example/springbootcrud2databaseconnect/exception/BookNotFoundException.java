package com.example.springbootcrud2databaseconnect.exception;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(int id){
        super("book id not found: " + id);
    }
}
