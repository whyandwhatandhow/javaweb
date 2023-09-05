package spring.dao.impl;

import spring.dao.UserDao;

public class UserDaoImpl implements UserDao {
    private int count;
    private String name;
    @Override
    public void save() {
        System.out.println("user dao");
    }
}
