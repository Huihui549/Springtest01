package com.mgh.factory;

import com.mgh.dao.UserDao;
import com.mgh.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 孟广辉
 * @version 54188
 */
public class MyBeanFactory3 implements FactoryBean<UserDao> {

    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
