package com.bilibili.c_inject.factory;

import com.bilibili.c_inject.factory.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:BY
 * Date:2020/3/13
 * Description:
 */
class TestFactory {
    public static void main(String[] args) {
//        1.创建自定义实例工厂
//        MyBeanFactory myBeanFactory = new MyBeanFactory();
//        2.通过工厂获得对象
//        UserService userService = myBeanFactory.createUserService();
//        userService.addUser();
        //        从Spring容器中获得
        String xmlPath = "com/bilibili/c_inject/factory/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = applicationContext.getBean("userService_factory", UserService.class);
        userService.addUser();
    }
}
