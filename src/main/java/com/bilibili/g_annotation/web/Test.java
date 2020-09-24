package com.bilibili.g_annotation.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:BYDylan
 * Date:2020/5/8
 * Description:
 */
class Test {
    public static void main(String[] args) {
        String xmlPath = "com/bilibili/g_annotation/web/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration.class);
        StudentAction studentAction = applicationContext.getBean("studentAction", StudentAction.class);
        studentAction.exection();
    }
}
