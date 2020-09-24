package com.bilibili.e_lifecycle;

import com.bilibili.e_lifecycle.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

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
        String xmlPath = "com/bilibili/e_lifecycle/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = applicationContext.getBean("userService_e_lifecycle", UserService.class);
        userService.addUser();
//        1.要执行销毁方法,容器必须关闭;2.必须是单例的
        try {
//            此方法接口没有定义,实现类中有提供
            applicationContext.getClass().getMethod("close").invoke(applicationContext);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
