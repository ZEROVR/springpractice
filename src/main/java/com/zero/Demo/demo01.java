package com.zero.Demo;

import com.zero.Dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo01 {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }
}
