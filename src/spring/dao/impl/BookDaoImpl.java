package spring.dao.impl;

import spring.dao.BookDao;

public class BookDaoImpl implements BookDao {
    int count;
    double price;
    @Override
    public void bookDao() {
        System.out.println("bookDao");
    }
}
