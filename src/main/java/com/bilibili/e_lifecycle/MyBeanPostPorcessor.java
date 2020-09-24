package com.bilibili.e_lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author:BY
 * Date:2020/3/14
 * Description:
 */
class MyBeanPostPorcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("前方法: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后方法: " + beanName);
        // 生成jdk代理
        return Proxy.newProxyInstance(MyBeanPostPorcessor.class.getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
                // 执行目标方法
                System.out.println("开启事物");
                Object invoke = method.invoke(bean, args);
                System.out.println("提交事物");
                return invoke;
            }
        });
    }
}
