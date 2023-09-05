package spring.service.impl;

import spring.dao.BookDao;
import spring.dao.UserDao;
import spring.dao.impl.BookDaoImpl;
import spring.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;
    private UserDao userDao;
    @Override
    public void bookService() {
        bookDao.bookDao();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
