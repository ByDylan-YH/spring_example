package com.bilibili.f_config_xml.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:BY
 * Date:2020/3/13
 * Description:
 */
class Test {
    public static void main(String[] args) {
        //        从Spring容器中获得
        String xmlPath = "com/bilibili/f_config_xml/constructor/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }
}
