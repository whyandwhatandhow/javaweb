package spring.service.impl;

import spring.dao.BookDao;
import spring.dao.impl.BookDaoImpl;
import spring.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;
    @Override
    public void bookService() {
        bookDao.bookDao();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
