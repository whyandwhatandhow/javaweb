package spring.service.impl;

import spring.dao.BookDao;
import spring.dao.impl.BookDaoImpl;
import spring.service.BookService;

public class BookServiceImpl implements BookService {

    BookDao bookDao=new BookDaoImpl();
    @Override
    public void bookService() {
        bookDao.bookDao();
    }
}
