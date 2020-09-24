package com.bilibili.h_proxy.jdk.service.impl;

import com.bilibili.h_proxy.jdk.service.UserService;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("proxy addUser");
    }

    @Override
    public void updateUser() {
        System.out.println("proxy updateUser");
    }

    @Override
    public void deleteUser() {
        System.out.println("proxy deleteUser");
    }
}
