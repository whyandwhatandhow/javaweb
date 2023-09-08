package spring.dao.impl;

import org.springframework.stereotype.Repository;
import spring.dao.AnnocationDao;

@Repository("annotation")
public class AnnocationDaoImpl implements AnnocationDao{
    @Override
    public void sout() {
        System.out.println("纯注解开发");
    }
}
