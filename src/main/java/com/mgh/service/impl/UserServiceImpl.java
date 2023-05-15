package com.mgh.service.impl;

import com.mgh.dao.UserDao;
import com.mgh.service.UserService;

import java.util.List;

/**
 * @author 孟广辉
 * @version 54188
 */
public class UserServiceImpl implements UserService {
    //该方法由BeanFactory调用，从容器中获取userDao设置此处
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
//        System.out.println("该方法由BeanFactory调用,获取userDao设置此处:"+userDao);
    }
    public UserServiceImpl(){
        System.out.println("UserServiceImpl构造方法执行");
    }

    //注入List
//    private List<String> stringList;
//    private List<UserDao> userDaoList;
//    public void setStringList(List<String> stringList){
//        this.stringList = stringList;
//    }
//
//    public void setUserDaoList(List<UserDao> userDaoList){
//        this.userDaoList = userDaoList;
//    }

    public void show(){
//        System.out.println(stringList);
//        System.out.println(userDaoList);
        System.out.println(userDao);
    }

}
