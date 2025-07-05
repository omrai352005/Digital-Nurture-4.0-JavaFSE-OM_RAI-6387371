package com.library.LibraryManagement.LibraryManagement.service;

import com.library.LibraryManagement.LibraryManagement.repository.BookRepository;

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

