package com.bilibili.a_ioc.service.impl;

import com.bilibili.a_ioc.service.UserService;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:
 */
class UserServiceImpl implements UserService {
    private String name;

    @Override
    public void addUser() {
        System.out.println("add user");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
