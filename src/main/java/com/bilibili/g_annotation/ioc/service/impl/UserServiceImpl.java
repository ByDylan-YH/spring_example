package com.bilibili.g_annotation.ioc.service.impl;

import com.bilibili.g_annotation.ioc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:
 */
@Service("userService_ioc")
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("annotation ioc add user");
    }
}
