package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.SpringConfig;
import spring.dao.PersonDao;

public class MainTest4 {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        PersonDao personDao=(PersonDao) context.getBean("personDao");//这里的personDao是文件中的注解
        personDao.print();
    }
}
