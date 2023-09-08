package spring.service.impl;

import org.springframework.stereotype.Component;
import spring.dao.PersonDao;
import spring.service.PersonService;

@Component
public class PersonServiceImpl implements PersonService {
    PersonDao personDao;
    @Override
    public void person() {
        System.out.println("perService");
        personDao.print();
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }
}
