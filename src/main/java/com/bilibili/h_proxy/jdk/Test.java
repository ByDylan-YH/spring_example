package com.bilibili.h_proxy.jdk;

import com.bilibili.h_proxy.jdk.service.UserService;

/**
 * Author:BY
 * Date:2020/3/15
 * Description:
 */
class Test {
    public static void main(String[] args) {
        UserService userService = MyBeanFactory.createService();
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();
    }
}
