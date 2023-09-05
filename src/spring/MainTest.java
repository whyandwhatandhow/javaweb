package spring;

import spring.service.BookService;
import spring.service.impl.BookServiceImpl;

public class MainTest {
    public static void main(String[] args) {
        BookService bookService=new BookServiceImpl();

        bookService.bookService();
    }
}
