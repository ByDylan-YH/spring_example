package com.bilibili.k_aspect.annotation.service.impl;

import com.bilibili.k_aspect.annotation.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:
 */
@Service("UserService_anno")
public class UserServiceImpl implements UserService {
    @Override
    public String addUser() {
        System.out.println("k_aspect annotation addUser");
//        int i = 1 / 0;
        return "return";
    }

    @Override
    public void updateUser() {
        System.out.println("k_aspect annotation updateUser");
    }

    @Override
    public void deleteUser() {
        System.out.println("k_aspect annotation deleteUser");
    }
}
