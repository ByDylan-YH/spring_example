package com.bilibili.h_proxy.cglib;

/**
 * Author:BY
 * Date:2020/3/15
 * Description:
 */
class Test {
    public static void main(String[] args) {
        UserServiceImpl userService = MyBeanFactory.createService();
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();
    }
}
