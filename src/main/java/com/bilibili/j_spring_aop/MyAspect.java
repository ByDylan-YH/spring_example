package com.bilibili.j_spring_aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Author:BY
 * Date:2020/3/15
 * Description:切面类确定通知,需要实现接口规范,一般采用环绕通知
 */

class MyAspect implements MethodInterceptor {
    void before() {
        System.out.println("before");
    }

    void after() {
        System.out.println("after\n");
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        before();
        //        需要手动执行目标方法
        Object proceed = methodInvocation.proceed();
        after();
        return proceed;
    }
}