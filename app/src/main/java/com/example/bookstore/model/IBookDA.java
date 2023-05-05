package com.example.bookstore.model;

import java.util.List;

public interface IBookDA {
    List<Book> getBooks(String category);
}
