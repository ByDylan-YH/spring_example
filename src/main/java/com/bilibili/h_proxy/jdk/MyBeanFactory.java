package com.bilibili.h_proxy.jdk;

import com.bilibili.h_proxy.jdk.service.UserService;
import com.bilibili.h_proxy.jdk.service.impl.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author:BY
 * Date:2020/3/15
 * Description:
 */
class MyBeanFactory {
    static UserService createService() {
//        1.目标类
        final UserServiceImpl userService = new UserServiceImpl();
//        2.切面类
        final MyAspect myAspect = new MyAspect();
//        3.结合类
        UserService proxyService = (UserService) Proxy.newProxyInstance(
                /*
                 * 参数1:类加载器,动态代理时创建,任何类都需要类加载器加载到内存一般情况下为当前类.class.getClassLoader();或者目标类.getClass().getClassLoader()`
                 * 参数2:代理类需要实现的所有接口,一般为目标类实例.getClass().getInterfaces();这样只能获得自己的接口,无法获得父类接口
                         或者new Class[]{UserService.class}
                 * 参数3:处理类,一般采用匿名内部类,代理类的每一个方法执行时都会调用其invoke方法;
                 */
                MyBeanFactory.class.getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy 代理对象
                     * @param method 代理对象当前执行的方法的描述对象(反射)
                     * @param args 方法的实际参数
                     * @return 结果
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) {
//                1.执行前方法
                        myAspect.before();
//                2.执行目标类的方法
                        Object invoke = null;
                        try {
                            invoke = method.invoke(userService, args);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
//                3.执行后方法
                        myAspect.after();
                        return invoke;
                    }
                });

        return proxyService;
    }
}
