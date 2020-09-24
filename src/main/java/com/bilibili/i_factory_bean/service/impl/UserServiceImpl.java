package com.bilibili.i_factory_bean.service.impl;

import com.bilibili.i_factory_bean.service.UserService;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("i_factory_bean addUser");
    }

    @Override
    public void updateUser() {
        System.out.println("i_factory_bean updateUser");
    }

    @Override
    public void deleteUser() {
        System.out.println("i_factory_bean deleteUser");
    }
}
