package org.example;

import domain.User;
import org.apache.commons.beanutils.BeanUtils;
import org.testng.annotations.Test;

public class BeanUtilsTest {
    @Test
    public void test(){
        User user=new User();
        try{
            BeanUtils.setProperty(user,"username","hangman");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(user);
    }
}
