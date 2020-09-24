package com.bilibili.i_factory_bean;

import com.bilibili.i_factory_bean.service.UserService;
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
        String xmlPath = "com/bilibili/i_factory_bean/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("proxyService");
        userService.addUser();
    }
}
