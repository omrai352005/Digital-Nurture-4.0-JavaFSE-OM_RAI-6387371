package com.library.LibraryManagement.LibraryManagement;

import com.library.LibraryManagement.LibraryManagement.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service = (BookService) context.getBean("bookService");
        service.addBook("Effective Java");
        service.addBook("Clean Code");
    }
}

