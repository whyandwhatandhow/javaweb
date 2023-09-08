package spring.service.impl;

import spring.dao.BookDao;
import spring.dao.UserDao;
import spring.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl() {
    }

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void bookService() {
        bookDao.bookDao();
        userDao.save();
    }



    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
