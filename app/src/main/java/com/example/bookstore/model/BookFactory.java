package com.example.bookstore.model;

public class BookFactory {
    public IBookDA getModel(){
        return new BookDA();
    }
}
