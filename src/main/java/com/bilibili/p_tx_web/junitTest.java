package com.bilibili.p_tx_web;

import com.bilibili.p_tx_web.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Author:BY
 * Date:2020/3/20
 * Description:事物,设置代理
 * drop table if exists account;
 * create table account(
 * id int primary key auto_increment,
 * username varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '用户名',
 * money int COLLATE utf8mb4_general_ci
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 * <p>
 * insert into account values (null,'jack',1000);
 * insert into account values (null,'dylan',1000);
 * <p>
 * select * from account;
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:com/bilibili/p_tx_web/ApplicationContext.xml")
public class junitTest {
    @Autowired
    private AccountService accountService;

//    public static void main(String[] args) {
//        String xmlPath = "bilibili/o_tx_anno/ApplicationContext.xml";
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
//        factory-bean 半自动
//        AccountService accountService = applicationContext.getBean("proxyAccoutService", AccountService.class);
//        aop 全自动
//        AccountService accountService = applicationContext.getBean("accoutService_proxy", AccountService.class);
//        注解
//        AccountService accountService = applicationContext.getBean("accoutService_anno", AccountService.class);
//        accountService.transfer("jack", "dylan", 500);
//    }

    @Test
    public void junitDemo() {
//        accountService.transfer("jack", "dylan", 500);
        accountService.transfer("dylan", "jack", 500);
    }
}
