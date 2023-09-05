package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.dao.BookDao;

public class MainTest2 {
    public static void main(String[] args) {
        //获取ioc容器
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        BookDao bookDao = (BookDao) context.getBean("bookdao");
        bookDao.bookDao();
    }
}
