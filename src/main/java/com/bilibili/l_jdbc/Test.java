package com.bilibili.l_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:BY
 * Date:2020/3/20
 * Description:
 *
 * CREATE TABLE `user` (
 *   `id` int COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT 'id',
 *   `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '用户名',
 *   `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '密码'
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 * insert into user values (1,'root','By960122');
 * select * from user;
 */
class Test {
    public static void main(String[] args) {
//        1.创建数据源
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/bingo?useSSL=false&characterEncoding=UTF-8");
//        dataSource.setUsername("root");
//        dataSource.setPassword("By921644606");
//        2.创建模板
//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//        jdbcTemplate.setDataSource(dataSource);
//        3.通过api操作
//        jdbcTemplate.update("insert into user values (?,?,?);","2","root","By921644606");

        //        从Spring容器中获得
        String xmlPath = "com/bilibili/l_jdbc/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = applicationContext.getBean("userdao", UserDao.class);
        userDao.update();

    }
}
