package com.bilibili.h_proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * Author:BY
 * Date:2020/3/15
 * Description:
 */
class MyBeanFactory {
    static UserServiceImpl createService() {
//        1.目标类
        final UserServiceImpl userService = new UserServiceImpl();
//        2.切面类
        final MyAspect myAspect = new MyAspect();
//        3.代理类
//        3.1核心类
        Enhancer enhancer = new Enhancer();
//        3.2确定父类
        enhancer.setSuperclass(userService.getClass());
//        3.3设置回调函数
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
            myAspect.before();
            Object invoke = method.invoke(userService, objects);
//                执行代理类的父类,即目标类
//                methodProxy.invokeSuper(o, objects);
            myAspect.after();
            return invoke;
        });
//        3.4创建代理
        UserServiceImpl proxService = (UserServiceImpl) enhancer.create();

        return proxService;
    }
}
