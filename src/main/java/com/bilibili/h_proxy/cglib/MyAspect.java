package com.bilibili.h_proxy.cglib;

/**
 * Author:BY
 * Date:2020/3/15
 * Description:
 */
class MyAspect {
    void before(){
        System.out.println("before");
    }
    void after(){
        System.out.println("after\n");
    }

}
