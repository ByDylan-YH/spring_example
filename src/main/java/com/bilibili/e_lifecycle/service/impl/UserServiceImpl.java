package com.bilibili.e_lifecycle.service.impl;

import com.bilibili.e_lifecycle.service.UserService;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:
 */
class UserServiceImpl implements UserService {
    private String name;

    @Override
    public void addUser() {
        System.out.println("lifecycle");
    }
    public void myInit(){
        System.out.println("初始化方法");
    }
    public void myDestory(){
        System.out.println("销毁方法");
    }

}
