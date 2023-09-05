package spring.factory;

import domain.User;
import org.springframework.beans.factory.FactoryBean;
import spring.dao.BookDao;
import spring.dao.impl.BookDaoImpl;

//改良
public class BookDaoFactoryBean implements FactoryBean<BookDao> {

    @Override
    public BookDao getObject() throws Exception {
        return new BookDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return BookDao.class;
    }

}
