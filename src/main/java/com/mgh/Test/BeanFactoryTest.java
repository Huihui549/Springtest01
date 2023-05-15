package com.mgh.Test;

import com.mgh.dao.UserDao;
import com.mgh.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author 孟广辉
 * @version 54188
 */
public class BeanFactoryTest {
    public static void main(String[] args) {
        //1、创建工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //2、创建一个读取器（xml文件）
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        //3、读取器绑定工厂
        reader.loadBeanDefinitions("beans.xml");
        //4、根据id获取Bean实例对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        System.out.println(userService);

        UserDao userDao = (UserDao) beanFactory.getBean("userDao");
        System.out.println(userDao);
    }
}
