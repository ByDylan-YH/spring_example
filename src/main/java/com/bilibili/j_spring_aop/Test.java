package com.bilibili.j_spring_aop;

import com.bilibili.j_spring_aop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:BY
 * Date:2020/3/15
 * Description:
 */
class Test {
    public static void main(String[] args) {
//        从Spring容器中获得
        String xmlPath = "com/bilibili/j_spring_aop/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("userService_aop");
        userService.addUser();
    }
}
