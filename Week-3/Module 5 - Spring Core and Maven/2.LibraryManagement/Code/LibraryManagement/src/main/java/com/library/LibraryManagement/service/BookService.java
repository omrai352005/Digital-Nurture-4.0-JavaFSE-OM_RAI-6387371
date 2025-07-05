package com.library.LibraryManagement.service;

import com.library.LibraryManagement.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    // Setter for Spring DI - Excersize 2
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        System.out.println("Adding book: " + title);
        bookRepository.saveBook(title);
    }
}

