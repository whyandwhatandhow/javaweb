package spring.factory;

import spring.dao.BookDao;
import spring.dao.impl.BookDaoImpl;

public class BookFactory {
    public BookDao getBookDao(){
        return new BookDaoImpl();
    }
}
