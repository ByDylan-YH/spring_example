package com.bilibili.c_inject.factory.service.impl;

import com.bilibili.c_inject.factory.service.UserService;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:
 */
public class UserServiceImpl implements UserService {
    private String name;

    @Override
    public void addUser() {
        System.out.println("factory");
    }

}
