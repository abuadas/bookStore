package com.example.bookstore.model;

import java.util.ArrayList;
import java.util.List;

 class BookDA implements IBookDA{
    private ArrayList<Book> books = new ArrayList<>();
    public BookDA(){
        books.add(new Book(300,"Thinking in JAVA","Java"));
        books.add(new Book(450,"Professional JAVA","Java"));
        books.add(new Book(500,"Beginning C# development","C#"));
    }
    /**
     * انا عندي list of books وبدي أبحث عن كتاب معين
     * فبدي اعمل method ترجعلي كتاب معين
     * وترجعلي ياها على شكل arrayList او list of books
     */
    public List <Book> getBooks(String category){
        ArrayList<Book> resultData = new ArrayList<>();
        /**
         * for (type variableName : arrayName) {
         *   // code block to be executed
         * }
         */
        for (Book b : books) {
            if(b.getCategory().equals("Java"))
                resultData.add(b);
        }
        return resultData;
    }
}
