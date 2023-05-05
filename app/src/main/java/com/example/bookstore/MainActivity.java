package com.example.bookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.bookstore.model.Book;
import com.example.bookstore.model.BookFactory;
import com.example.bookstore.model.IBookDA;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnGetBooksOnClick(View view) {
        BookFactory bookFactory = new BookFactory();
        IBookDA objBook = bookFactory.getModel();
        List<Book> books = objBook.getBooks("Java");
        String str = "";
        for (Book b : books){
            str+=b.getTitle() + "\n";
        }
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}