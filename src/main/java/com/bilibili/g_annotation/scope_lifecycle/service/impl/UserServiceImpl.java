package com.bilibili.g_annotation.scope_lifecycle.service.impl;

import com.bilibili.g_annotation.scope_lifecycle.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:
 */
@Service("userService")
@Scope("prototype")
public class UserServiceImpl implements UserService {
    private String name;

    @Override
    public void addUser() {
        System.out.println("scope");
    }
    @PostConstruct
    public void myInit(){
        System.out.println("初始化方法");
    }
    @PreDestroy
    public void myDestory(){
        System.out.println("销毁方法");
    }
}
