package spring.service.impl;

import spring.dao.UserDao;
import spring.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userdao;
    @Override
    public void user() {
        System.out.println("自动装填");
        userdao.save();
    }

    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }
}
