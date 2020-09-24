package com.bilibili.g_annotation.scope_lifecycle;

import com.bilibili.g_annotation.scope_lifecycle.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * Author:BY
 * Date:2020/3/13
 * Description:
 */
class Test {
    public static void main(String[] args) {
//        1.创建自定义实例工厂
//        MyBeanFactory myBeanFactory = new MyBeanFactory();
//        2.通过工厂获得对象
//        UserService userService = myBeanFactory.createUserService();
//        userService.addUser();
        //        从Spring容器中获得
        String xmlPath = "com/bilibili/g_annotation/scope_lifecycle/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        UserService userService1 = applicationContext.getBean("userService", UserService.class);
//        userService.addUser();

//        1.要执行销毁方法,容器必须关闭;2.必须是单例的
        try {
//            此方法接口没有定义,实现类中有提供
            applicationContext.getClass().getMethod("close").invoke(applicationContext);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
//        没有设置scope,单例模式,打印的应该一样
//        System.out.println(userService);
//        System.out.println(userService1);

    }
}
