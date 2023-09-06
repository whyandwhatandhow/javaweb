package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.dao.UserDao;
import spring.service.BookService;
import spring.service.impl.BookServiceImpl;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=(UserDao) context.getBean("userDao");
        userDao.save();
    }
}
