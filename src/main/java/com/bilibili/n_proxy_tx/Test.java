package com.bilibili.n_proxy_tx;

import com.bilibili.n_proxy_tx.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:BY
 * Date:2020/3/20
 * Description:事物,设置代理
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
        String xmlPath = "com/bilibili/n_proxy_tx/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
//        AccountService accoutService = applicationContext.getBean("proxyAccoutService", AccountService.class);
        AccountService accoutService = applicationContext.getBean("accoutService_proxy", AccountService.class);
        accoutService.transfer("jack", "dylan", 500);
    }
}
