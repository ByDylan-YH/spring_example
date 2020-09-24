package com.bilibili.m_tx;

import com.bilibili.m_tx.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:BY
 * Date:2020/3/20
 * Description:事物
 * create table account(
 * id int primary key auto_increment,
 * username varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '用户名',
 * money int COLLATE utf8mb4_general_ci
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 *
 * insert into account values (null,'jack',1000);
 * insert into account values (null,'dylan',1000);
 *
 * select * from account;
 */
class Test {
    public static void main(String[] args) {
        String xmlPath = "com/bilibili/m_tx/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        AccountService accoutService = applicationContext.getBean("accoutService", AccountService.class);
        accoutService.transfer("dylan", "jack", 500);
    }
}
