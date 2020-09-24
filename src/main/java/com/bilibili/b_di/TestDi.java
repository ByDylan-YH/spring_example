package com.bilibili.b_di;

import com.bilibili.b_di.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:
 */
class TestDi {
    public static void main(String[] args) {
        //        从Spring容器中获得
        String xmlPath = "com/bilibili/b_di/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        BookService bookService = (BookService) applicationContext.getBean("bookService");
        bookService.addBook();
    }
}
