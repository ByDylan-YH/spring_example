package com.bilibili.c_inject.static_factory;

import com.bilibili.c_inject.static_factory.service.UserService;
import com.bilibili.c_inject.static_factory.service.impl.UserServiceImpl;

/**
 * Author:BY
 * Date:2020/3/13
 * Description:
 */
class MyBeanFactory {
    public static UserService createUserService(){
        return new UserServiceImpl();
    }
}
