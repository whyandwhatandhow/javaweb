package spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import spring.dao.AnnocationDao;
import spring.dao.BookDao;
import spring.service.AnnocationService;

@Service
public class AnnocationServiceImpl implements AnnocationService {

    //注解注入对象
    @Autowired
    @Qualifier("annotation")//指定
    private AnnocationDao annocationDao;//和注解名称一样
    @Value("${usernames}")
    String name;
    @Override
    public void sout() {
        System.out.println("annocation service");
        annocationDao.sout();
        System.out.println(name);
    }

}
