package com.bilibili.f_config_xml.collection;

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
        String xmlPath = "com/bilibili/f_config_xml/collection/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        CollectionData customer = applicationContext.getBean("collectionData", CollectionData.class);
        System.out.println(customer);
    }
}
