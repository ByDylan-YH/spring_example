package com.bilibili.d_scope;

import com.bilibili.d_scope.service.UserService;
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
        String xmlPath = "com/bilibili/d_scope/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = applicationContext.getBean("userService_d_scope", UserService.class);
        UserService userService2 = applicationContext.getBean("userService_d_scope", UserService.class);
//        没有设置scope,单例模式,打印的应该一样
        System.out.println(userService);
        System.out.println(userService2);
    }
}
