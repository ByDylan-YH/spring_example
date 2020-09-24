package com.bilibili.j_spring_aop.service.impl;

import com.bilibili.j_spring_aop.service.UserService;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("j_spring_aop addUser");
    }

    @Override
    public void updateUser() {
        System.out.println("j_spring_aop updateUser");
    }

    @Override
    public void deleteUser() {
        System.out.println("j_spring_aop deleteUser");
    }
}
