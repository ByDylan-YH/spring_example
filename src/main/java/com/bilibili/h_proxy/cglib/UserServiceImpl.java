package com.bilibili.h_proxy.cglib;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:没有接口,只有实现类,将采用字节码增强框架,在运行时创建目标类的子类,从而达到增强
 */
public class UserServiceImpl {
    public void addUser() {
        System.out.println("cglib addUser");
    }

    void updateUser() {
        System.out.println("cglib updateUser");
    }

    void deleteUser() {
        System.out.println("cglib deleteUser");
    }
}
