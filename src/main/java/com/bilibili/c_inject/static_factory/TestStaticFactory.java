package com.bilibili.c_inject.static_factory;

import com.bilibili.c_inject.static_factory.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:BY
 * Date:2020/3/13
 * Description:
 */
class TestStaticFactory {
    public static void main(String[] args) {
//        自定义工厂
//        UserService userService = MyBeanFactory.createUserService();
//        userService.addUser();
        //        从Spring容器中获得
        String xmlPath = "com/bilibili/c_inject/static_factory/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = applicationContext.getBean("userService_static_factory", UserService.class);
        userService.addUser();
    }
}
