package spring.dao.impl;

import org.springframework.stereotype.Component;
import spring.dao.PersonDao;

@Component("personDao")
public class PersonDaoImpl implements PersonDao {
    @Override
    public void print() {
        System.out.println("this is person dao");
    }
}
