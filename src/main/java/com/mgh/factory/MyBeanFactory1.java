package com.mgh.factory;

import com.mgh.dao.UserDao;
import com.mgh.dao.impl.UserDaoImpl;

/**
 * @author 孟广辉
 * @version 54188
 */
public class MyBeanFactory1 {

    public static UserDao userDao(){
        return new UserDaoImpl();
    }
}
