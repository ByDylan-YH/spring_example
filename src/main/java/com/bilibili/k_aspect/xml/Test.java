package com.bilibili.k_aspect.xml;

import com.bilibili.k_aspect.xml.service.UserService;
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
        String xmlPath = "com/bilibili/k_aspect/xml/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("userService_aspect");
        userService.addUser();
    }
}
