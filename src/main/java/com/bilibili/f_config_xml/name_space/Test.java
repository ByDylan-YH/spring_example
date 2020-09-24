package com.bilibili.f_config_xml.name_space;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:
 */
class Test {
    public static void main(String[] args) {
        //        从Spring容器中获得
        String xmlPath = "com/bilibili/f_config_xml/name_space/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        Person person = applicationContext.getBean("personname_space", Person.class);
        System.out.println(person);
    }
}
