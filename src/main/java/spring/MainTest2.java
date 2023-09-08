package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.dao.BookDao;
import spring.dao.PersonDao;
import spring.dao.UserDao;
import spring.service.PersonService;

public class MainTest2 {
    public static void main(String[] args) {
        //获取ioc容器
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        PersonDao personDao=(PersonDao) context.getBean("personDao");
        System.out.println(personDao);
        PersonService personService=context.getBean(PersonService.class);
        System.out.println(personService);
    }
}
