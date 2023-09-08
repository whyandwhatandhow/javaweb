package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class MainTest3 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource source=(DataSource) context.getBean("database");
        System.out.println(source);
    }
}
