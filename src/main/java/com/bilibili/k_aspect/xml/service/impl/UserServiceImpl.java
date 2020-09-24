package com.bilibili.k_aspect.xml.service.impl;

import com.bilibili.k_aspect.xml.service.UserService;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:
 */
public class UserServiceImpl implements UserService {
    @Override
    public String addUser() {
        System.out.println("xml addUser");
//        int i = 1 / 0;
        return "return";
    }

    @Override
    public void updateUser() {
        System.out.println("xml updateUser");
    }

    @Override
    public void deleteUser() {
        System.out.println("xml deleteUser");
    }
}
