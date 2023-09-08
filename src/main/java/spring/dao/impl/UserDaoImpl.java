package spring.dao.impl;

import spring.dao.UserDao;

public class UserDaoImpl implements UserDao {
    private int count;
    private String name;
    @Override
    public void save() {
        System.out.println("user dao"+name+count);
    }


    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }
}
