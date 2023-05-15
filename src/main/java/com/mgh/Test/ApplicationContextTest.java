package com.mgh.Test;

import com.mgh.dao.UserDao;
import com.mgh.service.UserService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 孟广辉
 * @version 54188
 */
public class ApplicationContextTest {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        UserService userService2 = (UserService) applicationContext.getBean("userService");
//        UserService userServi e3 = (UserService) applicationContext.getBean("userService");
//        System.out.println(userService);
//        System.out.println(userService2);
//        System.out.println(userService3);
//        Object userDao1 = applicationContext.getBean("userDao1");
//        System.out.println(userDao1);
//
//        Object userDao2 = applicationContext.getBean("userDao2");
//        System.out.println(userDao2);
//        Object userDao3 = applicationContext.getBean("userDao3");
//        System.out.println(userDao3);

        //第一种getBean方法：需要强制转换类型
//        UserService userService = (UserService) applicationContext.getBean("userService");
        //第二种getBean方法，一个类型只有一个实例，通过类名来获取bean
//        Object bean = applicationContext.getBean(UserService.class);
//        System.out.println(bean);
        //第三种getBean方法，返回对应类型的Bean
//        UserService userDao = applicationContext.getBean("userService", UserService.class);
//        System.out.println(userDao);
//        userService.show();

        //正常创建数据源
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName();
//        dataSource.setUrl();
//        dataSource.setUsername();
//        dataSource.setPassword();
//        Object connection = applicationContext.getBean("connection");
//        System.out.println(connection);
        //正常配置connection,静态工厂的静态方法获得实例对象
//        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("", "", "");

        //正常配置日期对象
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = format.parse("2023-5-15 12:00:00");
//        Object date = applicationContext.getBean("date");
//        System.out.println(date);

        //静态工厂方法
//        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        //无参构造实例化
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //实例工厂方法（非静态工厂方法）
//        SqlSessionFactory build = builder.build(in);
        Object sqlSessionFactory = applicationContext.getBean("sqlSessionFactory");
        System.out.println(sqlSessionFactory);

    }
}
