package com.bilibili.d_scope.service.impl;

import com.bilibili.d_scope.service.UserService;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:
 */
public class UserServiceImpl implements UserService {
    private String name;

    @Override
    public void addUser() {
        System.out.println("scope");
    }

}
