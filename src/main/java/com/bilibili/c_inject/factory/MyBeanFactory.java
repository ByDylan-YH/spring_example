package com.bilibili.c_inject.factory;

import com.bilibili.c_inject.factory.service.UserService;
import com.bilibili.c_inject.factory.service.impl.UserServiceImpl;

/**
 * Author:BY
 * Date:2020/3/13
 * Description:
 */
class MyBeanFactory {
    public UserService createUserService(){
        return new UserServiceImpl();
    }
}
