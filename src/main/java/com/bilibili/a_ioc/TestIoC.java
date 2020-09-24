package com.bilibili.a_ioc;

import com.bilibili.a_ioc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:
 */
class TestIoC {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        userService.addUser();
//        从Spring容器中获得
        String xmlPath = "com\\bilibili\\a_ioc\\ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("userService_ioc");
        userService.addUser();
    }
}
